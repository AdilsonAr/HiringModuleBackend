package com.ar.hiring.service;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.ar.hiring.model.User;
import com.ar.hiring.repository.UserRepository;
import static com.ar.hiring.security.UserRoles.*;

@Service
public class UserService implements UserDetailsService{
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private PasswordEncoder enc;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		return userRepository.findByCorreo(username);
	}
	
	@PostConstruct
	private void init() {
		User u=new User();
		u.setCargo("gerente");
		u.setCorreo("pol@app.com");
		u.setDui("23495637-5");
		u.setNombre("pol");
		u.setPass("pol123");
		u.setRole(GERENTERRHH.name());
		u.setTelefono("2365-4398");
		createUser(u);
		
		 u=new User();
		u.setCargo("admin");
		u.setCorreo("karla@app.com");
		u.setDui("05682345-5");
		u.setNombre("karla");
		u.setPass("karla123");
		u.setRole(ADMIN.name());
		u.setTelefono("9832-4398");
		createUser(u);
		
		 u=new User();
		u.setCargo("adminrrhh");
		u.setCorreo("ana@app.com");
		u.setDui("9238487-5");
		u.setNombre("ana");
		u.setPass("ana123");
		u.setRole(ADMINISTRADORRRHH.name());
		u.setTelefono("6588-4398");
		createUser(u);
		
		 u=new User();
		u.setCargo("asesor");
		u.setCorreo("adrian@app.com");
		u.setDui("24584329-5");
		u.setNombre("adrian");
		u.setPass("adrian123");
		u.setRole(ASESORPROCESOSRRHH.name());
		u.setTelefono("7633-4398");
		createUser(u);
	}
	
	private User createUser(User u) {
		u.setPass(enc.encode(u.getPass()));
		return userRepository.save(u);
	}
}
