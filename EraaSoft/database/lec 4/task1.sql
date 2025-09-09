

-- Q1. Create a table called EMP_TEST with a column NAME having leading and trailing spaces.

CREATE TABLE EMP_TEST (
    NAME VARCHAR(100)
);

INSERT INTO EMP_TEST (NAME) VALUES ('Abdullah');
INSERT INTO EMP_TEST (NAME) VALUES ('Amr');
INSERT INTO EMP_TEST (NAME) VALUES ('Ahmed');
INSERT INTO EMP_TEST (NAME) VALUES ('Hatem');

-- Q2. Display all names using TRIM to remove both leading and trailing spaces.

SELECT TRIM(NAME) AS trimmed_name
FROM EMP_TEST;

-- Q3. Use LTRIM to remove only leading spaces.

SELECT LTRIM(NAME) AS left_trimmed_name
FROM EMP_TEST;


-- Q4. Use RTRIM to remove only trailing spaces.

SELECT RTRIM(NAME) AS right_trimmed_name
FROM EMP_TEST;

-- Q5. Use TRIM to remove a specific character (e.g., ‘*’ or ‘#’) from both sides of a string.

SELECT TRIM(BOTH '*' FROM NAME) AS trimmed_star
FROM EMP_TEST
WHERE NAME LIKE '*%*';

SELECT TRIM(BOTH '#' FROM NAME) AS trimmed_hash
FROM EMP_TEST
WHERE NAME LIKE '#%#';