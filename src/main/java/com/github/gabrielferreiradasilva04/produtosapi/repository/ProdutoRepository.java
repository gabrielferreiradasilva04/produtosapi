package com.github.gabrielferreiradasilva04.produtosapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.gabrielferreiradasilva04.produtosapi.model.Produto;


public interface ProdutoRepository extends JpaRepository<Produto, String> {

}
