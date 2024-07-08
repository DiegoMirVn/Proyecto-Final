package com.proyectoFinal.model;

import java.time.LocalTime;

import java.util.Objects;

public class HorarioTrabajo {

	private Long id;

	private int terapeutaId;

	private DiaSemana dia;
	private LocalTime horaInicio;
	private LocalTime horaFin;

	public HorarioTrabajo() {
		super();

	}

	public HorarioTrabajo(Long id, int terapeutaId, DiaSemana dia, LocalTime horaInicio, LocalTime horaFin) {
		super();
		this.id = id;
		this.terapeutaId = terapeutaId;
		this.dia = dia;
		this.horaInicio = horaInicio;
		this.horaFin = horaFin;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getTerapeutaId() {
		return terapeutaId;
	}

	public void setTerapeutaId(int terapeutaId) {
		this.terapeutaId = terapeutaId;
	}

	public DiaSemana getDia() {
		return dia;
	}

	public void setDia(DiaSemana dia) {
		this.dia = dia;
	}

	public LocalTime getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(LocalTime horaInicio) {
		this.horaInicio = horaInicio;
	}

	public LocalTime getHoraFin() {
		return horaFin;
	}

	public void setHoraFin(LocalTime horaFin) {
		this.horaFin = horaFin;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HorarioTrabajo other = (HorarioTrabajo) obj;
		return Objects.equals(id, other.id);
	}

}
