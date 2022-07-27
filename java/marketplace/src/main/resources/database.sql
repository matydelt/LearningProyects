CREATE database marketplace;
use marketplace;

CREATE TABLE User (
	id int auto_increment,
    firstName varchar(50),
    lastName varchar(50),
    email varchar(100),
    password varchar(50),
    primary key(id)
);


CREATE TABLE Category (
    id varchar(100),
    visits int,
    primary key(id)
);

CREATE TABLE Trademark(
	id varchar(100),
    visits int,
    primary key(id)
);

CREATE TABLE History (
	id int auto_increment,
    tableName varchar(50),
    fieldName varchar(50),
    lastValue varchar(200),
    previousValue varchar(200),
    date date,
    primary key(id)
);

CREATE TABLE Product (
	id int auto_increment,
    name varchar(200),
    visits int,
    userID int,
    categoryID varchar(100),
    trademarkID varchar(100),
    primary key(id),
	foreign key(userID) references user(id),
    foreign key(categoryID) references category(id),
    foreign key(trademarkID) references trademark(id)    
);


insert into user (firstName,lastName,email,password) values("matias","taborda","matiastaborda1234@hotmail.com","domingo8"); 

insert into category (id) values("REMERAS DE MUJER");

insert into trademark (id) values("Adidas");

insert into product (name, userID, categoryID, trademarkID) values("Remera adidas", 1, "REMERAS DE MUJER", "adidas");

SELECT u.id ,u.firstName, p.name FROM user u left join product p on u.id=userID;

