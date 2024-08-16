Lab project of Java Spring application (Big Data technologies)

This project expects having created Docker container based on MySQL image.

Host ports for connection:
8090:3306/tcp
8091:33060/tcp

Container system variables:
MYSQL_ROOT_PASSWORD:     qwerty1234
MYSQL_USER:              dbadmin
MYSQL_PASSWORD:          goodpasswd
MYSQL_DATABASE:          mobiledb

MySQL script for creating the database:

CREATE DATABASE IF NOT EXISTS mobiledb;
USE mobiledb;
CREATE TABLE IF NOT EXISTS MobileDevice (
    id int PRIMARY KEY,
    brand VARCHAR(255),
    model VARCHAR(255),
    price FLOAT(8, 2),
    operatingSystem VARCHAR(255))
);

