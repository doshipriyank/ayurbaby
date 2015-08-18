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
. ${HOME}/ayurbaby_working/database/sbin/environment.sh

#initialize tables in the database
mysql DATABASE < SQL_DIR/ayurbaby_users.sql 
mysql DATABASE < SQL_DIR/ayurbaby_user_stages.sql 
mysql DATABASE < SQL_DIR/ayurbaby_stage
mysql DATABASE < SQL_DIR/ayurbaby_stages.sql 
mysql DATABASE < SQL_DIR/ayurbaby_nutritionalfood.sql 
mysql DATABASE < SQL_DIR/ayurbaby_ayurved.sql 
mysql DATABASE < SQL_DIR/ayurbaby_stage_ayurved.sql 
mysql DATABASE < SQL_DIR/ayurbaby_stage_nutritionalfood.sql  
