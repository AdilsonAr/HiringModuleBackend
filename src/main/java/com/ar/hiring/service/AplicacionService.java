package com.ar.hiring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ar.hiring.model.Aplicacion;
import com.ar.hiring.repository.AplicacionRepository;

@Service
public class AplicacionService {
	@Autowired
	AplicacionRepository repo;
	
	public Aplicacion readOne(long id) {
		return repo.findById(id).get();
	}
	
	public void update(Aplicacion a) {
		repo.save(a);
	}
}
