

--Q(1)create Employees table wiith column ( EmployeeID, FirstName, LastName, Department, Salary )

create table Employees(
  EmployeeID int not NULL,
  FirstName VARCHAR2(255), 
  LastName VARCHAR2(255), 
  Department VARCHAR2(255),
  Salary DECIMAL,
  PRIMARY KEY (EmployeeID)
);
----------------------------------------------------------------
--Q(2)Insert a new record into the Employees table.

--EmployeeID     FirstName   LastName  Department      Salary
--101            'John1'      'Doe1'     'HR'            20000
--102            'John2'      'Doe2'     'IT'            50000
--103            'John3'      'Doe3'     'CS'            40000
--104            'John4'      'Doe4'     'IT'            10000
--105            'John5'      'Doe5'     'ZX'            30000

Insert INTO Employees (EmployeeID, FirstName, LastName, Department, Salary)
VALUES
(101, 'John1', 'Doe1', 'HR', 20000),
(102, 'John2', 'Doe2', 'IT', 50000),
(103, 'John3', 'Doe3', 'CS', 40000),
(104, 'John4', 'Doe4', 'IT', 10000),
(105, 'John5', 'Doe5', 'ZX', 30000);

-----------------------------------------------------------------------------------------
--Q(3)Update the salary of an employee to 600000 with EmployeeID     101.


Update Employees
set Salary = 600000
where EmployeeID = 101;

-----------------------------------------------------------------
--Q(4) Delete a record of an employee who Department (EmployeeID) = 101.

Delete from employees 
where EmployeeID = 101;

----------------------------------------------------------------
--Q(5) Retrieve all employees in the IT department.

select * from employees where department = 'IT';

---------------------------------------------------------------
--Q(6)select * data from table but conatination  FirstName, LastName as one column
select 
EmployeeID,
FirstName ||' '|| LastName as full_name,
department,
Salary
from Employees;

-----------------------------------------------------------------------------------