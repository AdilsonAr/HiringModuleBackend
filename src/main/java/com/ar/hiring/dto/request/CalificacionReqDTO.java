package com.ar.hiring.dto.request;

public class CalificacionReqDTO {
	private long idCandidato;
	private int calificacionPsicologica;
	public CalificacionReqDTO(long idCandidato, int calificacionPsicologica) {
		super();
		this.idCandidato = idCandidato;
		this.calificacionPsicologica = calificacionPsicologica;
	}
	public CalificacionReqDTO() {
		super();
	}
	public long getIdCandidato() {
		return idCandidato;
	}
	public void setIdCandidato(long idCandidato) {
		this.idCandidato = idCandidato;
	}
	public int getCalificacionPsicologica() {
		return calificacionPsicologica;
	}
	public void setCalificacionPsicologica(int calificacionPsicologica) {
		this.calificacionPsicologica = calificacionPsicologica;
	}
	
}
