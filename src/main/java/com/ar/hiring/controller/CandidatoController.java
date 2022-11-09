package com.ar.hiring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ar.hiring.dto.request.CalificacionReqDTO;
import com.ar.hiring.model.Candidato;
import com.ar.hiring.service.CandidatoService;

@CrossOrigin
@RestController
@RequestMapping("/candidato")
public class CandidatoController {
	@Autowired
	CandidatoService service;
	@GetMapping
	public ResponseEntity<?> read(){
		return new ResponseEntity<String>("reading",HttpStatus.OK);
	}
	
	@PutMapping
	public ResponseEntity<?> edit(@RequestBody CalificacionReqDTO c){
		Candidato ini=service.readOne(c.getIdCandidato());
		ini.setCalificacionPsicologica(c.getCalificacionPsicologica());
		service.update(ini);
		return new ResponseEntity<String>(HttpStatus.OK);
	}
}
