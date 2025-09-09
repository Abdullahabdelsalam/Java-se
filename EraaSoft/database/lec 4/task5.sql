

-- Q1. Use DECODE to achieve the same result as the CASE example above.

SELECT 
  order_id,
  DECODE(status, 
         'P', 'Pending', 
         'S', 'Shipped', 
         'D', 'Delivered', 
         'Unknown') AS status_description
FROM orders;


-- Q2. Create a table ORDERS with a column status ('P', 'S', 'D').

CREATE TABLE orders (
  order_id NUMBER PRIMARY KEY,
  status CHAR(1) CHECK (status IN ('P', 'S', 'D'))
);

INSERT INTO orders (order_id, status) VALUES (1, 'P');
INSERT INTO orders (order_id, status) VALUES (2, 'S');
INSERT INTO orders (order_id, status) VALUES (3, 'D');


-- Q3. Use DECODE to display full form of status:
--     'P' => 'Pending', 'S' => 'Shipped', 'D' => 'Delivered'

SELECT 
  order_id,
  status,
  DECODE(status, 
         'P', 'Pending', 
         'S', 'Shipped', 
         'D', 'Delivered', 
         'Unknown') AS status_description
FROM orders;
