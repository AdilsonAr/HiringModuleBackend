package com.ar.hiring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Candidato {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
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
}
