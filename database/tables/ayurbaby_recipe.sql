# ayurbaby_food.sql
# 
# 6/6/14 - PJD 
# 
# Change log : 06/18/14
# Remove foreign key stage_id 
# 06/24/14 - removed stage_id
# 06/24/14 - added group_id
# 07/08/14 - removed group_id field

DROP TABLE IF EXISTS ayurbaby_recipe;

CREATE TABLE ayurbaby_recipe (
	
	# surogate primary key
	id integer auto_increment primary key,

	#medicine string value
	name varchar(20000) not null default '',

	#prepmethod String value
        recipe text not null default '',
	
	#recipes string value
	benefit text not null default '',
	
	#warnings string value
	types varchar(64) not null default '',

	last_edit timestamp not null default current_timestamp on update current_timestamp

) ENGINE=innoDB DEFAULT CHARSET=utf8;
