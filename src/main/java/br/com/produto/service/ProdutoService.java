package br.com.produto.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.produto.model.Produto;
import br.com.produto.repository.ProdutoRepository;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository produtoRepository;

	public void save(Produto produto) {

		if (produto == null) {
			throw new NullPointerException("Objeto Vazio");
		} else {
			produtoRepository.save(produto);
		}

	}

	public List<Produto> findAll(){
		List<Produto> produtos = new ArrayList<Produto>();
		

			return produtos;
		
	}
	
	public double totalValue(List<Produto> produtos) throws Exception {
		
		double totalValue = 0;
		
		for(Produto p : produtos) {
			totalValue = totalValue + p.getPreco();
		}
		
		return totalValue;
	}

}
