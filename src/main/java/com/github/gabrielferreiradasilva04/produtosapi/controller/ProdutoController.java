package com.github.gabrielferreiradasilva04.produtosapi.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.gabrielferreiradasilva04.produtosapi.model.Produto;

@RestController
@RequestMapping("produtos")
public class ProdutoController {
	
	@PostMapping /*nas versões novas do spring não precisa especificar que o método retornará algo, basta
	retornar a entidade que ele entende que deve retornar algo em formato de JSON, mas esse formato pode ser alterado*/
	public Produto salvar(@RequestBody Produto produto) {
		System.out.println("Produto recebido: "+produto);
		return produto;
	}
}
