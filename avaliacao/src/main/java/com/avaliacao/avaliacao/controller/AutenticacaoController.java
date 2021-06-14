package com.avaliacao.avaliacao.controller;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.avaliacao.avaliacao.form.LoginForm;

@RestController
@RequestMapping("/auth")
public class AutenticacaoController {
	
	@PostMapping
	public ResponseEntity<?> autentica(@RequestBody @Valid LoginForm form){
		System.out.println(form.getCpf());
		System.out.println(form.getNome());
		
		
		
		return ResponseEntity.ok().build();
		
	}

}
