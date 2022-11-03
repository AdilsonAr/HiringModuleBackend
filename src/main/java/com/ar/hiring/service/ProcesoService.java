package com.ar.hiring.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ar.hiring.dto.response.ProcesosDTO;
import com.ar.hiring.model.Proceso;
import com.ar.hiring.repository.ProcesoRepository;

@Service
public class ProcesoService {
	@Autowired
	ProcesoRepository procesoRepository;
	
	public  List<ProcesosDTO> readAll(){
		List<ProcesosDTO> listaRes=new ArrayList<>();
		(procesoRepository.findAll()).forEach(x->listaRes.add(ProcesosDTO.toDTO(x)));
		return listaRes;
	}
	
	public Proceso write(Proceso p) {
		return procesoRepository.save(p);
	}
	
	public Proceso update(Proceso p) {
		return procesoRepository.save(p);
	}
	
	public void delete(Proceso p) {
		procesoRepository.delete(p);
	}
	
	public Proceso readOne(long id) {
		return procesoRepository.findById(id).get();
	}
}
