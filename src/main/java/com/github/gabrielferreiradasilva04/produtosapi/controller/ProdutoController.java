package com.github.gabrielferreiradasilva04.produtosapi.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.gabrielferreiradasilva04.produtosapi.model.Produto;
import com.github.gabrielferreiradasilva04.produtosapi.repository.ProdutoRepository;

@RestController
@RequestMapping("produtos")
public class ProdutoController {
	
	private ProdutoRepository repository;
	
	public ProdutoController(ProdutoRepository produtoRepository) {
		this.repository = produtoRepository;
	}
	
	@PostMapping 
	public Produto salvar(@RequestBody Produto produto) {
		var produtoID = UUID.randomUUID().toString(); 
		produto.setId(produtoID);
		repository.save(produto);
		return produto;
	}
	
	@GetMapping("{id}")
	public Produto obterPorId(@PathVariable String id) {
		return repository.findById(id).orElse(null);
	}
	
	
	@DeleteMapping("{id}")
	public void deletar(@PathVariable String id) {
		repository.deleteById(id);
	}
	
	
	@PutMapping("{id}")
	public void atualizar(@PathVariable String id, @RequestBody Produto produto) {
		produto.setId(id);
		repository.save(produto);
	}
	
	@GetMapping
	public List<Produto> buscar(@RequestParam String nome){
		return repository.findByNome(nome);
	}

}
