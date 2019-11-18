#! /bin/bash
#
# Generated during deployment training
#

jar xf /tmp/training/*.jar &
rm -rf /tmp/training/*.jar &

mv /tmp/training/*.jar /busdata/dgvt/dif0/apis/training/chillyset.jar &
rm -rf /tmp/training/* &
chmod 755 /busdata/dgvt/dif0/apis/training/*

if [ $? -eq 0 ]
then
  echo "Successfully executed script"
  exit 0
else
  # Redirect stdout from echo command to stderr.
  echo "Script exited with error." >&2
  exit 1
fi
