package com.ar.hiring.dto.response;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.ar.hiring.model.Proceso;

public class ProcesosDTO {
	
	private long idProceso;
	private int duracionMeses;
	private String titulo;
	private String funciones;
	private String requerimientos;
	private String closed;
	private LocalDate apertura;
	private List<CandidatoDTO> candidatos;
	
	public ProcesosDTO() {
		super();
	}

	public ProcesosDTO(long idProceso, int duracionMeses, String titulo, String funciones, String requerimientos,
			String closed, LocalDate apertura, List<CandidatoDTO> candidatos) {
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

	public List<CandidatoDTO> getCandidatos() {
		return candidatos;
	}

	public void setCandidatos(List<CandidatoDTO> candidatos) {
		this.candidatos = candidatos;
	}

	public static ProcesosDTO toDTO(Proceso p) {
		List<CandidatoDTO> candidatosDtos=new ArrayList<>();
		p.getCandidatos().forEach(x->candidatosDtos.add(CandidatoDTO.toDTO(x.getCandidato(),x)));
		ProcesosDTO dto=new ProcesosDTO(p.getId(),p.getDuracionMeses(),p.getTitulo(),p.getFunciones(),p.getRequerimientos(),p.getClosed(),p.getApertura(),candidatosDtos);
		return dto;
	}
}
