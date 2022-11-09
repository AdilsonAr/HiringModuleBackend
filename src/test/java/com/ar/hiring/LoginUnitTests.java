package com.ar.hiring;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@SpringBootTest
@AutoConfigureMockMvc
class LoginUnitTests {
	@Autowired
    private MockMvc mockMvc;
	
	@Test
	@DisplayName("Este test pasa si un ADMIN puede hacer GET a /login")
	@WithMockUser(roles = "ADMIN")
	void accessToLoginAsAdmin() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/login")
	            .accept(MediaType.ALL))
	            .andExpect(status().isOk());
	}
	
	@Test
	@DisplayName("Este test pasa si un GERENTERRHH puede hacer GET a /login")
	@WithMockUser(roles = "GERENTERRHH")
	void accessToLoginAsGerente() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/login")
	            .accept(MediaType.ALL))
	            .andExpect(status().isOk());
	}
	
	@Test
	@DisplayName("Este test pasa si un ASESORPROCESOSRRHH puede hacer GET a /login")
	@WithMockUser(roles = "ASESORPROCESOSRRHH")
	void accessToLoginAsAsesor() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/login")
	            .accept(MediaType.ALL))
	            .andExpect(status().isOk());
	}
	
	@Test
	@DisplayName("Este test pasa si un ADMINISTRADORRRHH puede hacer GET a /login")
	@WithMockUser(roles = "ADMINISTRADORRRHH")
	void accessToLoginAsAdminRRHH() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/login")
	            .accept(MediaType.ALL))
	            .andExpect(status().isOk());
	}

}
