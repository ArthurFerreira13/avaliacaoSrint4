package com.avaliacao.avaliacao.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Produto {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY )
	private long id;
	
	private String descricao;
	
	private double precoUnitario;

	private String nome;
	
	public Produto() {
		
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPrecoUnitario() {
		return precoUnitario;
	}

	
	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}
	public Produto(long id, String descricao, double precoUnitario) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.precoUnitario = precoUnitario;
	}
	
}
