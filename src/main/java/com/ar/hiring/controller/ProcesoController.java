package com.ar.hiring.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
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
import com.ar.hiring.model.Proceso;
import com.ar.hiring.service.ProcesoService;

@CrossOrigin
@RestController
@RequestMapping("/proceso")
public class ProcesoController {
	@Autowired
	ProcesoService procesoService;
	
	@GetMapping
	public ResponseEntity<?> read(){
		return new ResponseEntity<List<ProcesosDTO>>(procesoService.readAll(),HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<?> write(@RequestBody ProcesoReqDTO p){
		System.out.println("duracion: "+p.getDuracionMeses());
		Proceso pro=ProcesoReqDTO.toModel(p);
		pro.setApertura(LocalDate.now());
		pro.setClosed("N");
		procesoService.write(pro);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	@PutMapping
	public ResponseEntity<?> edit(@RequestBody ProcesoReqDTO p){
		Proceso proceso= procesoService.readOne(p.getIdProceso());
		proceso.setDuracionMeses(p.getDuracionMeses());
		proceso.setRequerimientos(p.getRequerimientos());
		proceso.setFunciones(p.getFunciones());
		proceso.setTitulo(p.getTitulo());
		procesoService.update(proceso);
		return new ResponseEntity<String>(HttpStatus.OK);
	}
	
	@DeleteMapping
	public ResponseEntity<?> delete(@RequestParam("id") long id){
		Proceso proceso= procesoService.readOne(id);
		procesoService.delete(proceso);
		return new ResponseEntity<String>(HttpStatus.OK);
	}
	
}
