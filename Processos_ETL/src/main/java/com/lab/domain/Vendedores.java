package com.lab.domain;

import javax.validation.constraints.NotNull;

public class Vendedores {

	@NotNull
	private int idVendedor;
	@NotNull
	private String nome;
	
	public int getIdVendedor() {
		return idVendedor;
	}
	public void setIdVendedor(int idVendedor) {
		this.idVendedor = idVendedor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return "Vendedores [idVendedor=" + idVendedor + ", nome=" + nome + "]";
	}
	
}
