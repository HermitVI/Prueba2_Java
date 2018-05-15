CREATE DATABASE bd_Prueba2;
USE  bd_Prueba2;

CREATE TABLE tipo_usuario(
	id INT AUTO_INCREMENT,
    nombre VARCHAR(100),
    PRIMARY KEY(id)
);

INSERT INTO tipo_usuario VALUE('Administrador');
INSERT INTO tipo_usuario VALUE('Vendedor');

CREATE TABLE usuario(
	run VARCHAR(50) UNIQUE,
    nombre VARCHAR(100),
    tipo_usuaruo_fk INT REFERENCES tipo_usuario(id),
    fecha_con DATETIME,
    PRIMARY KEY(run)
);

INSERT INTO usuario VALUE('11-1','admin',1);

CREATE TABLE tipo_vivienda(
	id INT AUTO_INCREMENT,
    estado VARCHAR(100),
    PRIMARY KEY(id)
);

INSERT INTO tipo_vivienda VALUE('Casa');
INSERT INTO tipo_vivienda VALUE('Departamento');

CREATE TABLE vivienta(
	rol INT UNIQUE,
    direccion VARCHAR(100),
    cant_pieza INT,
    cant_banios INT,
    tipo_vivienda_fk INT REFERENCES tipo_vivienda(id),
    tipo BOOLEAN,
    precio INT,
    estado BOOLEAN,
    PRIMARY KEY(rol)
);

CREATE TABLE cliente(
	run INT UNIQUE,
    nombre VARCHAR(100),
    sueldo INT,
    fecha_reg DATETIME,
    PRIMARY KEY(run)
);

CREATE TABLE venta(
	id INT AUTO_INCREMENT,
    usuario_fk INT REFERENCES usuario(run),
    cliente_fk INT REFERENCES cliente(run),
    fecha DATETIME,
    vivienda_fk INT REFERENCES vivienta(rol), 
    PRIMARY KEY(id)
);
