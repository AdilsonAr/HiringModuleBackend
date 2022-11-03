package com.ar.hiring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ar.hiring.model.Candidato;
import com.ar.hiring.repository.CandidatoRepository;

@Service
public class CandidatoService {
	@Autowired
	CandidatoRepository repo;
	
	public Candidato readOne(long id) {
		return repo.findById(id).get();
	}
	
	public void update(Candidato c) {
		repo.save(c);
	}
}
