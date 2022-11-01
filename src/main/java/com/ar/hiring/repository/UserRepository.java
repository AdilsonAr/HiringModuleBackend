package com.ar.hiring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ar.hiring.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	User findByCorreo(String correo);
}
