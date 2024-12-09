CREATE DATABASE seguros;
USE seguros;

CREATE TABLE usuarios (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100),
    email VARCHAR(100),
    telefono VARCHAR(15),
    tipo ENUM('cliente', 'administrador'),
    id_empleado VARCHAR(50),
    id_administrador VARCHAR(50)
);