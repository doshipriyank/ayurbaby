DROP TABLE IF EXISTS ayurbaby_stage_nutritionalfood;

CREATE TABLE ayurbaby_stage_nutritionalfood(

	id integer auto_increment primary key,
	
	stage_id integer not null,
	
	nutritionalfood_id integer not null,

	FOREIGN KEY(stage_id) REFERENCES ayurbaby_stages(id),
	
	FOREIGN KEY(nutritionalfood_id) REFERENCES ayurbaby_nutritionalfood(id)

)ENGINE=innoDB DEFAULT CHARSET=utf8;

