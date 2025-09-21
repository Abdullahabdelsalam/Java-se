

-- PLS create Player table with
-- id name age
-- make id not null
-- make id unique
-- make name unique
CREATE TABLE Player (
    id INT NOT NULL UNIQUE,
    name VARCHAR(100) UNIQUE,
    age INT,
    PRIMARY KEY (id)  
);

----------------------------------------------------
--pls create Manger with
--id name salary
--id must be not null
--id and name must be unique together

CREATE TABLE Manager (
    id INT NOT NULL,
    name VARCHAR(100),
    salary DECIMAL(10, 2),
    PRIMARY KEY (id),
    UNIQUE (id, name) 
);

-------------------------------------------------
-- pls create Manger with
--id name age
--make id not null and unique (Primary Key)

CREATE TABLE Manager (
    id INT NOT NULL UNIQUE,  
    name VARCHAR(100),
    age INT,
    PRIMARY KEY (id)  
------------------------------------------------