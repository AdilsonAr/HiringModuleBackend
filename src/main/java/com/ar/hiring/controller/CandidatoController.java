package com.ar.hiring.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/candidato")
public class CandidatoController {
	@GetMapping
	public ResponseEntity<?> read(){
		return new ResponseEntity<String>("reading",HttpStatus.OK);
	}
	
	@PutMapping
	public ResponseEntity<?> edit(){
		return new ResponseEntity<String>("editing",HttpStatus.OK);
	}
}
