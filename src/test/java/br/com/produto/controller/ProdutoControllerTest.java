package br.com.produto.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import br.com.produto.service.ProdutoService;

@SpringBootTest
@AutoConfigureMockMvc
class ProdutoControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@Mock
	private ProdutoService produtoService;

	@InjectMocks
	private ProdutoController produtoController;

	@Test
	void testSave() throws Exception {

		mockMvc.perform(get("/list").accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk());

	}

}
