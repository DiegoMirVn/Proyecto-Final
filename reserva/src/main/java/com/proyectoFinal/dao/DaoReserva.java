package com.proyectoFinal.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.proyectoFinal.model.Reserva;

public interface DaoReserva extends JpaRepository<Reserva, Long> {

	@Query("SELECT r FROM Reserva r WHERE r.terapeutaId = :idTerapeuta")
	public List<Reserva> mostrarReservasTerapeuta(@Param("idTerapeuta") int idTerapeuta);

	@Query("SELECT r FROM Reserva r WHERE r.clienteId = :idCliente")
	public List<Reserva> mostrarReservasCliente(@Param("idCliente") int idCliente);
}
