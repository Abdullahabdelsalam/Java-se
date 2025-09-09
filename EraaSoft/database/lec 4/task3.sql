

-- Q1. Display current date in the format 'DD-MON-YYYY'.

SELECT TO_CHAR(CURRENT_DATE, 'DD-MON-YYYY') AS formatted_date

-- Q2. Display current date in the format 'Month YYYY'.

SELECT TO_CHAR(CURRENT_DATE, 'Month YYYY') AS formatted_date

-- Q3. Convert a number to character using TO_CHAR with formatting (e.g., 12345.67 as '12,345.67').

SELECT TO_CHAR(12345.67, '9,999,999.99') AS formatted_number;


-- Q4. Show salary formatted with a currency symbol.

SELECT TO_CHAR(salary, '$9,999,999.00') AS formatted_salary
FROM employees;
