package com.jesus.citasmedicas.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="administradores")
public class Administrador {
	@Id
	@Column(name="DNI")
	public String dni;
	@Column(name="nombre_completo")
	public String nombre;
	 @Column(name="contrasenia")
	public String contrasenia;
	  
	public Administrador(String dni, String nombre, String contrasenia) {
		 super();
		 this.dni = dni;
		 this.nombre = nombre;
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

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
}
