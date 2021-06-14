package com.avaliacao.avaliacao.controller;
import com.avaliacao.avaliacao.form.UsuarioForm;

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

import com.avaliacao.avaliacao.controller.dto.UsuarioDto;

import com.avaliacao.avaliacao.modelo.Usuario;
import com.avaliacao.avaliacao.repository.UsuarioRepository;
@RestController
@RequestMapping("/Usuario")
public class UsuarioController {
	@Autowired
	private UsuarioRepository usuarioRepository;
	@GetMapping
	public List<UsuarioDto> lista(@RequestParam String nome, @RequestParam String cpf ) {
		
		List<Usuario> usuario =usuarioRepository.findAll();
		return UsuarioDto.coverter(usuario);
		}

	@PostMapping("/Usuario")
	public ResponseEntity<UsuarioDto> cadastrar(@RequestBody @Valid UsuarioForm form, UriComponentsBuilder uriBuilder) {
		Usuario usuario =form.converter(usuarioRepository);
		usuarioRepository.save(usuario);
		URI uri = uriBuilder.path("/usuario/{id}").buildAndExpand(usuario.getId()).toUri();
		return ResponseEntity.created(uri).body(new UsuarioDto(usuario));
		
	}
}


