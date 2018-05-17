CREATE DATABASE bd_Prueba2; -- DROP DATABASE bd_Prueba2;
USE  bd_Prueba2;

CREATE TABLE tipo_usuario(
    id INT AUTO_INCREMENT,
    nombre VARCHAR(100),
    PRIMARY KEY(id)
);-- SELECT * FROM tipo_usuario;

INSERT INTO tipo_usuario VALUE(null, 'Administrador');
INSERT INTO tipo_usuario VALUE(null, 'Vendedor');

CREATE TABLE usuario(
    run VARCHAR(50) UNIQUE,
    nombre VARCHAR(100),
    tipo_usuaruo_fk INT REFERENCES tipo_usuario(id),
    fecha_con TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    PRIMARY KEY(run)
);-- SELECT * FROM usuario;

CREATE VIEW getUsuario AS-- SELECT * FROM getUsuario;
SELECT
	u.run,
    u.nombre,
    tp.nombre AS 'Tipo de usuario',
    u.fecha_con AS 'Fecha de ingreso'
FROM
	usuario u
    INNER JOIN tipo_usuario tp
    ON u.tipo_usuaruo_fk = tp.id;-- DROP VIEW getUsuario

INSERT INTO usuario VALUE('11-1','admin',1,now());

CREATE TABLE tipo_vivienda(
	id INT AUTO_INCREMENT,
    estado VARCHAR(100),
    PRIMARY KEY(id)
);-- SELECT * FROM tipo_vivienda;

INSERT INTO tipo_vivienda VALUE(null, 'Casa');
INSERT INTO tipo_vivienda VALUE(null, 'Departamento');

CREATE TABLE vivienda(-- DROP TABLE vivienta;
	rol INT UNIQUE,
    direccion VARCHAR(100),
    cant_pieza INT,
    cant_banios INT,
    tipo_vivienda_fk INT REFERENCES tipo_vivienda(id),
    tipo BOOLEAN,
    precio INT,
    estado BOOLEAN,
    PRIMARY KEY(rol)
);-- SELECT * FROM vivienda;

insert into vivienda VALUES (111,'casa',2,3,1,true,200,false);


CREATE VIEW getVivienda AS
SELECT
	v.rol,
    v.direccion AS 'Dirección',
	v.cant_pieza AS 'Cantidad de Piezas',
    v.cant_banios AS 'Cantidad de Baños',
    tp.estado 'Tipo de Vivienda',
    v.tipo AS 'Arriendo o Venta',
    v.precio AS 'Precio',
    v.estado AS 'Nuevo o usado'
    
FROM
	vivienda v
    INNER JOIN tipo_vivienda tp
    ON tp.id = v.tipo_vivienda_fk;-- SELECT * FROM getVivienda;

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
);-- SELECT * FROM venta;


SELECT * FROM vivienda;

drop table estado;



INSERT INTO estado VALUES(true, 'Arriendo');
INSERT INTO estado VALUES(false, 'Venta');


CREATE VIEW ASD
AS 



DELIMITER $$

CREATE PROCEDURE TURBIEDAD()
BEGIN 
    SELECT 
		v.direccion,
		e.nombre AS 'Tipo Vivienda'
	FROM vivienda v, estado e
	WHERE v.tipo_vivienda_fk = e.id;
    
    DROP TABLE estado;
END $$

DELIMITER ;

show tables;