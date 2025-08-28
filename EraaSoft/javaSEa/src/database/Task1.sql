

-- Q(1) create table Manger contain
--id, name , age , birth_date , address
 
 create table MANAGER(
	id  int NOT NULL,
	name varchar(255),
	age	int,
	birth_date date,
	address  varchar(255),
	PRIMARY KEY (ID)
 )

----------------------------------
--Q(2) alter table manger drop address column
alter table MANAGER
drop colum address;

--Q(3) alter table manger add column (city_address, street)
alter table MANAGER 
ADD colum city_address varchar(255),street varchar(255);

-------------------------------------
--Q(4) modify column name to full_name

modify table MANAGER
rename column name to full_name;

-------------------------------------
--Q(5) make this table just for read

REVOKE INSERT, UPDATE, DELETE ON Manager FROM user;

-------------------------------
--Q(6) create table same as  Manger with name Owner
--just has colum id, name, birth_date 

CREATE TABLE Owner (
    id INT NOT NULL,
    name VARCHAR(255) NOT NULL,
    birth_date DATE,
	PRIMARY KEY (id)
);

----------------------------------------
--Q(7)rename manger table name to Master

rename table MANAGER to MASTER;

-----------------------------------------
--Q(8) drop all tables 
   
DROP TABLE MASTER;
DROP TABLE Owner;
