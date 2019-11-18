#! /bin/bash

RETVAL=0

if [ "`whoami`" != "dgvtdif0" ]
then
    echo "ERROR : This script must be launched by tdifgbl1 owner only !"
    exit 100
fi


PID=`ps -ef | grep chillyset.jar | grep -v grep | awk '{print $2}'`
echo $PID
if [ -z $PID ]
then
    java -jar /busdata/dgvt/dif0/apis/training/chillyset.jar > /dev/null 2>&1 &
    RETVAL=$?
    PID=`ps -ef | grep chillyset.jar | grep -v grep | awk '{print $2}'`
    echo $PID > /busdata/dgvt/dif0/apis/training/api.pid
else
    echo $PID
    echo $PID > /busdata/dgvt/dif0/apis/training/api.pid
fi

exit $RETVAL
