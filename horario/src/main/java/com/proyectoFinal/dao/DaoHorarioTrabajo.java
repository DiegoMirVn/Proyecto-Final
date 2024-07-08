package com.proyectoFinal.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.proyectoFinal.model.HorarioTrabajo;

public interface DaoHorarioTrabajo extends JpaRepository<HorarioTrabajo, Integer> {

	/**
	 * Consulta especifica para listar por el idTerapeuta, no por el id del horario
	 * @param idTerapeuta Enlaza con el terapeuta 
	 * @return Lista de horarios que tiene el id del terapeuta que le pasamos
	 */
	@Query("SELECT ht FROM HorarioTrabajo ht WHERE ht.terapeutaId = :id")
	public List<HorarioTrabajo> listarHorariosTerapeutaId(@Param("id") int idTerapeuta);
}
