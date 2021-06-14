package com.avaliacao.avaliacao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.avaliacao.avaliacao.modelo.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}

/*package com.avaliacao.avaliacao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.avaliacao.avaliacao.modelo.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}*/