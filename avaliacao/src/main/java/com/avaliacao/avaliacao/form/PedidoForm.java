package com.avaliacao.avaliacao.form;

import com.avaliacao.avaliacao.modelo.Pedido;
import com.avaliacao.avaliacao.repository.PedidoRepository;
import com.sun.istack.NotNull;

public class PedidoForm {
	@NotNull
	private double total;
	@NotNull
	private double preço;
	@NotNull
	private String NomePedido;
	@NotNull
	public double getPreço() {
		return preço;
	}

	public void setPreço(double preço) {
		this.preço = preço;
	}

	public String getNomePedido() {
		return NomePedido;
	}

	public void setNomeProduto(String nomePedido) {
		NomePedido = nomePedido;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public Pedido converter(PedidoRepository pedidoRepository) {

		return new Pedido(0, total, null, NomePedido);
	}

}
