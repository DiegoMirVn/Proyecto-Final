package com.proyectoFinal.service;

import java.util.List;

import com.proyectoFinal.model.Especialidad;
import com.proyectoFinal.model.Terapeuta;

public interface ServiceGestor {

	List<Terapeuta> listarTerapeutasDisponibles(String ciudad, String especialidad);

	List<Terapeuta> listarTerapeutasCiudad(String ciudad);

	List<Terapeuta> listarTerapeutasEspecialidad(String especialidad);



}
