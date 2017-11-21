CREATE TABLE actions
(id BIGINT auto_increment PRIMARY KEY,
 category VARCHAR(30),
 content VARCHAR(1000),
 author VARCHAR(30),
 rank SMALLINT,
 published BOOLEAN);
