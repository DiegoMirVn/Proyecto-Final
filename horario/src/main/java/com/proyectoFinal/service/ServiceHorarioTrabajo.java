package com.proyectoFinal.service;

import java.util.List;

import com.proyectoFinal.model.HorarioTrabajo;

public interface ServiceHorarioTrabajo {

	public List<HorarioTrabajo> mostrarHorarios();

	/**
	 * Consulta los horarios que tiene un terapeuta segun el id del mismo
	 * 
	 * @param idTerapeuta identificador de terapeuta que le pasamos
	 * @return Lista de horarios que tiene ese identificador de terapeuta
	 */
	List<HorarioTrabajo> mostrarHorarioTerapeuta(int idTerapeuta);

	void insertarHorario(HorarioTrabajo horarioTrabajo);

	/**
	 * Cambia el horario de ese id en la tabla de horario_trabajo.
	 * 
	 * @param horarioTrabajoNuevo Objeto recibido mediante json por el body
	 * @param id                  Identificador unico de horario
	 */
	void actualizarHorario(HorarioTrabajo horarioTrabajoNuevo, int id);

	void eliminarHorario(int id);
}
