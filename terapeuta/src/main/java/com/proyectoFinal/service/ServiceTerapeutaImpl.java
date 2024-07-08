package com.proyectoFinal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyectoFinal.dao.DaoTerapeuta;
import com.proyectoFinal.model.Especialidad;
import com.proyectoFinal.model.Terapeuta;

@Service
public class ServiceTerapeutaImpl implements ServiceTerapeuta {
	@Autowired
	DaoTerapeuta dao;

	@Override
	public List<Terapeuta> mostrarTerapeutas() {

		return dao.findAll();

	}

	@Override
	public Terapeuta mostrarTerapeutaId(int id) {

		return dao.findById(id).orElse(null);
	}

	@Override
	public List<Terapeuta> mostrarTerapeutasCiudad(String ciudad) {

		return dao.mostrarTerapeutasCiudad(ciudad);
	}

	@Override
	public List<Terapeuta> mostrarTerapeutasEspecialidad(String especialidad) {

		return dao.mostrarTerapeutasEspecialidad(Especialidad.fromString(especialidad));
	}

	@Override
	public List<Terapeuta> mostrarTerapeutaCiudadEspecialidad(String ciudad, String especialidad) {

		Especialidad especialidadClase = Especialidad.fromString(especialidad);

		boolean especialidadCoincide = dao.findAll().stream().map(tera -> tera.getEspecialidad())
				.anyMatch(teraEsp -> teraEsp.equals(especialidadClase));

		try {
			if (!especialidadCoincide) {
				throw new Exception("La especialidad no coincide con ninguna en la base de datos.");
			}

		} catch (Exception e) {

			e.printStackTrace();

		}

		return dao.mostrarTerapeutaCiudadEspecialidad(ciudad, especialidadClase);
	}

	@Override
	public void insertarTerapeuta(Terapeuta terapeuta) {
		dao.save(terapeuta);

	}

	@Override
	public void actualizarTerapeuta(Terapeuta terapeuta, int id) {

		try {
			Terapeuta terapeutaActualizar = null;
			terapeutaActualizar = dao.findById(id).orElse(terapeuta);

			terapeutaActualizar.setNombre(terapeuta.getNombre());
			terapeutaActualizar.setApellido1(terapeuta.getApellido1());
			terapeutaActualizar.setApellido2(terapeuta.getApellido2());
			terapeutaActualizar.setTelefono(terapeuta.getTelefono());

			dao.save(terapeutaActualizar);

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	@Override
	public void eliminarTerapeuta(int id) {

		dao.deleteById(id);

	}

}
