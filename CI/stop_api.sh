#! /bin/bash
#
# Generated during deployment
#
# This script is called by init scripts to stop the Training application component

# exit status = 0   SUCCESS
# exit status <> 0  FAILED
#
RETVAL=0

if [ "`whoami`" != "dgvtdif0" ]
then
    echo "ERROR : This script must be launched by dgvtdif0 owner only !"
    exit 100
fi

kill `cat /busdata/dgvt/dif0/apis/training/api.pid`
rm -f /busdata/dgvt/dif0/apis/training/api.pid
RETVAL=$?

exit $RETVAL
