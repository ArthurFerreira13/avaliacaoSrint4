package com.avaliacao.avaliacao.controller.dto;

import java.util.List;
import java.util.stream.Collectors;
import com.avaliacao.avaliacao.modelo.Endereco;

public class EnderecoDto {
	
	private String pais;
	private String estado;
	private String cidade;
	private String cep;
	private String rua;
	

	public EnderecoDto(Endereco endereco) {
		this.pais = endereco.getPais();
		this.estado = endereco.getEstado();
		this.rua = endereco.getRua();
		this.cidade = endereco.getCidade();
		this.cep = endereco.getCep();
	}
	
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public static List<EnderecoDto> converter(List<Endereco> endereco){
		return endereco.stream().map(EnderecoDto::new).collect(Collectors.toList());
		
	}
	

}
