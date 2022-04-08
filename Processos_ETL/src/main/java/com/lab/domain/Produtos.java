package com.lab.domain;

import javax.validation.constraints.NotNull;

public class Produtos {
	
	@NotNull
	private int idProduto;
	private String produto;
	private float preco;
	
	public int getIdProduto() {
		return idProduto;
	}
	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	@Override
	public String toString() {
		return "Produto [idProduto=" + idProduto + ", produto=" + produto + ", preco=" + preco + "]";
	}
	
	
}
