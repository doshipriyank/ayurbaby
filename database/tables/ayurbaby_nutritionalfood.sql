# ayurbaby_food.sql
# 
# 6/6/14 - PJD 
# 
# Change log:
# 6/19/14 - Remove foreign key stage_id 
# 6/22/14 Removed Foreign Key "stage_id integer not null"
# 6/22/14 - Added groupId to group food to month
# 7/8/15 - removed group_id field. not reuired for m - n realtionship
#


DROP TABLE IF EXISTS ayurbaby_nutritionalfood;

CREATE TABLE ayurbaby_nutritionalfood (
	
	# surogate primary key
	id integer auto_increment primary key,
	
	#food: String value 
	food varchar(512) not null default '',

	#food: String value
        benefit text not null default '',
	
	warning text not null default '',

	last_edit timestamp not null default current_timestamp on update current_timestamp

        #FOREIGN KEY (stage_id) REFERENCES ayurbaby_stages(id)
	
) ENGINE=innoDB DEFAULT CHARSET=utf8;
