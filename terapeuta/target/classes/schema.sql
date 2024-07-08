CREATE SCHEMA IF NOT EXISTS `terapeuta`;
USE `terapeuta`;

DROP TABLE IF EXISTS `terapeuta`;


CREATE TABLE IF NOT EXISTS `terapeuta` (
    `id` INT NOT NULL AUTO_INCREMENT,
    `nombre` VARCHAR(45) NULL,
    `apellido1` VARCHAR(45) NULL,
    `apellido2` VARCHAR(45) NULL,
    `telefono` VARCHAR(45) NULL,
    `ciudad` VARCHAR(45) NULL,
    `especialidad` VARCHAR(45) NULL,
    PRIMARY KEY (`id`)
);

INSERT INTO `terapeuta` (`nombre`, `apellido1`, `apellido2`, `telefono`, `ciudad`, `especialidad`) 
VALUES 
    ('Juan', 'Pérez', 'García', '123456789', 'Madrid', 'FISIOTERAPIA_GINECOLOGICA'),
    ('María', 'López', 'Martínez', '987654321', 'Barcelona', 'TERAPEUTA_OCUPACIONAL'),
    ('Carlos', 'González', 'Fernández', '654321987', 'Valencia', 'FISIOTERAPIA_RESPIRATORIA'),
    ('Ana', 'Sánchez', 'Gómez', '456123789', 'Sevilla', 'FISIOTERAPIA_DEPORTIVA'),
    ('Pedro', 'Rodríguez', 'Díaz', '789123456', 'Bilbao', 'FISIOTERAPIA_NEUROLOGICA_ADULTOS'),
    ('Laura', 'Martín', 'Sanz', '321654987', 'Málaga', 'FISIOTERAPIA_NEUROLOGICA_NINOS'),
    ('David', 'Fernández', 'Pérez', '234567891', 'Alicante', 'PSICOLOGIA_ADULTOS'),
    ('Elena', 'Gómez', 'Ruiz', '678912345', 'Zaragoza', 'PSICOLOGIA_ADOLESCENTES'),
    ('Marta', 'Pérez', 'García', '891234567', 'Valladolid', 'PSICOLOGIA_NINOS'),
    ('Roberto', 'Díaz', 'López', '567891234', 'Palma de Mallorca', 'NUTRICION'),
    ('Sara', 'González', 'Sánchez', '345678912', 'Toledo', 'ENTRENADOR_PERSONAL'),
    ('Luis', 'Moreno', 'Torres', '234567890', 'Madrid', 'FISIOTERAPIA_GINECOLOGICA'),
    ('Nuria', 'García', 'López', '098765432', 'Madrid', 'FISIOTERAPIA_GINECOLOGICA'),
    ('Jose', 'Martínez', 'Pérez', '098123456', 'Barcelona', 'PSICOLOGIA_ADULTOS'),
    ('Lucía', 'Hernández', 'García', '543216789', 'Barcelona', 'PSICOLOGIA_ADULTOS'),
    ('Andrés', 'Ruiz', 'Martín', '123789456', 'Valencia', 'PSICOLOGIA_ADULTOS'),
    ('Clara', 'Ramírez', 'Lopez', '678945123', 'Valencia', 'PSICOLOGIA_ADULTOS'),
    ('Miguel', 'Santos', 'Gómez', '321987654', 'Sevilla', 'NUTRICION'),
    ('Irene', 'Navarro', 'Serrano', '789654321', 'Sevilla', 'NUTRICION'),
    ('Antonio', 'Gil', 'Ortiz', '456789123', 'Bilbao', 'ENTRENADOR_PERSONAL'),
    ('Carmen', 'Méndez', 'Moreno', '567123890', 'Bilbao', 'ENTRENADOR_PERSONAL'),
    ('Raúl', 'Flores', 'Pérez', '234098765', 'Málaga', 'PSICOLOGIA_NINOS'),
    ('Patricia', 'Castro', 'Romero', '890123456', 'Málaga', 'PSICOLOGIA_NINOS'),
    ('Laura', 'Martín', 'Sanz', '321654987', 'Málaga', 'FISIOTERAPIA_NEUROLOGICA_NINOS'),
    ('David', 'Fernández', 'Pérez', '234567891', 'Alicante', 'PSICOLOGIA_ADULTOS'),
    ('Elena', 'Gómez', 'Ruiz', '678912345', 'Zaragoza', 'PSICOLOGIA_ADOLESCENTES'),
    ('Marta', 'Pérez', 'García', '891234567', 'Valladolid', 'PSICOLOGIA_NINOS'),
    ('Roberto', 'Díaz', 'López', '567891234', 'Palma de Mallorca', 'NUTRICION'),
    ('Sara', 'González', 'Sánchez', '345678912', 'Toledo', 'ENTRENADOR_PERSONAL'),
    ('Isabel', 'Blanco', 'Martínez', '876543210', 'Toledo', 'ENTRENADOR_PERSONAL'),
    ('Ricardo', 'Ruiz', 'Navarro', '123654789', 'Alicante', 'FISIOTERAPIA_RESPIRATORIA'),
    ('Eva', 'Serrano', 'Domínguez', '321987123', 'Zaragoza', 'FISIOTERAPIA_RESPIRATORIA'),
    ('Marcos', 'López', 'Hernández', '987654123', 'Bilbao', 'FISIOTERAPIA_RESPIRATORIA'),
    ('Julia', 'Alonso', 'Torres', '654321789', 'Madrid', 'FISIOTERAPIA_RESPIRATORIA'),
    ('Álvaro', 'García', 'Ramírez', '789456123', 'Madrid', 'FISIOTERAPIA_RESPIRATORIA'),
    ('Inés', 'Romero', 'Gómez', '456789012', 'Madrid', 'PSICOLOGIA_NINOS'),
    ('Pablo', 'Sanz', 'Molina', '567890123', 'Madrid', 'PSICOLOGIA_NINOS'),
    ('Beatriz', 'Díaz', 'González', '345678901', 'Madrid', 'PSICOLOGIA_NINOS'),
    ('Francisco', 'Muñoz', 'Rojas', '234567890', 'Madrid', 'PSICOLOGIA_NINOS'),
    ('Susana', 'Martínez', 'Gil', '987654320', 'Barcelona', 'ENTRENADOR_PERSONAL'),
    ('Javier', 'Pérez', 'Sánchez', '123456789', 'Barcelona', 'ENTRENADOR_PERSONAL');
