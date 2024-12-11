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
CREATE TABLE seguros (
    id INT AUTO_INCREMENT PRIMARY KEY,
    tipo VARCHAR(50),
    compania VARCHAR(100) ,
    costo DECIMAL(10, 2),
    fecha_inicio DATE ,
    fecha_fin DATE 
);

