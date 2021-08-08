-- CREATE TABLE IF NOT EXISTS
-- CREATE TABLE IF NOT EXISTS USER;
CREATE TABLE IF NOT EXISTS USER (id bigint not null, email_address varchar(50) not null, first_name varchar(50) not null, last_name varchar(50) not null, role varchar(50) not null, ssn varchar(50) not null, user_name varchar(50) not null, primary key (id));
insert into user values(101, 'kreddy@straksimplify.com', 'Kalyan', 'Reddy', 'admin', 'ssn101','kalyan');
insert into user values(102, 'gwiser@straksimplify.com', 'Greg', 'Wiser', 'admin', 'ssn102','gwiser');
insert into user values(103, 'dmark@straksimplify.com', 'David', 'Mark', 'admin', 'ssn103','dmark');
COMMIT;