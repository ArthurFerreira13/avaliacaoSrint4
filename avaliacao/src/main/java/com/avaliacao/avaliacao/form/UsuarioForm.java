package com.avaliacao.avaliacao.form;

import com.avaliacao.avaliacao.modelo.Usuario;
import com.avaliacao.avaliacao.repository.UsuarioRepository;
import com.sun.istack.NotNull;

public class UsuarioForm {
	@NotNull
	private String nome;
	@NotNull
	 private long cpf;
	@NotNull
	private double salario;
	@NotNull
	private char sexo;
	

	
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public Usuario converter(UsuarioRepository repository) {
		return new Usuario(nome, cpf);
	}

	

}

