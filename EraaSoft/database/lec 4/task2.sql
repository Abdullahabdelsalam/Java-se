

-- Q1. Use REPLACE to replace the letter 'a' with '@' in the word 'database'.

SELECT REPLACE('database', 'a', '@') AS replaced_text;

-- Q2. Use REPLACE to replace a full word in a string (e.g., "old" with "new").

SELECT REPLACE('This is the old version', 'old', 'new') AS updated_string;

-- Q3. Create a table PRODUCT with a product_name column, and insert 3 sample products.

CREATE TABLE PRODUCT (
    product_name VARCHAR(50)
);

INSERT INTO PRODUCT (product_name) VALUES ('Laptop');
INSERT INTO PRODUCT (product_name) VALUES ('Smartphone');
INSERT INTO PRODUCT (product_name) VALUES ('Tablet');


-- Q4. Use LPAD to format product names to 15 characters by padding with '*' on the left.

SELECT LPAD(product_name, 15, '*') AS padded_left
FROM PRODUCT;

-- Q5. Use RPAD to format product names to 15 characters by padding with '#' on the right.

SELECT RPAD(product_name, 15, '#') AS padded_right
FROM PRODUCT;
