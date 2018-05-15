CREATE DATABASE bd_Prueba2; -- DROP DATABASE bd_Prueba2;
USE  bd_Prueba2;

CREATE TABLE tipo_usuario(
	id INT AUTO_INCREMENT,
    nombre VARCHAR(100),
    PRIMARY KEY(id)
);

-- INSERT INTO tipo_usuario VALUE(null, 'Administrador');
-- INSERT INTO tipo_usuario VALUE(null, 'Vendedor');

CREATE TABLE usuario(
	run VARCHAR(50) UNIQUE,
    nombre VARCHAR(100),
    tipo_usuaruo_fk INT REFERENCES tipo_usuario(id),
    fecha_con TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    PRIMARY KEY(run)
);

-- INSERT INTO usuario VALUE(null, '11-1','admin',1,);

CREATE TABLE tipo_vivienda(
	id INT AUTO_INCREMENT,
    estado VARCHAR(100),
    PRIMARY KEY(id)
);

-- INSERT INTO tipo_vivienda VALUE(null, 'Casa');
-- INSERT INTO tipo_vivienda VALUE(null, 'Departamento');

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
	run VARCHAR(100) UNIQUE,
    nombre VARCHAR(100),
    sueldo INT,
    fecha_reg TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    PRIMARY KEY(run)
);

CREATE TABLE venta(
	id INT AUTO_INCREMENT,
    usuario_fk INT REFERENCES usuario(run),
    cliente_fk INT REFERENCES cliente(run),
    fecha TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    vivienda_fk INT REFERENCES vivienta(rol), 
    PRIMARY KEY(id)
);