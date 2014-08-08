# ayurbaby_food.sql
# 
# 6/6/14 - PJD 
# 
# Change log : 06/18/14
# Remove foreign key stage_id 
# 06/24/14 - removed stage_id
# 06/24/14 - added group_id
# 07/08/14 - removed group_id field
#

DROP TABLE IF EXISTS ayurbaby_ayurved;

CREATE TABLE ayurbaby_ayurved (
	
	# surogate primary key
	id integer AUTO_INCREMENT PRIMARY KEY,

	#stage_id integer not null,	

	#group_id varchar(32) NOT NULL DEFAULT '',

	#ayurvedic String value 
	ayurvedic_med varchar(64) NOT NULL DEFAULT '',

	#prepmethod String value
        prepmethod varchar(512) NOT NULL DEFAULT '',
	
	#nutritional_value String value
	nutritional_value varchar(512) NOT NULL DEFAULT '',
	
	#foetus Development 
	foetus_dev varchar(512) NOT NULL DEFAULT '',

	last_edit timestamp not null default current_timestamp on update current_timestamp
	#FOREIGN KEY (stage_id) REFERENCES ayurbaby_stages(id)

) ENGINE=innoDB DEFAULT CHARSET=utf8;
