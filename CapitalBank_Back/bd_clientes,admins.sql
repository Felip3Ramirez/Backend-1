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

INSERT INTO seguros (tipo, compania, costo, fecha_inicio, fecha_fin) VALUES
('Salud', 'Compan�a A', 150.00, '2023-01-01', '2024-01-01'),
('Auto', 'Compan�a B', 200.00, '2023-02-01', '2024-02-01'),
('Vida', 'Compan�a C', 250.00, '2023-03-01', '2024-03-01'),
('Hogar', 'Compan�a D', 100.00, '2023-04-01', '2024-04-01');
