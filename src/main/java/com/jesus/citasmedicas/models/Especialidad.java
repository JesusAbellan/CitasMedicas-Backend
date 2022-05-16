package com.jesus.citasmedicas.models;

import javax.persistence.Column;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="especialidades")
public class Especialidad {
	@Id
	@Column(name="ID")
	public String id;
	@Column(name="nombre_especialidad")
	public String especialidad;
	@OneToMany
	@JoinColumn(name="especialidad_id")
	public List<Medico>medico;
	public Especialidad(String id, String especialidad, List<Medico> medico) {
		super();
		this.id = id;
		this.especialidad = especialidad;
		this.medico = medico;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	public List<Medico> getMedico() {
		return medico;
	}
	public void setMedico(List<Medico> medico) {
		this.medico = medico;
	}
}
