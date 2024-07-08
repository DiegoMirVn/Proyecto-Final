package com.proyectoFinal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.proyectoFinal.model.Especialidad;
import com.proyectoFinal.model.Terapeuta;
import com.proyectoFinal.service.ServiceTerapeuta;

@RestController
public class ControllerTerapeuta {
	@Autowired
	ServiceTerapeuta service;

	@GetMapping(value = "/terapeuta", produces = MediaType.APPLICATION_JSON_VALUE)
	List<Terapeuta> mostrarTerapeutas() {
		return service.mostrarTerapeutas();
	}

	@GetMapping(value = "/terapeuta/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	Terapeuta mostrarTerapeutaId(@PathVariable int id) {
		return service.mostrarTerapeutaId(id);
	}

	@GetMapping(value = "/terapeuta/ciudades/{ciudad}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Terapeuta> mostrarTerapeutasCiudad(@PathVariable("ciudad") String ciudad) {

		return service.mostrarTerapeutasCiudad(ciudad);
	}

	@GetMapping(value = "/terapeuta/especialidades/{especialidad}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Terapeuta> mostrarTerapeutaEspecialidad(@PathVariable("especialidad") String especialidad,
			Model model) {

		return service.mostrarTerapeutasEspecialidad(especialidad);
	}

	@GetMapping(value = "/terapeuta/{ciudad}/{especialidad}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Terapeuta> mostrarTerapeutaCiudadEspecialidad(@PathVariable("ciudad") String ciudad,
			@PathVariable("especialidad") String especialidad) {

		return service.mostrarTerapeutaCiudadEspecialidad(ciudad, especialidad);
	}

	@PostMapping(value = "/terapeuta", consumes = MediaType.APPLICATION_JSON_VALUE)
	void insertarTerapeuta(@RequestBody Terapeuta terapeuta) {
		service.insertarTerapeuta(terapeuta);
	}

	@PutMapping(value = "/terapeuta/actualizacion/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
	void actualizarTerapeuta(@RequestBody Terapeuta terapeuta, @PathVariable("id") int id) {
		service.actualizarTerapeuta(terapeuta, id);
	}

	@DeleteMapping(value = "/terapeuta/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	void eliminarTerapeuta(@PathVariable int id) {
		service.eliminarTerapeuta(id);
	}
}
