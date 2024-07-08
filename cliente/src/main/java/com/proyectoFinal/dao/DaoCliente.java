package com.proyectoFinal.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyectoFinal.model.Cliente;

public interface DaoCliente extends JpaRepository<Cliente, Integer>{

}
