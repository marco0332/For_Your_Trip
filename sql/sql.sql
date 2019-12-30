create database project;
use project;

-- DTO : User
create table user(
	id VARCHAR(20) PRIMARY KEY,
    name VARCHAR(20),
    imgUrl VARCHAR(200),
    gitAddress VARCHAR(200) unique,
	gitId VARCHAR(200) unique,
    level VARCHAR(20),
    stamp VarchaR(200),
    classProgress VARCHAR(200), -- Foreign Key
    testResult VARCHAR(20) -- Foreign Key
);
desc user;

-- DTO : Lecture
create table lecture(
	lId		VARCHAR(20)		PRIMARY KEY,
    lName	VARCHAR(30)		unique,
    lNum	integer,
    lCategory	VARCHAR(20)
);
desc lecture;

-- DTO :  LectureCategory
create table lecture_category(
	lcId	VARCHAR(20)		PRIMARY KEY,
    lcName	VARCHAR(50)		unique,
    lcContent	VARCHAR(500),
    lcDate	DATETIME,
    lcLevel	VARCHAR(40),
    id		VARCHAR(20),
    lId		VARCHAR(20),
    constraint fk_id foreign key (id) references user(id), 
    constraint fk_lId foreign key (lId) references lecture(lId)
);
desc lecture_category;

-- DTO : Curriculum
create table curriculum(
	currId		VARCHAR(20)		primary key,
    currName	VARCHAR(40),
    currList	VARCHAR(200)
);
desc curriculum;