package com.jesus.citasmedicas.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="citas")
public class Cita {
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int id;
	@Column(name="fecha")
	public Date fecha;
	@ManyToOne
	@JoinColumn(name = "medico_id")
	public Medico medico;
	@ManyToOne
	@JoinColumn(name = "cliente_id")
	public Cliente cliente;
	@Column(name ="estado")
	public Estado estado;
	public Cita(int id, Date fecha, Medico medico) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.medico = medico;
		this.estado = Estado.DISPONIBLE;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Medico getMedico() {
		return medico;
	}
	public void setMedico(Medico medico) {
		this.medico = medico;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	public enum Estado{
		DISPONIBLE, OCUPADA, CANCELADA, FALTA
	}
}
