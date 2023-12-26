create table student
(
    id    int auto_increment
        primary key,
    name  varchar(50)   null,
    age   int           null,
    score decimal(5, 2) null
)
    engine = InnoDB
    charset = utf8mb4;


