package com.ar.hiring.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Candidato {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "candidato")
	private List<Aplicacion> aplicaciones;
	
	public Candidato(long id, String nombre, String dui, String nit, LocalDate fechaNacimiento, String licenciaConducir,
			String estadoCivil, String telefono, String correo, String habilidades, int calificacionPsicologica,
			List<Aplicacion> aplicaciones) {
		super();
		this.idCandidato = id;
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
		this.aplicaciones = aplicaciones;
	}
	public Candidato() {
		super();
	}
	public long getId() {
		return idCandidato;
	}
	public void setId(long id) {
		this.idCandidato = id;
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
	public List<Aplicacion> getAplicaciones() {
		return aplicaciones;
	}
	public void setAplicaciones(List<Aplicacion> aplicaciones) {
		this.aplicaciones = aplicaciones;
	}
	
}
