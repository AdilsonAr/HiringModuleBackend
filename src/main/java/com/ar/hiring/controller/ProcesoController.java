package com.ar.hiring.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/proceso")
public class ProcesoController {
	@GetMapping
	public ResponseEntity<?> read(){
		return new ResponseEntity<String>("reading",HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<?> write(){
		return new ResponseEntity<String>("writing",HttpStatus.OK);
	}
	
	@PutMapping
	public ResponseEntity<?> edit(){
		return new ResponseEntity<String>("editing",HttpStatus.OK);
	}
	
	@DeleteMapping
	public ResponseEntity<?> delete(){
		return new ResponseEntity<String>("deleting",HttpStatus.OK);
	}
	
	@PostMapping("/acept")
	public ResponseEntity<?> acept(){
		return new ResponseEntity<String>("acepting",HttpStatus.OK);
	}
}
