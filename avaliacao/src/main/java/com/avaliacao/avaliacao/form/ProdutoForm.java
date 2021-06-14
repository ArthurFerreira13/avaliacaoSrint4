package com.avaliacao.avaliacao.form;

import org.springframework.web.bind.annotation.RequestParam;

import com.avaliacao.avaliacao.modelo.Produto;
import com.avaliacao.avaliacao.repository.ProdutoRepository;
import com.sun.istack.NotNull;

public class ProdutoForm {
	@NotNull
	private String descricao;
	@NotNull
	private double precoUnitario;
	@NotNull
	private String nome;

	public String getDescricao(@RequestParam String nome,@RequestParam double precoUnitario) {
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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Produto converter(ProdutoRepository produtoRepository) {

		return new Produto(0, descricao, precoUnitario);
	}

}
