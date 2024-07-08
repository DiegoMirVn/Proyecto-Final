CREATE SCHEMA IF NOT EXISTS `cliente`;


CREATE TABLE IF NOT EXISTS `cliente`.`cliente` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NULL,
  `apellido1` VARCHAR(45) NULL,
  `apellido2` VARCHAR(45) NULL,
  `email` VARCHAR(45) NULL,
  `pais` VARCHAR(45) NULL,
  `localidad` VARCHAR(45) NULL,
  `telefono` VARCHAR(45) NULL,
  `fecha_nacimiento` DATE NULL,
  `genero` ENUM("MASCULINO", "FEMENINO", "NO_BINARIO") NULL,
  PRIMARY KEY (`id`))
COMMENT = 'Creacion de la base de datos usando ENUM para genero, id autoincremental ';
