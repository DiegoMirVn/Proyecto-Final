package com.proyectoFinal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyectoFinal.dao.DaoCliente;
import com.proyectoFinal.model.Cliente;

@Service
public class ServiceClienteImpl implements ServiceCliente {

	@Autowired
	DaoCliente dao;

	@Override
	public List<Cliente> mostrarClientes() {

		return dao.findAll();
	}

	@Override
	public Cliente mostrarClienteId(int id) {

		return dao.findById(id).orElse(null);
	}

	@Override
	public void insertarCliente(Cliente cliente) {
		dao.save(cliente);

	}

	@Override
	public void actualizarCliente(Cliente cliente, int id) {
		Cliente clienteActualizar = null;
		try {
			clienteActualizar = dao.findById(id).orElse(cliente);

			clienteActualizar.setNombre(cliente.getNombre());
			clienteActualizar.setApellido1(cliente.getApellido1());
			clienteActualizar.setApellido2(cliente.getApellido2());
			clienteActualizar.setEmail(cliente.getEmail());
			clienteActualizar.setPais(cliente.getPais());
			clienteActualizar.setLocalidad(cliente.getLocalidad());
			clienteActualizar.setFechaNacimiento(cliente.getFechaNacimiento());
			clienteActualizar.setGenero(cliente.getGenero());

		} catch (Exception e) {

			e.printStackTrace();
		}

		dao.save(clienteActualizar);

	}

	@Override
	public void eliminarCliente(int id) {

		dao.deleteById(id);

	}

}
