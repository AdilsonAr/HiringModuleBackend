package com.ar.hiring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ar.hiring.model.Candidato;

@Repository
public interface CandidatoRepository extends JpaRepository<Candidato, Long> {

}
