#!/bin/bash
# Assumptions:
#   Default PATH
#   Default mysql (/usr/bin/mysql)
#   MySQL instance connection managed in $HOME/.my.cnf#


#import env file
. ${HOME}/apps/db/babycare/sbin/environment.sh


SQL_DIR=`ls -t ${HOME}/${DB_DIR}/${BACKUP_DIR} | head -1`

mysql babycare < ${HOME}/${DB_DIR}/${BACKUP_DIR}/${SQL_DIR}/ayurbaby_nutritionalfood.sql
mysql babycare < ${HOME}/${DB_DIR}/${BACKUP_DIR}/${SQL_DIR}/ayurbaby_stage_nutritionalfood.sql
mysql babycare < ${HOME}/${DB_DIR}/${BACKUP_DIR}/${SQL_DIR}/ayurbaby_ayurved.sql
mysql babycare < ${HOME}/${DB_DIR}/${BACKUP_DIR}/${SQL_DIR}/ayurbaby_stage_ayurved.sql
mysql babycare < ${HOME}/${DB_DIR}/${BACKUP_DIR}/${SQL_DIR}/ayurbaby_funfacts.sql
mysql babycare < ${HOME}/${DB_DIR}/${BACKUP_DIR}/${SQL_DIR}/ayurbaby_compound.sql
mysql babycare < ${HOME}/${DB_DIR}/${BACKUP_DIR}/${SQL_DIR}/ayurbaby_stages.sql
mysql babycare < ${HOME}/${DB_DIR}/${BACKUP_DIR}/${SQL_DIR}/ayurbaby_users.sql
