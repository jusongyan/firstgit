#! /bin/sh
export JAVA_HOME=/usr/java7_64/jdk1.7.0_80

JAVA_OPTIONS="${JAVA_OPTIONS} -Dcom.sun.management.jmxremote.port=6799"
JAVA_OPTIONS="${JAVA_OPTIONS} -Dcom.sun.management.jmxremote.ssl=false"
JAVA_OPTIONS="${JAVA_OPTIONS} -Dcom.sun.management.jmxremote.authenticate=false"
JAVA_OPT=" -server -d64 -Xms1024m -Xmx1024m "

${JAVA_HOME}/bin/java \
${JAVA_OPT} \
-DBPC-SMS-01 \
-Dspring.config.location=./config/application.properties \
-classpath ./:./config::`echo $(find ./lib)|sed 's/ /:/g'` \
com.ect.bpc.sms.main.BpcSmsMain >>/dev/null 2>&1 &
