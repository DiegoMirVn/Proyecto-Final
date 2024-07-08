-- Terapeuta 1: Lunes a Viernes, jornada partida
INSERT INTO `horario_trabajo` (`terapeuta_id`, `dia_semana`, `hora_inicio`, `hora_fin`)
VALUES
(1, 'LUNES', '09:00:00', '13:00:00'),
(1, 'LUNES', '15:00:00', '19:00:00'),
(1, 'MARTES', '09:00:00', '13:00:00'),
(1, 'MARTES', '15:00:00', '19:00:00'),
(1, 'MIERCOLES', '09:00:00', '13:00:00'),
(1, 'MIERCOLES', '15:00:00', '19:00:00'),
(1, 'JUEVES', '09:00:00', '13:00:00'),
(1, 'JUEVES', '15:00:00', '19:00:00'),
(1, 'VIERNES', '09:00:00', '13:00:00'),
(1, 'VIERNES', '15:00:00', '19:00:00');

-- Terapeuta 2: Lunes a Viernes, jornada partida
INSERT INTO `horario_trabajo` (`terapeuta_id`, `dia_semana`, `hora_inicio`, `hora_fin`)
VALUES
(2, 'LUNES', '08:00:00', '12:00:00'),
(2, 'LUNES', '14:00:00', '18:00:00'),
(2, 'MARTES', '08:00:00', '12:00:00'),
(2, 'MARTES', '14:00:00', '18:00:00'),
(2, 'MIERCOLES', '08:00:00', '12:00:00'),
(2, 'MIERCOLES', '14:00:00', '18:00:00'),
(2, 'JUEVES', '08:00:00', '12:00:00'),
(2, 'JUEVES', '14:00:00', '18:00:00'),
(2, 'VIERNES', '08:00:00', '12:00:00'),
(2, 'VIERNES', '14:00:00', '18:00:00');

-- Terapeuta 3: Lunes a Viernes, jornada partida
INSERT INTO `horario_trabajo` (`terapeuta_id`, `dia_semana`, `hora_inicio`, `hora_fin`)
VALUES
(3, 'LUNES', '10:00:00', '14:00:00'),
(3, 'LUNES', '16:00:00', '20:00:00'),
(3, 'MARTES', '10:00:00', '14:00:00'),
(3, 'MARTES', '16:00:00', '20:00:00'),
(3, 'MIERCOLES', '10:00:00', '14:00:00'),
(3, 'MIERCOLES', '16:00:00', '20:00:00'),
(3, 'JUEVES', '10:00:00', '14:00:00'),
(3, 'JUEVES', '16:00:00', '20:00:00'),
(3, 'VIERNES', '10:00:00', '14:00:00'),
(3, 'VIERNES', '16:00:00', '20:00:00');

-- Terapeuta 4: Lunes a Viernes, jornada completa
INSERT INTO `horario_trabajo` (`terapeuta_id`, `dia_semana`, `hora_inicio`, `hora_fin`)
VALUES
(4, 'LUNES', '07:00:00', '15:00:00'),
(4, 'MARTES', '07:00:00', '15:00:00'),
(4, 'MIERCOLES', '07:00:00', '15:00:00'),
(4, 'JUEVES', '07:00:00', '15:00:00'),
(4, 'VIERNES', '07:00:00', '15:00:00');

-- Terapeuta 5: Lunes a Viernes, jornada completa
INSERT INTO `horario_trabajo` (`terapeuta_id`, `dia_semana`, `hora_inicio`, `hora_fin`)
VALUES
(5, 'LUNES', '09:00:00', '17:00:00'),
(5, 'MARTES', '09:00:00', '17:00:00'),
(5, 'MIERCOLES', '09:00:00', '17:00:00'),
(5, 'JUEVES', '09:00:00', '17:00:00'),
(5, 'VIERNES', '09:00:00', '17:00:00');

-- Terapeuta 6: Sábado y Domingo, horarios flexibles
INSERT INTO `horario_trabajo` (`terapeuta_id`, `dia_semana`, `hora_inicio`, `hora_fin`)
VALUES
(6, 'SABADO', '09:00:00', '15:00:00'),
(6, 'DOMINGO', '10:00:00', '14:00:00');

