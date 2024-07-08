package com.proyectoFinal.model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Reserva {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "reserva_id")
	private Long reservaId;
	@Column(name = "terapeuta_id")
	private int terapeutaId;
	@Column(name = "cliente_id")
	private int clienteId;
	private LocalDate fecha;
	@Column(name = "hora_Reserva")
	private LocalTime horaReserva;
	private int duracion;
	@Enumerated(EnumType.STRING)
	private Tipo tipoReserva;

	public Reserva() {
		super();
		
	}

	public Reserva(Long reservaId, int terapeutaId, int clienteId, LocalDate fecha, LocalTime horaReserva, int duracion,
			Tipo tipoReserva) {
		super();
		this.reservaId = reservaId;
		this.terapeutaId = terapeutaId;
		this.clienteId = clienteId;
		this.fecha = fecha;
		this.horaReserva = horaReserva;
		this.duracion = duracion;
		this.tipoReserva = tipoReserva;
	}

	public Long getReservaId() {
		return reservaId;
	}

	public void setReservaId(Long reservaId) {
		this.reservaId = reservaId;
	}

	public int getTerapeutaId() {
		return terapeutaId;
	}

	public void setTerapeutaId(int terapeutaId) {
		this.terapeutaId = terapeutaId;
	}

	public int getClienteId() {
		return clienteId;
	}

	public void setClienteId(int clienteId) {
		this.clienteId = clienteId;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public LocalTime getHoraReserva() {
		return horaReserva;
	}

	public void setHoraReserva(LocalTime horaReserva) {
		this.horaReserva = horaReserva;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public Tipo getTipoReserva() {
		return tipoReserva;
	}

	public void setTipoReserva(Tipo tipoReserva) {
		this.tipoReserva = tipoReserva;
	}

	@Override
	public int hashCode() {
		return Objects.hash(reservaId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reserva other = (Reserva) obj;
		return Objects.equals(reservaId, other.reservaId);
	}

}
