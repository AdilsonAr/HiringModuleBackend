package com.ar.hiring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ar.hiring.model.Proceso;

@Repository
public interface ProcesoRepository extends JpaRepository<Proceso, Long>{

}
