create table User (
    id int not null,
    Name varchar(255) not null,
    primary key (id)
)

create table Quiz (
    id int not null,
    User varchar(100) not null,
    Question varchar(200) not null,
    Options varchar(200) not null,
    RightAnswer boolean not null,
    StartDate int(100) not null,
    EndDate int(100) not null,
    ActiveQuiz boolean not null,
    Result varchar(100) not null,
    primary key (id)
)