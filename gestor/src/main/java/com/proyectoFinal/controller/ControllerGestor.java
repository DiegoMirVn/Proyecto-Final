package com.proyectoFinal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.proyectoFinal.model.Especialidad;
import com.proyectoFinal.model.Terapeuta;
import com.proyectoFinal.service.ServiceGestor;

@RestController
public class ControllerGestor {

	@Autowired
	ServiceGestor service;

	@GetMapping(value = "/busqueda", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Terapeuta> buscarTerapeutasDisponibles(@RequestParam(name = "ciudad") String ciudad,
			@RequestParam(name = "especialidad") String especialidad) {

		return service.listarTerapeutasDisponibles(ciudad, especialidad);
	}

	
}
