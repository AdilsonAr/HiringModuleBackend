package com.ar.hiring.security;

import static com.ar.hiring.security.UserRoles.ADMIN;
import static com.ar.hiring.security.UserRoles.ADMINISTRADORRRHH;
import static com.ar.hiring.security.UserRoles.ASESORPROCESOSRRHH;
import static com.ar.hiring.security.UserRoles.GERENTERRHH;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig{
	@Autowired
	PasswordEncoder pass;
	
	@Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.cors().and()
        	.csrf().disable()
        	.authorizeRequests()
        	.antMatchers("/","/css/*","/js/*").permitAll()
        	//Access for roles
        	.antMatchers(HttpMethod.PUT, "/aplicacion/acept/**").hasAnyRole(ADMIN.name(),GERENTERRHH.name())
        	.antMatchers(HttpMethod.PUT, "/proceso/**").hasAnyRole(ADMIN.name(),GERENTERRHH.name(),ADMINISTRADORRRHH.name())
    		.antMatchers(HttpMethod.DELETE, "/proceso/**").hasAnyRole(ADMIN.name(),GERENTERRHH.name(),ADMINISTRADORRRHH.name())
        	.antMatchers(HttpMethod.GET, "/proceso/**").hasAnyRole(ADMIN.name(),GERENTERRHH.name(),ADMINISTRADORRRHH.name(),ASESORPROCESOSRRHH.name())
    		.antMatchers(HttpMethod.POST, "/proceso/**").hasAnyRole(ADMIN.name(),GERENTERRHH.name(),ADMINISTRADORRRHH.name(),ASESORPROCESOSRRHH.name())
    		.anyRequest()
    		.authenticated()
    		.and().httpBasic();
    	
        return http.build();
    }
	
	@Autowired
	UserDetailsService userDetailsService;
}
