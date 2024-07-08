DROP SCHEMA `reserva`;
CREATE SCHEMA IF NOT EXISTS `reserva`;

USE `reserva`;


CREATE TABLE IF NOT EXISTS `reserva` (
    `reserva_id` BIGINT NOT NULL AUTO_INCREMENT,
    `terapeuta_id` INT NOT NULL,
    `cliente_id` INT NOT NULL,
    `fecha` DATE NOT NULL,
    `hora_reserva` TIME NOT NULL,
    `duracion` INT NOT NULL,
    `tipo_reserva` ENUM('GESTION', 'CONSULTA', 'BLOQUEADO', 'CONSULTA_DOMICILIO') NOT NULL,
    PRIMARY KEY (`reserva_id`)
);