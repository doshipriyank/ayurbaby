# ayurbaby_compound.sql
# 
# 6/6/14 - PJD 
# 
# Change log:
# 7/02/14 - created ayurbaby_compound
#
DROP TABLE IF EXISTS ayurbaby_compound;

CREATE TABLE ayurbaby_compound (
	
	# surogate primary key
	id integer AUTO_INCREMENT PRIMARY KEY,

	#answer
	organic_compound VARCHAR(64) NOT NULL DEFAULT '',
	
	last_edit timestamp not null default current_timestamp on update current_timestamp

	
) ENGINE=innoDB DEFAULT CHARSET=utf8;
