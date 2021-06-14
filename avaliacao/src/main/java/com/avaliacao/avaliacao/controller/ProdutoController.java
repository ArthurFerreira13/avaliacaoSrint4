package com.avaliacao.avaliacao.controller;



import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.avaliacao.avaliacao.controller.dto.ProdutoDto;
import com.avaliacao.avaliacao.form.ProdutoForm;
import com.avaliacao.avaliacao.modelo.Produto;
import com.avaliacao.avaliacao.repository.ProdutoRepository;

@RestController
@RequestMapping("/produto")

public class ProdutoController {
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@GetMapping 
	public List<ProdutoDto> lista() {
		List<Produto> produto = produtoRepository.findAll();
		return ProdutoDto.converter(produto);
			
	}
	@PostMapping
	public ResponseEntity<ProdutoDto>cadastrar(@RequestBody @Valid ProdutoForm form, UriComponentsBuilder uriBuilder ){
		Produto produto = form.converter(produtoRepository);
		URI uri = uriBuilder.path("/produto{id}").buildAndExpand(produto.getId()).toUri();
		return ResponseEntity.created(uri).body(new ProdutoDto(produto));
	}
	@GetMapping("/{id}")
	public ProdutoDto detalhar(@PathVariable Long id) {
		Produto produto = produtoRepository.getOne(id);
		return new ProdutoDto(produto);
		
	}
}



