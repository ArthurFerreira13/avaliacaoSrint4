package com.avaliacao.avaliacao.controller.dto;

import java.time.LocalDateTime;

import java.util.List;

import java.util.stream.Collectors;

import com.avaliacao.avaliacao.modelo.Pedido;

public class PedidoDto {

	private double total;
	private LocalDateTime data;
	private String NomePedido;

	public PedidoDto(Pedido pedido) {
		this.total = pedido.getTotal();
		this.data = pedido.getDataCriacao();
		this.NomePedido = pedido.getNomePedido();

	}

	public String getNomePedido() {
		return NomePedido;
	}

	public void setNomePedido(String nomePedido) {
		NomePedido = nomePedido;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public static List<PedidoDto> converter(List<Pedido> pedido) {
		return pedido.stream().map(PedidoDto::new).collect(Collectors.toList());

	}
}
