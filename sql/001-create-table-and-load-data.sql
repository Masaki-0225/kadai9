DROP TABLE IF EXISTS names;

CREATE TABLE names (
  id int unsigned AUTO_INCREMENT,
  name VARCHAR(50) NOT NULL,
  age int NOT NULL,
  PRIMARY KEY(id)
);

INSERT INTO names (id, name, age) VALUES (1, "hirakawa", 31);
INSERT INTO names (id, name, age) VALUES (2, "iwauti", 24);
INSERT INTO names (id, name, age) VALUES (3, "okamoto", 20);
INSERT INTO names (id, name, age) VALUES (4, "musiake", 44);