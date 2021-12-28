create database College; 
show databases;
create table College.Student( 
	ID int,
    Name varchar(255),
    Department varchar(255),
    Contact int,
    Marks int);
select * from College.Student;
insert into College.Student values (100,"Bhavya","ECE",123445,90);
insert into College.Student values (101,"Athira","CSE",12343762,92);
insert into College.Student values (102,"Anusha","IT",1234761,91);
insert into College.Student values (103,"Kokila","EEE",123462,89);
insert into College.Student values (104,"Rugma","CSE",12387262,95);
select ID,Name from College.Student;
delete from College.Student where Name = "Sneha";
insert into College.Student values (104,"Sneha","IT",9887262,83);
select min(Marks) as Minimum from College.Student;
select max(Marks) as Maximum from College.Student;
select count(Marks) as Total from College.Student where ID = 104;
SET SQL_SAFE_UPDATES = 0;
alter table College.Student add primary key (ID);
alter table College.Student drop primary key;
select * from College.Student where Marks > 90 and Department = "CSE";
update College.Student set Contact = 98765;
select * from College.Student where Marks not between 91 and 99;
select * from College.Student where Department in ("CSE","ECE","IT");
select Name from College.Student where Name like "B%a";
select Name from College.Student where Name like "A%a";
select * from College.Student order by Name asc;
delete from College.Student;
drop table College.Student;
drop database College;
show databases;


