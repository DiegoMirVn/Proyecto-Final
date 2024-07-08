DROP SCHEMA `horario`;
CREATE SCHEMA IF NOT EXISTS`horario`;
USE `horario`;
DROP TABLE IF EXISTS`horario_trabajo`;

CREATE TABLE IF NOT EXISTS `horario_trabajo` (
    `id`  BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `terapeuta_id` INT NOT NULL,
    `dia_semana` ENUM('LUNES', 'MARTES', 'MIERCOLES', 'JUEVES', 'VIERNES', 'SABADO', 'DOMINGO') NOT NULL,
    `hora_inicio` TIME NOT NULL,
    `hora_fin` TIME NOT NULL
    )
;


