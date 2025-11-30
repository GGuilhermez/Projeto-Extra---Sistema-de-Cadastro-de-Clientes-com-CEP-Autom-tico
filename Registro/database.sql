CREATE DATABASE IF NOT EXISTS registro;
USE registro;

CREATE TABLE IF NOT EXISTS clients (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL,
    cep VARCHAR(10) NOT NULL,
    street VARCHAR(120),
    city VARCHAR(80),
    state VARCHAR(5)
);
