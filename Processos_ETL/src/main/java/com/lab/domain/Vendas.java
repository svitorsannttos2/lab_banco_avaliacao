package com.lab.domain;

import java.sql.Date;

import javax.validation.constraints.NotNull;

public class Vendas {
	
	@NotNull
	private int idVenda;
	@NotNull
	private int idVendedor;
	@NotNull
	private int idCliente;
	private Date data;
	@NotNull
	private int total;
	
	public int getIdVenda() {
		return idVenda;
	}
	public void setIdVenda(int idVenda) {
		this.idVenda = idVenda;
	}
	public int getIdVendedor() {
		return idVendedor;
	}
	public void setIdVendedor(int idVendedor) {
		this.idVendedor = idVendedor;
	}
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	@Override
	public String toString() {
		return "Vendas [idVenda=" + idVenda + ", idVendedor=" + idVendedor + ", idCliente=" + idCliente + ", data="
				+ data + ", total=" + total + "]";
	}
	
}
