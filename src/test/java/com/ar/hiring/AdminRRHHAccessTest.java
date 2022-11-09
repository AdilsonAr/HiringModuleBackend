package com.ar.hiring;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.nio.charset.Charset;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.ar.hiring.dto.request.ProcesoReqDTO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.SerializationFeature;

@SpringBootTest
@AutoConfigureMockMvc
class AdminRRHHAccessTest {

	@Autowired
    private MockMvc mockMvc;
	private static final MediaType APPLICATION_JSON_UTF8 = new MediaType(MediaType.APPLICATION_JSON.getType(), MediaType.APPLICATION_JSON.getSubtype(), Charset.forName("utf8"));
	
	@Test
	@DisplayName("Este test pasa si un ADMINISTRADORRRHH puede hacer GET a /proceso")
	@WithMockUser(roles = "ADMINISTRADORRRHH")
	void getToProcesoAsUser() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/proceso")
	            .accept(MediaType.ALL))
	            .andExpect(status().isOk());
	}
	
	@Test
	@DisplayName("Este test pasa si un ADMINISTRADORRRHH puede hacer POST a /proceso")
	@WithMockUser(roles = "ADMINISTRADORRRHH")
	void postToProcesoAsUser() throws Exception {
	    
		mockMvc.perform(MockMvcRequestBuilders.post("/proceso").contentType(APPLICATION_JSON_UTF8)
				.content(getTestBody())
	            .accept(MediaType.ALL))
	            .andExpect(status().isCreated());
	}
	
	@Test
	@DisplayName("Este test pasa si un ADMINISTRADORRRHH puede hacer PUT a /proceso")
	@WithMockUser(roles = "ADMINISTRADORRRHH")
	void putToProcesoAsUser() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.put("/proceso").contentType(APPLICATION_JSON_UTF8)
				.content(getTestBody())
	            .accept(MediaType.ALL))
	            .andExpect(status().isOk());
	}
	
	@Test
	@DisplayName("Este test pasa si un ADMINISTRADORRRHH puede hacer DELETE a /proceso")
	@WithMockUser(roles = "ADMINISTRADORRRHH")
	void deleteToProcesoAsUser() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.delete("/proceso?id=4")
	            .accept(MediaType.ALL))
	            .andExpect(status().isOk());
	}
	
	@Test
	@DisplayName("Este test pasa si un ADMINISTRADORRRHH no puede hacer PUT a /aplicacion")
	@WithMockUser(roles = "ADMINISTRADORRRHH")
	void aceptAsUser() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.put("/aplicacion/acept?id_aplicacion=27")
	            .accept(MediaType.ALL))
	            .andExpect(status().isForbidden());
	}
	
	private String getTestBody() throws JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper();
	    mapper.configure(SerializationFeature.WRAP_ROOT_VALUE, false);
	    ObjectWriter ow = mapper.writer().withDefaultPrettyPrinter();
	    String requestJson=ow.writeValueAsString(new ProcesoReqDTO(2,3,"na","na","na"));
	    return requestJson;
	}

}
