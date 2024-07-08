package com.proyectoFinal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyectoFinal.dao.DaoHorarioTrabajo;
import com.proyectoFinal.model.HorarioTrabajo;

@Service
public class ServiceHorarioTrabajoImpl implements ServiceHorarioTrabajo {
	@Autowired
	DaoHorarioTrabajo dao;

	@Override
	public List<HorarioTrabajo> mostrarHorarios() {
		return dao.findAll();
	}

	@Override
	public List<HorarioTrabajo> mostrarHorarioTerapeuta(int idTerapeuta) {

		return dao.listarHorariosTerapeutaId(idTerapeuta);
	}

	@Override
	public void insertarHorario(HorarioTrabajo horarioTrabajo) {
		dao.save(horarioTrabajo);

	}

	@Override
	public void actualizarHorario(HorarioTrabajo horarioTrabajoNuevo, int id) {

		try {
			HorarioTrabajo horarioViejo = dao.findById(id).orElse(null);
			horarioViejo.setTerapeutaId(horarioTrabajoNuevo.getTerapeutaId());
			horarioViejo.setDia(horarioTrabajoNuevo.getDia());
			horarioViejo.setHoraInicio(horarioTrabajoNuevo.getHoraInicio());
			horarioViejo.setHoraFin(horarioTrabajoNuevo.getHoraFin());

			dao.save(horarioViejo);
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	@Override
	public void eliminarHorario(int id) {
		dao.deleteById(id);

	}

}
