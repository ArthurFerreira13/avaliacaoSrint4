package com.avaliacao.avaliacao.controller;


import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.avaliacao.avaliacao.controller.dto.PedidoDto;
import com.avaliacao.avaliacao.form.PedidoForm;
import com.avaliacao.avaliacao.modelo.Pedido;
import com.avaliacao.avaliacao.repository.PedidoRepository;


@RestController
@RequestMapping("/pedido")
public class PedidoController {
	@Autowired
	private PedidoRepository  pedidoRepository;
	
	@GetMapping
		public List<PedidoDto> listaPedidos(@RequestParam String NomePedido,@RequestParam double total) {
			
			List<Pedido> pedido = pedidoRepository.findAll();
			return PedidoDto.converter(pedido);
		}
	
	@PostMapping
	public ResponseEntity<PedidoDto> compra(@RequestBody @Valid PedidoForm form, UriComponentsBuilder uriBuilder) {
		Pedido pedido = form.converter(pedidoRepository);
		pedidoRepository.save(pedido);
		URI uri = uriBuilder.path("/pedido{id}").buildAndExpand(pedido.getId()).toUri();
		return ResponseEntity.created(uri).body(new PedidoDto(pedido));
	}
}

