package com.ar.hiring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ar.hiring.model.Aplicacion;

@Repository
public interface AplicacionRepository extends JpaRepository<Aplicacion, Long> {

}
