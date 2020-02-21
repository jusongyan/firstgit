#! /bin/sh   

if [ $# != 3 ] ; then 
	echo "USAGE: $0 name phone text" 
	echo " e.g.: $0 张三 13586952888 你好！" 
	exit 1; 
fi 

name=$1
phone=$2
text=$3

URL=http://127.0.0.1:18080/bpc/sendSms

param='param={"content":"'$text'","phone":"'$phone'","name":"'$name'"}'

wget --post-data="${param}" ${URL}

echo $?