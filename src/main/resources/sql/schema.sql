DROP TABLE IF EXISTS users;

CREATE TABLE users (
  id int(11) NOT NULL AUTO_INCREMENT,
  first_name varchar(20) UNIQUE NOT NULL,
  last_name varchar(20) NOT NULL,
  email varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
)
