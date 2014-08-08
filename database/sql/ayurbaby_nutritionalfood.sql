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
	id integer AUTO_INCREMENT PRIMARY KEY,

	# not required	
	#stage_id integer not null,
        
	# not required
       	#group_id varchar(32) NOT NULL DEFAULT '',
	
	#food: String value 
	food varchar(512) NOT NULL DEFAULT '',

	#food: String value
        fruits varchar(512) NOT NULL DEFAULT '',
	
	#prepmethod: String value
	prepmethod varchar(512) NOT NULL DEFAULT '',

	#nutritional value String value
	nutritional_value  varchar(512) NOT NULL DEFAULT '',

	#nutritional value String value
	warnings  varchar(512) NOT NULL DEFAULT '',

	#prepmethod: String value
	foetus_dev varchar(512) NOT NULL DEFAULT '',

	last_edit timestamp not null default current_timestamp on update current_timestamp

        #FOREIGN KEY (stage_id) REFERENCES ayurbaby_stages(id)
	
) ENGINE=innoDB DEFAULT CHARSET=utf8;

#create unique index ayurbaby_nutritionalfood_food_idx on ayurbaby_nutritionalfood(food(16)); 

#create unique index ayurbaby_nutritionalfood_fruits_idx on ayurbaby_nutritionalfood(fruits(16)); 
