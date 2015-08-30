#
#
#
#DROP TABLE IF EXISTS ayurbaby_user_stages;
#CREATE TABLE ayurbaby_user_stages(

#	id integer not null,
	
#	stage_id integer not null,
	
#	user_id integer not null,

#	FOREIGN KEY(stage_id) REFERENCES ayurbaby_stages(id),
	
#	FOREIGN KEY(user_id) REFERENCES ayurbaby_users(id)

#)ENGINE=innoDB DEFAULT CHARSET=utf8;

#create unique index ayurbaby_user_stages_idx on ayurbaby_user_stages(id);
