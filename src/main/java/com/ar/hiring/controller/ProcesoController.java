package com.ar.hiring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ar.hiring.dto.request.ProcesoReqDTO;
import com.ar.hiring.dto.response.ProcesosDTO;
import com.ar.hiring.model.Aplicacion;
import com.ar.hiring.model.Proceso;
import com.ar.hiring.service.AplicacionService;
import com.ar.hiring.service.ProcesoService;

@RestController
@RequestMapping("/proceso")
public class ProcesoController {
	@Autowired
	ProcesoService procesoService;
	@Autowired
	AplicacionService appService;
	
	@GetMapping
	public ResponseEntity<?> read(){
		return new ResponseEntity<List<ProcesosDTO>>(procesoService.readAll(),HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<?> write(@RequestBody ProcesoReqDTO p){
		procesoService.write(ProcesoReqDTO.toModel(p));
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	@PutMapping
	public ResponseEntity<?> edit(@RequestBody ProcesoReqDTO p){
		Proceso proceso= procesoService.readOne(p.getIdProceso());
		Proceso procesoNew=ProcesoReqDTO.toModel(p);
		procesoNew.setCandidatos(proceso.getCandidatos());
		procesoService.update(procesoNew);
		return new ResponseEntity<String>(HttpStatus.OK);
	}
	
	@DeleteMapping
	public ResponseEntity<?> delete(@RequestParam("id") long id){
		Proceso proceso= procesoService.readOne(id);
		procesoService.delete(proceso);
		return new ResponseEntity<String>(HttpStatus.OK);
	}
	
	@PostMapping("/acept")
	public ResponseEntity<?> acept(@RequestParam("id_aplicacion") long id_aplicacion){
		Aplicacion a=appService.readOne(id_aplicacion);
		a.setAceptada("S");
		appService.update(a);
		return new ResponseEntity<String>(HttpStatus.CREATED);
	}
}
