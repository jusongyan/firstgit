package com.ect.bpc.sms.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

import com.ect.nrac.cmc.util.Logger;
@ComponentScan("com.ect.bpc.sms")
@SpringBootApplication(exclude =  {SecurityAutoConfiguration.class})
public class BpcSmsMain {
	static final Logger LOG = Logger.getLogger(BpcSmsMain.class);
	
	public static void main(String[] args) throws InterruptedException {
		LOG.info("短信通知模块启动--开始!");
		SpringApplication.run(BpcSmsMain.class, args);
		LOG.info("短信通知模块启动--成功!");
	}
}
