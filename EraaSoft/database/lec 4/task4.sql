



-- Q1. Create a table STUDENTS with columns: name, marks.

CREATE TABLE STUDENTS (
    name VARCHAR(50),
    marks INT
);


-- Q2. Insert 5 sample students with marks.

INSERT INTO STUDENTS (name, marks) VALUES ('shams', 95);
INSERT INTO STUDENTS (name, marks) VALUES ('abdullah', 82);
INSERT INTO STUDENTS (name, marks) VALUES ('amr', 76);


-- Q3. Use CASE to assign grades: 
--     >=90 => 'A', 80–89 => 'B', 70–79 => 'C', else => 'F'

SELECT 
    name,
    marks,
    CASE
        WHEN marks >= 90 THEN 'A'
        WHEN marks >= 80 THEN 'B'
        WHEN marks >= 70 THEN 'C'
        ELSE 'F'
    END AS grade
FROM STUDENTS;
