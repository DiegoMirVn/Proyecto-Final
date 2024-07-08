package com.proyectoFinal.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.proyectoFinal.dao.DaoReserva;
import com.proyectoFinal.model.Reserva;

import jakarta.persistence.EntityNotFoundException;

@Service
public class ServiceReservaImpl implements ServiceReserva {
	@Autowired
	DaoReserva dao;

	@Override
	public List<Reserva> mostrarTodasReservas() {

		return dao.findAll();
	}

	@Override
	public Reserva mostrarReservaPorId(Long id) {

		return dao.findById(id).orElse(null);
	}

	@Override
	public List<Reserva> mostrarReservaPorIdTerapeuta(int idTerapeuta) {

		return dao.mostrarReservasTerapeuta(idTerapeuta);
	}

	@Override
	public List<Reserva> mostrarReservaPorIdCliente(int idCliente) {

		return dao.mostrarReservasCliente(idCliente);
	}

	@Override
	public Reserva insertarReserva(Reserva reserva) {

		return dao.save(reserva);
	}

	@Override
	public Reserva actualizarReserva(Reserva reserva, Long id) {
		Reserva viejaReserva = null;
		try {
			viejaReserva = dao.findById(id).orElse(null);
			if (viejaReserva != null) {
				viejaReserva.setTerapeutaId(reserva.getTerapeutaId());
				viejaReserva.setClienteId(reserva.getClienteId());
				viejaReserva.setFecha(reserva.getFecha());
				viejaReserva.setHoraReserva(reserva.getHoraReserva());
				viejaReserva.setDuracion(reserva.getDuracion());
				viejaReserva.setTipoReserva(reserva.getTipoReserva());

				dao.save(viejaReserva);
			} else {
				throw new EntityNotFoundException("Reserva con ID " + id + " no existe");
			}
		} catch (Exception e) {

			e.printStackTrace();
		}

		return viejaReserva;
	}

	@Override
	public Reserva eliminarReserva(Long id) {
		Reserva reservaEliminar = null;
		try {
			Optional<Reserva> optionalReserva = dao.findById(id);

			if (optionalReserva.isPresent()) {
				reservaEliminar = optionalReserva.get();
				dao.deleteById(id);
			} else {
				throw new EntityNotFoundException("Reserva con ID " + id + " no encontrada");
			}

		} catch (EntityNotFoundException e) {
			e.printStackTrace();

		} catch (Exception e) {
			e.printStackTrace();

		}
		return reservaEliminar;
	}

}
