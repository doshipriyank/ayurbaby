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

	#username is email address
	username varchar(64) NOT NULL DEFAULT '',

	#password(hash of real password)
	pword varchar(80) NOT NULL DEFAULT '',
	
	fullname varchar(64) NOT NULL DEFAULT '',
	
	phone varchar(64) NOT NULL DEFAULT '',
	
	last_edit timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
	
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

create unique index ayurbaby_users_username_idx on ayurbaby_users(username);
