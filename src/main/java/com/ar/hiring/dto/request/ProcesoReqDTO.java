package com.ar.hiring.dto.request;

import com.ar.hiring.model.Proceso;

public class ProcesoReqDTO {
	private long idProceso;
	private int duracionMeses;
	private String titulo;
	private String funciones;
	private String requerimientos;
	
	public ProcesoReqDTO(long idProceso, int duracionMeses, String titulo, String funciones, String requerimientos) {
		super();
		this.idProceso = idProceso;
		this.duracionMeses = duracionMeses;
		this.titulo = titulo;
		this.funciones = funciones;
		this.requerimientos = requerimientos;
	}
	
	public static Proceso toModel(ProcesoReqDTO p) {
		Proceso model= new Proceso(p.getDuracionMeses(),p.getTitulo(),p.getFunciones(),p.getRequerimientos());
		return model;
	}
	public ProcesoReqDTO() {
		super();
	}
	public long getIdProceso() {
		return idProceso;
	}
	public void setIdProceso(long idProceso) {
		this.idProceso = idProceso;
	}
	public int getDuracionMeses() {
		return duracionMeses;
	}
	public void setDuracionMeses(int duracionMeses) {
		this.duracionMeses = duracionMeses;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
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
	
}
