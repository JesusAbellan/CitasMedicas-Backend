package com.jesus.citasmedicas.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name="clientes")
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	public int id;
	@Column(name="DNI")
	public String dni;
	@Column(name="nombre_completo")
	public String nombre;
	@Column
	public String email;
	@Column(name="contrasenia")
	public String contrasenia;
	@OneToMany
	@JoinColumn(name="cliente_id")
	public List<Cita> citas;

	public Cliente(String dni, String nombre, String email, String contrasenia) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.email = email;
		this.contrasenia = contrasenia;
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
	
	public List<Cita> getCitas() {
		return citas;
	}
	
	public void setCitas(List<Cita> citas) {
		this.citas = citas;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
