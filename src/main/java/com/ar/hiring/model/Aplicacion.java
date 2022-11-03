package com.ar.hiring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Aplicacion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@ManyToOne
	@JoinColumn(name = "idProceso")
	private Proceso proceso;
	@ManyToOne
	@JoinColumn(name = "idCandidato")
	private Candidato candidato;
	private String aceptada;
	
	public String getAceptada() {
		return aceptada;
	}
	public void setAceptada(String aceptada) {
		this.aceptada = aceptada;
	}
	public Aplicacion(long id, Proceso proceso, Candidato candidato, String aceptada) {
		super();
		this.id = id;
		this.proceso = proceso;
		this.candidato = candidato;
		this.aceptada = aceptada;
	}
	public Aplicacion() {
		super();
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Proceso getProceso() {
		return proceso;
	}
	public void setProceso(Proceso proceso) {
		this.proceso = proceso;
	}
	public Candidato getCandidato() {
		return candidato;
	}
	public void setCandidato(Candidato candidato) {
		this.candidato = candidato;
	}
	
}
