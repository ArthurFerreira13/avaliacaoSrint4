package com.avaliacao.avaliacao.modelo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Usuario {
	@Id @GeneratedValue(strategy =GenerationType.IDENTITY )
	private long id;
	private String nome;
	 private long cpf;
	private double salario;
	private char sexo;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "usuario")
	private List<Endereco> endereco = new ArrayList<Endereco>();
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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

public Usuario() {
	
}
public Usuario(String nome, long cpf) {
	super();
	this.nome = nome;
	this.cpf = cpf;
}
	
	
}
