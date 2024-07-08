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

import com.proyectoFinal.model.HorarioTrabajo;
import com.proyectoFinal.service.ServiceHorarioTrabajo;

@RestController
public class ControllerHorarioTrabajo {
	@Autowired
	ServiceHorarioTrabajo service;

	@GetMapping(value = "/horario", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<HorarioTrabajo> mostrarHorarios() {

		return service.mostrarHorarios();
	}

	@GetMapping(value = "/horario/{idTerapeuta}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<HorarioTrabajo> mostrarHorarioTerapeuta(@PathVariable("idTerapeuta") int idTerapeuta) {

		return service.mostrarHorarioTerapeuta(idTerapeuta);
	}

	@PostMapping(value = "/horario", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void insertarHorario(@RequestBody HorarioTrabajo horarioTrabajo) {
		service.insertarHorario(horarioTrabajo);

	}

	@PutMapping(value = "/horario/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void actualizarHorario(@RequestBody HorarioTrabajo horarioTrabajoNuevo, @PathVariable("id") int id) {

		service.actualizarHorario(horarioTrabajoNuevo, id);
	}

	@DeleteMapping(value = "/horario/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public void eliminarHorario(@PathVariable("id") int id) {
		service.eliminarHorario(id);

	}
}
