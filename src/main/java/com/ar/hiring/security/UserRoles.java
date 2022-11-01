package com.ar.hiring.security;

import static com.ar.hiring.security.UserPermission.*;

import java.util.Set;
import java.util.stream.Collectors;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import com.google.common.collect.Sets;

public enum UserRoles {
	ASESORPROCESOSRRHH(Sets.newHashSet(PROCESOS_READ, PROCESOS_WRITE, CANDIDATO_READ)),
	ADMINISTRADORRRHH(Sets.newHashSet(PROCESOS_READ, PROCESOS_WRITE, PROCESOS_EDIT,PROCESOS_DELETE,CANDIDATO_READ,CANDIDATO_EDIT)),
	GERENTERRHH(Sets.newHashSet(PROCESOS_READ, PROCESOS_WRITE, PROCESOS_EDIT,PROCESOS_ACEPT_APLICATION,PROCESOS_DELETE,CANDIDATO_READ)),
	ADMIN(Sets.newHashSet(PROCESOS_READ, PROCESOS_WRITE, PROCESOS_EDIT,PROCESOS_ACEPT_APLICATION,PROCESOS_DELETE,CANDIDATO_READ,CANDIDATO_EDIT));
	
	private Set<UserPermission> permissions;

	private UserRoles(Set<UserPermission> permissions) {
		this.permissions = permissions;
	}

	public Set<UserPermission> getPermissions() {
		return permissions;
	}
	
	public Set<SimpleGrantedAuthority> getAuthorities(){
		Set<SimpleGrantedAuthority> permission =getPermissions().stream().map(element->
			new SimpleGrantedAuthority(element.getPermission())
		).collect(Collectors.toSet());
		permission.add(new SimpleGrantedAuthority(this.name()));
		return permission;
	}
}
