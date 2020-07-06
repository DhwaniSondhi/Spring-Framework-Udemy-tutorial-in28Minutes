CREATE TABLE PERSON
(
	ID integer not null,
	NAME varchar(255) not null,
	LOCATION varchar(255),
	BIRTH_DATE timestamp,
	primary key(ID)
);

INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE) VALUES(1001, 'Tans', 'Allabad', sysdate());
INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE) VALUES(1002, 'Dhwani', 'Montreal', sysdate());
INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE) VALUES(1003, 'Sahaj', 'New York', sysdate());
INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE) VALUES(1004, 'Neeru', 'Mumbai', sysdate());