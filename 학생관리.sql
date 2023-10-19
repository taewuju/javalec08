-- 아래를 자신의 데이터 베이스에서 실행해 주세용 ^^

CREATE DATABASE javalec; 

USE javalec; 

create table student
(
    std_no     int auto_increment,
    name      varchar(100)                       null,
    grade     int                                null,
    score     int                                null,
    insert_dt datetime default current_timestamp null,
    update_dt datetime default current_timestamp null,
    constraint student_pk
        primary key (std_no)
);


insert into student (name, grade, score ) values ('이종석', 12, 100);
insert into student (name, grade, score ) values ('박은진', 6, 80);
insert into student (name, grade, score ) values ('이지우', 1, 99);