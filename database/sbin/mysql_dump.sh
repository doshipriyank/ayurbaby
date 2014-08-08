#!/bin/bash
# 
# @author pdoshi
# Date : 07/31/2014
# 
# mysql dump tables and backup date into weekly backup dir.
# 
#    
#

# source variables definedin env file
. ${HOME}/apps/db/babycare/sbin/environment.sh


DATE=`date "+%a"`

DUMP_DIR=${DATE} 

if [ -d ${HOME}/${DB_DIR}/${BACKUP_DIR}/${DUMP_DIR} ]
then
	echo "DIR exists - ${HOME}/${DB_DIR}/${BACKUP_DIR}/${DUMP_DIR}"
else
	echo "create mysql backup dir - ${HOME}/${DB_DIR}/${BACKUP_DIR}/${DUMP_DIR}"
	mkdir -p  ${HOME}/${DB_DIR}/${BACKUP_DIR}/${DUMP_DIR}
fi

mysql -e "show tables from babycare" | grep -v "Tables_in_babycare" | sort -r |  while read table;do  

echo "Mysql dumping Table - ${table}"
mysqldump babycare ${table} > ${HOME}/${DB_DIR}/${BACKUP_DIR}/${DUMP_DIR}/${table}.sql

done 
