package com.ar.hiring.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Proceso {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idProceso;
	private int duracionMeses;
	@Column(columnDefinition = "TEXT")
	private String titulo;
	@Column(columnDefinition = "TEXT")
	private String funciones;
	@Column(columnDefinition = "TEXT")
	private String requerimientos;
	private String closed;
	private LocalDate apertura;
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "proceso")
	private List<Aplicacion> candidatos;
	
	public Proceso() {
		super();
	}
	
	public Proceso(long idProceso, int duracionMeses, String titulo, String funciones, String requerimientos,
			String closed, LocalDate apertura, List<Aplicacion> candidatos) {
		super();
		this.idProceso = idProceso;
		this.duracionMeses = duracionMeses;
		this.titulo = titulo;
		this.funciones = funciones;
		this.requerimientos = requerimientos;
		this.closed = closed;
		this.apertura = apertura;
		this.candidatos = candidatos;
	}
	
	public Proceso(int duracionMeses, String titulo, String funciones, String requerimientos,
			String closed, LocalDate apertura) {
		super();
		this.duracionMeses = duracionMeses;
		this.titulo = titulo;
		this.funciones = funciones;
		this.requerimientos = requerimientos;
		this.closed = closed;
		this.apertura = apertura;
	}
	
	public long getIdProceso() {
		return idProceso;
	}

	public void setIdProceso(long idProceso) {
		this.idProceso = idProceso;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public long getId() {
		return idProceso;
	}
	public void setId(long id) {
		this.idProceso = id;
	}
	public int getDuracionMeses() {
		return duracionMeses;
	}
	public void setDuracionMeses(int duracionMeses) {
		this.duracionMeses = duracionMeses;
	}
	public String getFunciones() {
		return funciones;
	}
	public void setFunciones(String funciones) {
		this.funciones = funciones;
	}
	public String getRequerimientos() {
		return requerimientos;
	}
	public void setRequerimientos(String requerimientos) {
		this.requerimientos = requerimientos;
	}
	public String getClosed() {
		return closed;
	}
	public void setClosed(String closed) {
		this.closed = closed;
	}
	public LocalDate getApertura() {
		return apertura;
	}
	public void setApertura(LocalDate apertura) {
		this.apertura = apertura;
	}
	public List<Aplicacion> getCandidatos() {
		return candidatos;
	}
	public void setCandidatos(List<Aplicacion> candidatos) {
		this.candidatos = candidatos;
	}
	
}
