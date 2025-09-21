-- Pls create this tables with relation
----------------------------------------
-- create Employee with 
-- id name age

CREATE TABLE Employee (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    age INT NOT NULL
);


-- create Phone with
-- id phoneNumber 

CREATE TABLE Phone (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    phoneNumber VARCHAR(20) NOT NULL,
    employee_id INT NOT NULL,
    FOREIGN KEY (employee_id) REFERENCES Employee(id) ON DELETE CASCADE,
    UNIQUE (employee_id)
);

-- Employee has only Phone
-- Phone has only Employee