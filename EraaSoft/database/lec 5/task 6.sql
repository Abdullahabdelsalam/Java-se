-- Pls create this tables with relation
----------------------------------------
-- create Teacher with 
-- id name salary

CREATE TABLE Teacher (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    salary DECIMAL(10, 2) NOT NULL,
    language_id INT NOT NULL, 
    FOREIGN KEY (language_id) REFERENCES Language(id) ON DELETE CASCADE
);


-- create Language with
-- id name 

CREATE TABLE Language (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL UNIQUE
);


-- Teacher has only Language
-- Language has many Teacher