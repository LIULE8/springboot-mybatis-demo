create table t_user(
    id int primary key auto_increment,
    user_name varchar2(11),
    password varchar2(11),
    age int
);

insert into t_user values ( 1, 'leo', 'pw1213', 11)