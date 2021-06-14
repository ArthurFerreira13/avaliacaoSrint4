package com.avaliacao.avaliacao.controller.dto;

import java.util.List;

import java.util.stream.Collectors;

import com.avaliacao.avaliacao.modelo.Produto;

public class ProdutoDto {
	private long id;
	private String descricao;
	private double precoUnitario;
	
	public ProdutoDto(Produto produto) {
		this.id = produto.getId();
		this.descricao = produto.getDescricao();
		this.precoUnitario = produto.getPrecoUnitario();
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


	public static List<ProdutoDto> converter(List<Produto> produtos) {
		
		return produtos.stream().map(ProdutoDto::new).collect(Collectors.toList());
	}
	

}
