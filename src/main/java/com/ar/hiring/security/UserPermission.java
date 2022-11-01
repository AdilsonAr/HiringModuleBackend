package com.ar.hiring.security;

public enum UserPermission {
	PROCESOS_READ("procesos:read"),
	PROCESOS_WRITE("procesos:write"),
	PROCESOS_EDIT("procesos:edit"),
	PROCESOS_ACEPT_APLICATION("procesos:acept"),
	PROCESOS_DELETE("procesos:delete"),
	
	CANDIDATO_READ("person:read"),
	CANDIDATO_EDIT("person:edit");
	
	private String permission;
	
	private UserPermission(String permission) {
		this.permission = permission;
	}

	public String getPermission() {
		return permission;
	}
}
