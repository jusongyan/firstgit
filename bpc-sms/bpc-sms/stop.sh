#! /bin/sh

PID=$(ps -fu `whoami`|grep BPC-SMS-01|grep -v grep|awk '{print $2}')

if [ x$PID != x ] ;then
	kill -9 $PID
fi
