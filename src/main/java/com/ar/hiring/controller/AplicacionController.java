package com.ar.hiring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ar.hiring.model.Aplicacion;
import com.ar.hiring.service.AplicacionService;

@CrossOrigin
@RestController
@RequestMapping("/aplicacion")
public class AplicacionController {
	@Autowired
	AplicacionService appService;
	
	@PutMapping("/acept")
	public ResponseEntity<?> acept(@RequestParam("id_aplicacion") long id_aplicacion){
		Aplicacion a=appService.readOne(id_aplicacion);
		a.setAceptada("S");
		appService.update(a);
		return new ResponseEntity<String>(HttpStatus.OK);
	}
}
