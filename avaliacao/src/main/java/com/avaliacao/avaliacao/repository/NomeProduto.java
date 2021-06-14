package com.avaliacao.avaliacao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.avaliacao.avaliacao.modelo.Produto;

public interface NomeProduto extends JpaRepository<Produto, Long> {

}
