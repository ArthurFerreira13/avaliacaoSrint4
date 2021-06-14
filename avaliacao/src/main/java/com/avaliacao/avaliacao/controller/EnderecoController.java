package com.avaliacao.avaliacao.controller;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.util.UriComponentsBuilder;

import com.avaliacao.avaliacao.controller.dto.EnderecoDto;
import com.avaliacao.avaliacao.form.EnderecoForm;
import com.avaliacao.avaliacao.modelo.Endereco;
import com.avaliacao.avaliacao.repository.EnderecoRepository;


@RestController
@RequestMapping("/endereco")
public class EnderecoController {
	@Autowired
	private EnderecoRepository enderecoRepository;
	@GetMapping
	public List<EnderecoDto> lista(@RequestParam String cidade, @RequestParam String cep,@RequestParam String rua) {
		List<Endereco> endereco = enderecoRepository.findAll();
		return EnderecoDto.converter(endereco);
	}
	
	@PostMapping
	private ResponseEntity<EnderecoDto> cadastrar(@RequestBody @Valid EnderecoForm form, UriComponentsBuilder uriBuilder) {
		Endereco endereco = form.converter();
		enderecoRepository.save(endereco);
		URI uri = uriBuilder.path("/endereco/{id}").buildAndExpand(endereco.getId()).toUri();
			return ResponseEntity.created(uri).body(new EnderecoDto(endereco));
	}
}


