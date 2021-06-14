package com.avaliacao.avaliacao.modelo;

import java.time.LocalDateTime;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Pedido {
	@Id @GeneratedValue(strategy =GenerationType.IDENTITY )
	private long id;
	private double total;
	private LocalDateTime dataCriacao = LocalDateTime.now();
	private String NomePedido;
	
	public Pedido() {
		
	}
	
	

	public Pedido(long id, double total, LocalDateTime dataCriacao,String NomePedido) {
		super();
		this.id = id;
		this.total = total;
		this.dataCriacao = dataCriacao;
		this.NomePedido = NomePedido;
	}


	public String getNomePedido() {
		return NomePedido;
	}



	public void setNomePedido(String nomePedido) {
		NomePedido = nomePedido;
	}



	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}



	public void setDataCriacao(LocalDateTime dataCriacao) {
		this.dataCriacao = dataCriacao;
	}



	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}



	public Pedido(double total) {
		super();
		this.total = total;
	}

}
