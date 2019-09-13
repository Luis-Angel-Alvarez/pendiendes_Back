package com.pendientes.modelo.entidades.solicitudes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "pendiente")
public class PendienteS {
	
	@JsonIgnore
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idpendiente")
    public int idPendiente;
	
	@JsonProperty("pendiente")
	@Column(name = "pendiente")
    public String pendiente;
	
	@JsonIgnore
	@Column(name = "fechapendiente")
	@Temporal(TemporalType.TIMESTAMP)
	public java.util.Date fechapendiente= new java.util.Date();

	public PendienteS() {
		super();
	}

	public PendienteS(int idPendiente, String pendiente, Date fechapendiente) {
		super();
		this.idPendiente = idPendiente;
		this.pendiente = pendiente;
		this.fechapendiente = fechapendiente;
	}

	public PendienteS(String pendiente, Date fechapendiente) {
		super();
		this.pendiente = pendiente;
		this.fechapendiente = fechapendiente;
	}
	public PendienteS(String pendiente) {
		super();
		this.pendiente = pendiente;
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
