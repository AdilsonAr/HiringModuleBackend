package com.ar.hiring.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ar.hiring.dto.response.KeyValue;

@CrossOrigin
@RestController
@RequestMapping("/login")
public class LoginController {
	@GetMapping
	public ResponseEntity<?> read(Authentication a){
		KeyValue keyval=new KeyValue("role", ( (List<SimpleGrantedAuthority>)a.getAuthorities()).get(0).getAuthority() );
		return new ResponseEntity<KeyValue>(keyval,HttpStatus.OK);
	}
}
