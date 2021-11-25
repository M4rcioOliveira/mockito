package br.com.produto.service;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.ResponseEntity;

import br.com.produto.model.Produto;
import br.com.produto.repository.ProdutoRepository;

@ExtendWith(MockitoExtension.class)
class ProdutoServiceTest {

	@Mock
	ProdutoRepository produtoRepository;

	@InjectMocks
	ProdutoService produtoService;

	@Test
	void testSaveProductSucess() {

		Produto p1 = new Produto(1, "Notebook", 4498.89, 10);

		produtoService.save(p1);

		verify(produtoRepository).save(Mockito.any(Produto.class));
		
	}
	
	@Test
	void testReturnTotalValueSucess() throws Exception {
		
      
		Assertions.assertEquals(11497.78, produtoService.totalValue(produtos()));
		
		
	}
	
	private  List<Produto> produtos (){
		
		List<Produto> produtos = new ArrayList<Produto>();
		
		Produto p1 = new Produto(1, "Notebook", 4498.89, 10);
		Produto p2 = new Produto(1, "TV", 6998.89, 14);
		
		produtos.add(p1);
		produtos.add(p2);
		
		return produtos;
		
	}
	
	
	
	

}
