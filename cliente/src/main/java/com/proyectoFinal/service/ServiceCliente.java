package com.proyectoFinal.service;

import java.util.List;

import com.proyectoFinal.model.Cliente;

public interface ServiceCliente {

	/**
	 * Metodo que lista todos los clientes
	 * 
	 * @return Devuelve lista de pacientes
	 */
	List<Cliente> mostrarClientes();

	/**
	 * Metodo que busca un cliente por id y lo devuelve
	 * 
	 * @param id Valor que se le pasa para buscar
	 * @return Devuelve un cliente especifico
	 */
	Cliente mostrarClienteId(int id);

	/**
	 * Inserta un ciente en la base de datos
	 * 
	 * @param cliente Objeto cliente que recibe
	 */
	void insertarCliente(Cliente cliente);

	/**
	 * 
	 * Actualiza los datos de un cliente especifico en la base de datos
	
	 * @param cliente objeto cliente pasado por el cuerpo de la peticion
	 * @param id identificador unico de cliente
	 */
	void actualizarCliente(Cliente cliente, int id);

	/**
	 * Elmina un cliente de la base de datos
	 * 
	 * @param id Valor por el que encuentra el cliente a eliminar
	 */
	void eliminarCliente(int id);
}
