package com.github.gabrielferreiradasilva04.produtosapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.gabrielferreiradasilva04.produtosapi.model.Produto;


public interface ProdutoRepository extends JpaRepository<Produto, String> {

	List<Produto> findByNome(String nome);
}
