package com.avaliacao.avaliacao.form;

import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import com.avaliacao.avaliacao.modelo.Endereco;
import com.sun.istack.NotNull;

public class EnderecoForm {
	private Long id;
	@NotNull @NotEmpty @Length(min = 5)
	private String pais;
	@NotNull @NotEmpty @Length(min = 5)
	private String estado;
	@NotNull @NotEmpty @Length(min = 5)
	private String cidade;
	@NotNull @NotEmpty @Length(min = 5)
	private String cep;
	@NotNull @NotEmpty @Length(min = 5)
	private String rua;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public Endereco converter() {
		return new Endereco(pais, estado, cidade, cep, rua);
		
	}
	

}
