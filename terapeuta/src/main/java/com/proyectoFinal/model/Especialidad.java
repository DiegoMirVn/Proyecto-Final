package com.proyectoFinal.model;

public enum Especialidad {

	FISIOTERAPIA_GINECOLOGICA, TERAPEUTA_OCUPACIONAL, FISIOTERAPIA_RESPIRATORIA, FISIOTERAPIA_DEPORTIVA,
	FISIOTERAPIA_NEUROLOGICA_ADULTOS, FISIOTERAPIA_NEUROLOGICA_NINOS, PSICOLOGIA_ADULTOS, PSICOLOGIA_ADOLESCENTES,
	PSICOLOGIA_NINOS,NUTRICION,ENTRENADOR_PERSONAL;

	
	public static Especialidad fromString(String text) {
		return Especialidad.valueOf(text.toUpperCase());
	}
}
