package com.ect.nrac.cmc.sms;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicInteger;

import com.ect.bpc.sms.cnst.SmsCnst;
/**
 * 
 * @author wucg
 * @since 2018-3-8
 * 
 */
public class IdGenerator {  
    private static AtomicInteger systemIdSeq = new AtomicInteger(1000);
    
    /**
     * 2位渠道编号+4位系统编号+2位系统节点号+8位交易日期（yyyymmdd）+ 6位时间戳（hhmmss）+4位顺序流水号
     * @return
     */
    public static String channelId() {
        StringBuilder appender = new StringBuilder(26);
        long sequence = nextSeq_4();
        String timestamp = Timestamp.currentTime();
        appender.append(SmsCnst.CHANNEL_CODE)
        	    .append(SmsCnst.SYSTEM_CODE)
        	    .append(SmsCnst.SYSTEM_NODE_ID)
        	    .append(timestamp)
        	    .append(sequence);
        return appender.toString();
    }

    /**
     * 4位系统编号+2位系统节点号+8位系统日期（yyyymmdd）+ 6位时间戳（hhmmss）+4位请求流水号（流水号位数不足左补零）
     * @return
     */
    public static String systemId() {
        StringBuilder appender = new StringBuilder(24);
        String timestamp = Timestamp.currentTime();
        appender.append(SmsCnst.SYSTEM_CODE)
                .append(SmsCnst.SYSTEM_NODE_ID)
                .append(timestamp)
                .append(getSystemIdSeq());
        return appender.toString();
    }
    
    private static int getSystemIdSeq(){
        for (; ; ) {
            int current = systemIdSeq.get();
            int next = (current > 9000) ? 1000 : current + 1;
            if (systemIdSeq.compareAndSet(current, next))
                return next;
        }
    }

    private static int nextSeq_4() {
        return (int) ((Math.random() * 9 + 1) * 1000);
    }
    
    private static class Timestamp {
        private static ThreadLocal<DateFormat> DATA_FORMAT = new ThreadLocal<DateFormat>() {
            @Override
            public DateFormat get() {
                return super.get();
            }

            @Override
            protected DateFormat initialValue() {
                DateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");
                df.setTimeZone(TimeZone.getTimeZone("GMT+08"));
                df.setLenient(false);
                return df;
            }

            @Override
            public void remove() {
                super.remove();
            }

            @Override
            public void set(DateFormat value) {
                super.set(value);
            }

        };

        private static synchronized String currentTime() {
            return DATA_FORMAT.get().format(System.currentTimeMillis());
        }
    }

    
}
