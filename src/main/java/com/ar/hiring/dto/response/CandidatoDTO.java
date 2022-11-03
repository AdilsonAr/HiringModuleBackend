package com.ar.hiring.dto.response;

import java.time.LocalDate;

import com.ar.hiring.model.Candidato;

public class CandidatoDTO {
	private long idCandidato;
	private String nombre;
	private String dui;
	private String nit;
	private LocalDate fechaNacimiento;
	private String licenciaConducir;
	private String estadoCivil;
	private String telefono;
	private String correo;
	private String habilidades;
	private int calificacionPsicologica;
	
	public CandidatoDTO() {
		super();
	}

	public CandidatoDTO(long idCandidato, String nombre, String dui, String nit, LocalDate fechaNacimiento,
			String licenciaConducir, String estadoCivil, String telefono, String correo, String habilidades,
			int calificacionPsicologica) {
		super();
		this.idCandidato = idCandidato;
		this.nombre = nombre;
		this.dui = dui;
		this.nit = nit;
		this.fechaNacimiento = fechaNacimiento;
		this.licenciaConducir = licenciaConducir;
		this.estadoCivil = estadoCivil;
		this.telefono = telefono;
		this.correo = correo;
		this.habilidades = habilidades;
		this.calificacionPsicologica = calificacionPsicologica;
	}

	public static CandidatoDTO toDTO(Candidato c) {
		CandidatoDTO dto = new CandidatoDTO(c.getId(),c.getNombre(),c.getDui(),c.getNit(),c.getFechaNacimiento()
				,c.getLicenciaConducir(),c.getEstadoCivil(),c.getTelefono(),c.getCorreo(),c.getHabilidades(),c.getCalificacionPsicologica());
		return dto;
	}

	public long getIdCandidato() {
		return idCandidato;
	}

	public void setIdCandidato(long idCandidato) {
		this.idCandidato = idCandidato;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDui() {
		return dui;
	}

	public void setDui(String dui) {
		this.dui = dui;
	}

	public String getNit() {
		return nit;
	}

	public void setNit(String nit) {
		this.nit = nit;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getLicenciaConducir() {
		return licenciaConducir;
	}

	public void setLicenciaConducir(String licenciaConducir) {
		this.licenciaConducir = licenciaConducir;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getHabilidades() {
		return habilidades;
	}

	public void setHabilidades(String habilidades) {
		this.habilidades = habilidades;
	}

	public int getCalificacionPsicologica() {
		return calificacionPsicologica;
	}

	public void setCalificacionPsicologica(int calificacionPsicologica) {
		this.calificacionPsicologica = calificacionPsicologica;
	}
	
}
