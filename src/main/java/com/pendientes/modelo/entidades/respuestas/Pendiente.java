package com.pendientes.modelo.entidades.respuestas;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@Entity
@Table(name = "pendiente")
public class Pendiente {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idpendiente")
    public int idPendiente;
	
	@Column(name = "pendiente")
    public String pendiente;
	
	@Column(name = "fechapendiente")
	@Temporal(TemporalType.TIMESTAMP)
	public java.util.Date fechapendiente;

	public Pendiente() {
		super();
	}

	public Pendiente(int idPendiente, String pendiente, Date fechapendiente) {
		super();
		this.idPendiente = idPendiente;
		this.pendiente = pendiente;
		this.fechapendiente = fechapendiente;
	}

	public Pendiente(String pendiente, Date fechapendiente) {
		super();
		this.pendiente = pendiente;
		this.fechapendiente = fechapendiente;
	}

	public int getIdPendiente() {
		return idPendiente;
	}

	public void setIdPendiente(int idPendiente) {
		this.idPendiente = idPendiente;
	}

	public String getPendiente() {
		return pendiente;
	}

	public void setPendiente(String pendiente) {
		this.pendiente = pendiente;
	}

	public java.util.Date getFechapendiente() {
		return fechapendiente;
	}

	public void setFechapendiente(java.util.Date fechapendiente) {
		this.fechapendiente = fechapendiente;
	}
	
	
}
