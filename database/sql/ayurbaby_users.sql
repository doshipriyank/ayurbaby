# ayurbaby_users.sql
# 6/6/2014
#
# Use: ayurbaby app auhtentication
#
# 
#
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
	email varchar(80) NOT NULL DEFAULT '',

	#location name
	location varchar(128) NOT NULL DEFAULT '',
	
	#phone number
	phone varchar(32) NOT NULL DEFAULT '',
	
	#birthdate
	birthdate varchar(16) NOT NULL DEFAULT '',
	
	#duedate
	duedate varchar(16) NOT NULL DEFAULT '',
	
	notification TINYINT(1) NOT NULL ZEROFILL,
		
	last_edit timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
	
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

create unique index ayurbaby_users_username_idx on ayurbaby_users(username);
