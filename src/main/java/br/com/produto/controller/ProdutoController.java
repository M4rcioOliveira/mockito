package br.com.produto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.produto.model.Produto;
import br.com.produto.service.ProdutoService;

@RestController
public class ProdutoController {
	
	@Autowired
	private ProdutoService produtoService;
	
	
	
	@PostMapping("/save")
	public void save(Produto produto) {
		produtoService.save(produto);
	}
	
	@GetMapping("/list")
	public List<Produto> findAll() throws Exception{
		return produtoService.findAll();
	}

}
