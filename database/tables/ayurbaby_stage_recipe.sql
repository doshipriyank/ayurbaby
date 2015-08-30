DROP TABLE IF EXISTS ayurbaby_stage_recipe;

CREATE TABLE ayurbaby_stage_recipe(

	id integer AUTO_INCREMENT PRIMARY KEY,
	
	stage_id integer not null,
	
	recipe_id integer not null,

	FOREIGN KEY(stage_id) REFERENCES ayurbaby_stages(id),
	
	FOREIGN KEY(recipe_id) REFERENCES ayurbaby_recipe(id)

)ENGINE=innoDB DEFAULT CHARSET=utf8;

