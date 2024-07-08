package com.proyectoFinal.dao;

import java.util.List;

import org.hibernate.annotations.Parent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.proyectoFinal.model.Especialidad;
import com.proyectoFinal.model.Terapeuta;

public interface DaoTerapeuta extends JpaRepository<Terapeuta, Integer> {

	@Query("SELECT t FROM Terapeuta t WHERE t.ciudad = :ciudad AND t.especialidad = :especialidad")
	public List<Terapeuta> mostrarTerapeutaCiudadEspecialidad(@Param("ciudad") String ciudad,
			@Param("especialidad") Especialidad especialidad);

	@Query("SELECT t FROM Terapeuta t WHERE t.ciudad = :ciudad ")
	public List<Terapeuta> mostrarTerapeutasCiudad(@Param("ciudad") String ciudad);

	@Query("SELECT t FROM Terapeuta t WHERE t.especialidad = :especialidad")
	public List<Terapeuta> mostrarTerapeutasEspecialidad(@Param("especialidad") Especialidad especialidad);
}
