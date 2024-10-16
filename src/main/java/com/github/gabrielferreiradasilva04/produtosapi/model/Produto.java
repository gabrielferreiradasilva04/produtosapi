package com.github.gabrielferreiradasilva04.produtosapi.model;


public class Produto {
	private String id;
	private String nome;
	private String descricao;
	private Double preco;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public Produto(String id, String nome, String descricao, Double preco) {
		super();
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
	}
	
	
	public Produto(String nome) {
		super();
		this.nome = nome;
	}
	@Override
	public String toString() {
		return "Produto [id=" + id + ", nome=" + nome + ", preco=" + preco + "]";
	}
	
	
	
	
	
}
