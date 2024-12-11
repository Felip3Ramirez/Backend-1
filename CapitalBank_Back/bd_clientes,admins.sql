CREATE DATABASE capitalBank_bd;
USE capitalBank_bd;
CREATE TABLE cliente (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50) ,
    contrasena VARCHAR(50) ,
    email VARCHAR(50) ,
    telefono bigint
);
CREATE TABLE administrador (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50) ,
    contrasena VARCHAR(50) ,
    email VARCHAR(50) ,
    telefono bigint
);

