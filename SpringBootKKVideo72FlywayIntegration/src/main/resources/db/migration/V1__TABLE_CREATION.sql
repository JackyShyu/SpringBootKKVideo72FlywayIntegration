drop table if exists employee_table;
create table employee_table
(
	employee_id serial primary key,
	employee_name varchar(255),
	email varchar(255),
	salary NUMERIC(6,2)
)