package com.lab.domain;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Clientes {
	
	@NotNull
	private int idCliente;
	@NotNull
	@Size(min=1, max=100)
	private String cliente;
	@NotNull
	private String estado;
	@NotNull
	private String sexo;
	@NotNull
	private String status;
	
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Cliente [id_cliente=" + idCliente + ", ds_cliente=" + cliente + ", estado=" + estado + ", sexo="
				+ sexo + ", status=" + status + "]";
	}

	
}
