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

import com.proyectoFinal.model.Cliente;
import com.proyectoFinal.service.ServiceCliente;

@RestController
public class ControllerCliente {

	@Autowired
	ServiceCliente service;

	@GetMapping(value = "/cliente", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Cliente> mostrarClientes() {

		return service.mostrarClientes();
	}

	@GetMapping(value = "/cliente/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Cliente mostrarClienteId(@PathVariable("id") int id) {

		return service.mostrarClienteId(id);
	}

	@PostMapping(value = "/cliente", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void insertarCliente(@RequestBody Cliente cliente) {
		service.insertarCliente(cliente);

	}

	@PutMapping(value = "/cliente/actualizacion/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void actualizarCliente(@RequestBody Cliente cliente, @PathVariable("id") int id) {
		service.actualizarCliente(cliente, id);

	}

	@DeleteMapping(value = "/cliente/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public void eliminarCliente(@PathVariable("id") int id) {

		service.eliminarCliente(id);

	}
}
