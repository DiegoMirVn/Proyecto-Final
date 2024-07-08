package com.proyectoFinal.service;

import java.util.List;

import com.proyectoFinal.model.Especialidad;
import com.proyectoFinal.model.Terapeuta;

public interface ServiceTerapeuta {

	List<Terapeuta> mostrarTerapeutas();

	Terapeuta mostrarTerapeutaId(int id);

	List<Terapeuta> mostrarTerapeutasCiudad(String ciudad);

	List<Terapeuta> mostrarTerapeutasEspecialidad(String especialidad);

	List<Terapeuta> mostrarTerapeutaCiudadEspecialidad(String ciudad, String especialidad);

	void insertarTerapeuta(Terapeuta terapeuta);

	void actualizarTerapeuta(Terapeuta terapeuta, int id);

	void eliminarTerapeuta(int id);

}
