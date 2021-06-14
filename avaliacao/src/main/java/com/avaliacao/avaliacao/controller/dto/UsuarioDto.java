package com.avaliacao.avaliacao.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import com.avaliacao.avaliacao.modelo.Usuario;

public class UsuarioDto {

	private String nome;
	private long cpf;

	public UsuarioDto(Usuario usuario) {
		this.nome = usuario.getNome();

		this.cpf = usuario.getCpf();
	}

	public String getNome() {
		return nome;
	}

	public long getCpf() {
		return cpf;
	}

	public static List<UsuarioDto> coverter(List<Usuario> usuario) {
		return usuario.stream().map(UsuarioDto::new).collect(Collectors.toList());
	}

}
