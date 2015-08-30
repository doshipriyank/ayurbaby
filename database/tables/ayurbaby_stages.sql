# @author PJD 06-15-14
# 
# 
#
#
#

DROP TABLE IF EXISTS ayurbaby_stages;

CREATE TABLE ayurbaby_stages(

	id integer auto_increment PRIMARY KEY,
	
	month VARCHAR(10) not null,

	week varchar(5) not null default '',

	last_edit timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
	
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

create unique index ayurbaby_stages_month_idx on ayurbaby_stages(month);
