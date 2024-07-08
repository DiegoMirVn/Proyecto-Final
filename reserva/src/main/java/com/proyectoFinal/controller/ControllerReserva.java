package com.proyectoFinal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.proyectoFinal.model.Reserva;
import com.proyectoFinal.service.ServiceReserva;

@RestController
public class ControllerReserva {
	@Autowired
	ServiceReserva service;

	@GetMapping(value = "/reserva", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Reserva> mostrarTodasReservas() {

		return service.mostrarTodasReservas();
	}

	@GetMapping(value = "/reserva/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Reserva mostrarReservaPorId(@PathVariable("id") Long id) {

		return service.mostrarReservaPorId(id);
	}

	@GetMapping(value = "/reserva/terapeuta/{idTerapeuta}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Reserva> mostrarReservaPorIdTerapeuta(@PathVariable("idTerapeuta") int idTerapeuta) {

		return service.mostrarReservaPorIdTerapeuta(idTerapeuta);
	}

	@GetMapping(value = "/reserva/cliente/{idCliente}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Reserva> mostrarReservaPorIdCliente(@PathVariable("idCliente") int idCliente) {

		return service.mostrarReservaPorIdCliente(idCliente);
	}

	@PostMapping(value = "/reserva", consumes = MediaType.APPLICATION_JSON_VALUE)
	public Reserva insertarReserva(@RequestBody Reserva reserva) {

		return service.insertarReserva(reserva);
	}

	@PutMapping(value = "/reserva/actualizacion/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
	public Reserva actualizarReserva(@RequestBody Reserva reserva, @PathVariable("id") Long id) {

		return service.actualizarReserva(reserva, id);
	}

	@DeleteMapping(value = "/reserva/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Reserva eliminarReserva(@PathVariable("id") Long id) {
		return service.eliminarReserva(id);

	}
}
