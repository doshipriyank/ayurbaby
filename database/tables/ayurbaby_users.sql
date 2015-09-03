# ayurbaby_users.sql
# @author : PJD - 6/6/2014
# Description: ayurbaby_users table to add user profile info 
# from facebook and google. 
#

DROP TABLE IF EXISTS ayurbaby_users;

CREATE TABLE ayurbaby_users (
	#Surrogate Primary Key
	id integer AUTO_INCREMENT PRIMARY KEY,
	
	#auth_id facebook or google
	auth_id integer NOT NULL DEFAULT 0,	
	
	firstname varchar(64) NOT NULL DEFAULT '',
	
	lastname varchar(64) NOT NULL DEFAULT '',
	
	lastmenperiod varchar(64) NOT NULL DEFAULT '',
	
	#email can be used as username
	email varchar(80) UNIQUE NOT NULL,

	#location name
	location varchar(128) NOT NULL DEFAULT '',
	
	#phone number
	phone varchar(32) NOT NULL DEFAULT '',
	
	#birthdate
	birthdate varchar(16) NOT NULL DEFAULT '',
	
	#source - provenance from login type
	provenance varchar(16) NOT NULL DEFAULT '',
	
	#source - duedate
	duedate varchar(16) NOT NULL DEFAULT '',
	
	notification TINYINT(1) NOT NULL DEFAULT 0,
	
	stage_id int(1) NOT NULL DEFAULT 0,

	#source - device registration_id 
	registration varchar(2048) NOT NULL DEFAULT '',

	last_edit timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
	
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

create unique index ayurbaby_users_email_idx on ayurbaby_users(email);
