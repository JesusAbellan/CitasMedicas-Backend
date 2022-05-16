package com.jesus.citasmedicas.dto;

import java.util.List;

import com.jesus.citasmedicas.models.Cita;

public class ClienteRegistroDTO {
	public String dni;
	public String nombre;	
	public String email;
	public String contrasenia;
	public List<Cita> citas;
	
	public ClienteRegistroDTO() {
		super();
	}
	public ClienteRegistroDTO(String email) {
		super();
		this.email = email;
	}
	public ClienteRegistroDTO(String nombre, String email, String contrasenia) {
		super();
		this.nombre = nombre;
		this.email = email;
		this.contrasenia = contrasenia;
	}
	public ClienteRegistroDTO(String dni, String nombre, String email, String contrasenia, List<Cita> citas) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.email = email;
		this.contrasenia = contrasenia;
		this.citas = citas;
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
	
}
