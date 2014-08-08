# ayurbaby_food.sql
# 
# 6/6/14 - PJD 
# 
# Change log:
# 6/19/14 - Remove foreign key stage_id 
# 6/22/14 Removed Foreign Key "stage_id integer not null"
# 6/22/14 - Added groupId to group food to month
#
DROP TABLE IF EXISTS ayurbaby_funfacts;

CREATE TABLE ayurbaby_funfacts (
	
	# surogate primary key
	id integer AUTO_INCREMENT PRIMARY KEY,
	
	compound_id integer not null,
	
	#questions
	question varchar(512) NOT NULL DEFAULT '',

	#answer
	answer TEXT NOT NULL,
	
	last_edit timestamp not null default current_timestamp on update current_timestamp

	
) ENGINE=innoDB DEFAULT CHARSET=utf8;
