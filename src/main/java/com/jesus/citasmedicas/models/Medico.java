package com.jesus.citasmedicas.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="medicos")
public class Medico {
	@Id
	@Column(name="DNI")
	public String dni;
	@Column(name="nombre_completo")
	public String nombre;
	@Column
	public String email;
	@Column(name="contrasenia")
	public String contrasenia;
	@ManyToOne
	@JoinColumn(name="especialidad_id")
	public Especialidad especialidad;
	@OneToMany
	@JoinColumn(name="medico_id")
	public List<Cita> citas;
	
	public Medico(String dni, String nombre, String email, String contrasenia, Especialidad especialidad) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.email = email;
		this.contrasenia = contrasenia;
		this.especialidad = especialidad;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContrasenia() {
		return contrasenia;
	}
	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
	public Especialidad getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(Especialidad especialidad) {
		this.especialidad = especialidad;
	}
	public List<Cita >getCitas() {
		return citas;
	}
	public void setCitas(List<Cita> citas) {
		this.citas = citas;
	}
}
