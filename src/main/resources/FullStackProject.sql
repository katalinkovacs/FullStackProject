Drop table Tacher;

Drop table Child;


CREATE TABLE Teacher (
id INT(2) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(30) NOT NULL
);

CREATE TABLE Child (
id INT(2) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
fullName VARCHAR(30) NOT NULL,
ageMonth INT(2)
);

INSERT INTO Teacher (name)
VALUES
 ("Besset"),
 ("Simone"),
 ("Rhonda"),
 ("Connie"),
 ("Punam"),
 ("Sirayah"),
 ("Ruby");

 Select * From Teacher;

INSERT INTO Child (fullName, ageMonth)
VALUES
 ("Sebi", 40),
 ("Reid", 40),
 ("Rory", 38),
 ("Harry", 12),
 ("Amelia", 10),
 ("Bulcsu", 23),
("Reka", 9),
 ("Dori", 8),
 ("Rita", 6),
 ("Oliver", 18),
 ("Kornel", 24);

Select * From Child;
Select * From Teacher;


