DROP TABLE IF EXISTS ayurbaby_stage_ayurved;
CREATE TABLE ayurbaby_stage_ayurved(

	id integer AUTO_INCREMENT PRIMARY KEY,
	
	stage_id integer not null,
	
	ayurved_id integer not null,

	FOREIGN KEY(stage_id) REFERENCES ayurbaby_stages(id),
	
	FOREIGN KEY(ayurved_id) REFERENCES ayurbaby_ayurved(id)

)ENGINE=innoDB DEFAULT CHARSET=utf8;

