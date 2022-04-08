package com.lab.domain;

import javax.validation.constraints.NotNull;

public class ItensVenda {

	@NotNull
	private int idProduto;
	@NotNull
	private int idVenda;
	private int quantidade;
	private int valorUnitario;
	private int valorTotal;
	private int desconto;
	
	public int getIdProduto() {
		return idProduto;
	}
	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}
	public int getIdVenda() {
		return idVenda;
	}
	public void setIdVenda(int idVenda) {
		this.idVenda = idVenda;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public int getValorUnitario() {
		return valorUnitario;
	}
	public void setValorUnitario(int valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	public int getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(int valorTotal) {
		this.valorTotal = valorTotal;
	}
	public int getDesconto() {
		return desconto;
	}
	public void setDesconto(int desconto) {
		this.desconto = desconto;
	}
	
	@Override
	public String toString() {
		return "ItensVenda [idProduto=" + idProduto + ", idVenda=" + idVenda + ", quantidade=" + quantidade
				+ ", valorUnitario=" + valorUnitario + ", valorTotal=" + valorTotal + ", desconto=" + desconto + "]";
	}
	
}
