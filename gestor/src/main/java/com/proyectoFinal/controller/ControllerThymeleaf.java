package com.proyectoFinal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.proyectoFinal.model.Terapeuta;
import com.proyectoFinal.service.ServiceGestor;

@Controller
public class ControllerThymeleaf {
	@Autowired
	ServiceGestor service;

	// Método adicional para renderizar una página HTML utilizando Thymeleaf
	@GetMapping("/listaTerapeutas")
	public String listarTerapeutasHTML(@RequestParam(name = "ciudad") String ciudad,
			@RequestParam(name = "especialidad") String especialidadString, Model model) {

		List<Terapeuta> terapeutas = service.listarTerapeutasDisponibles(ciudad, especialidadString);

		if (terapeutas.isEmpty()) {
			return "redirect:/sinTerapeutas";
		}
		model.addAttribute("terapeutas", terapeutas);
		return "listado";
	}

	/**
	 * Genera una lista de terapeutas que tienen la ciudad que se le pasa por
	 * parametro en la peticion Get
	 * 
	 * @param ciudad
	 * @param model
	 * @return Lista de Terapeutas filtrado por ciudad
	 */
	@GetMapping("/ciudades")
	public String listarCiudadesHTML(@RequestParam(name = "ciudad") String ciudad, Model model) {

		List<Terapeuta> terapeutas = service.listarTerapeutasCiudad(ciudad);

		if (terapeutas.isEmpty()) {
			return "redirect:/sinTerapeutas";
		}

		model.addAttribute("terapeutas", terapeutas);
		return "listado";
	}

	/**
	 * Genera una lista de terapeuta que tienen la especialidad que se le pasas por
	 * parametro en la peticion Get
	 * 
	 * @param especialidadString
	 * @param model
	 * @return Lista de Terapeutas filtrados por especialidad
	 */
	@GetMapping("/especialidades")
	public String listarEspecialidadesHTML(@RequestParam(name = "especialidad") String especialidadString,
			Model model) {

		List<Terapeuta> terapeutas = service.listarTerapeutasEspecialidad(especialidadString);

		if (terapeutas.isEmpty()) {
			return "redirect:/sinTerapeutas";
		}

		model.addAttribute("terapeutas", terapeutas);
		return "listado";
	}

	// Método adicional para la página cuando no hay terapeutas disponibles
	@GetMapping("/sinTerapeutas")
	public String sinTerapeutasHTML() {
		return "sinTerapeuta";
	}

	
}
