package com.proyectoFinal.service;

import java.util.Arrays;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.web.client.RestTemplate;

import com.proyectoFinal.model.Terapeuta;

@Service
public class ServiceGestorImpl implements ServiceGestor {
	@Autowired
	RestTemplate template;

	private final String urlTerapeuta = "http://localhost:8000/terapeuta";
	private final String urlHorario = "http://localhost:8000/horario";
	private final String urlReserva = "http://localhost:8000/reserva";

	@Override
	public List<Terapeuta> listarTerapeutasDisponibles(String ciudad, String especialidad) {

		Terapeuta[] lista = template.getForObject(urlTerapeuta + "/" + ciudad + "/" + especialidad, Terapeuta[].class);

		return Arrays.asList(lista);
	}

	@Override
	public List<Terapeuta> listarTerapeutasCiudad(String ciudad) {

		Terapeuta[] lista = template.getForObject(urlTerapeuta + "/ciudades/" + ciudad, Terapeuta[].class);

		return Arrays.asList(lista);
	}

	@Override
	public List<Terapeuta> listarTerapeutasEspecialidad(String especialidad) {

		Terapeuta[] lista = template.getForObject(urlTerapeuta + "/especialidades/ " + especialidad, Terapeuta[].class);

		return Arrays.asList(lista);
	}

	
}
