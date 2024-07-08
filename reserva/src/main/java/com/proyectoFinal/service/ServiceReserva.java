package com.proyectoFinal.service;

import java.util.List;

import com.proyectoFinal.model.Reserva;

public interface ServiceReserva {

	public List<Reserva> mostrarTodasReservas();

	public Reserva mostrarReservaPorId(Long id);

	public List<Reserva> mostrarReservaPorIdTerapeuta(int idTerapeuta);

	public List<Reserva> mostrarReservaPorIdCliente(int idCliente);

	public Reserva insertarReserva(Reserva reserva);

	public Reserva actualizarReserva(Reserva reserva, Long id);

	public Reserva eliminarReserva(Long id);

}
