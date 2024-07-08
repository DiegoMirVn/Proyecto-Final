package com.proyectoFinal.model;

import java.time.LocalTime;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "horario_trabajo")
public class HorarioTrabajo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "terapeuta_id")
	private int terapeutaId;
	@Enumerated(EnumType.STRING)
	@Column(name = "dia_semana")
	private DiaSemana dia;
	@Column(name = "hora_inicio")
	private LocalTime horaInicio;
	@Column(name = "hora_fin")
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
