package com.lab.processor;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.lab.domain.Clientes;
import com.lab.domain.ItensVenda;
import com.lab.domain.Produtos;
import com.lab.domain.Vendas;
import com.lab.domain.Vendedores;

@Configuration
public class ProcessadorValidacaoProcessorConfig {

	@Bean
	public ItemProcessor<Clientes, Clientes> procesadorValidacaoProcessorClientes() {
		// TODO: Implementar a lógica aqui...
		return cliente -> cliente;
	}
	
	@Bean
	public ItemProcessor<Produtos, Produtos> procesadorValidacaoProcessorProdutos() {
		// TODO: Implementar a lógica aqui...
		return produtos -> produtos;
	}
	
	@Bean
	public ItemProcessor<Vendedores, Vendedores> procesadorValidacaoProcessorVendedores() {
		// TODO: Implementar a lógica aqui...
		return vendedores -> vendedores;
	}
	
	@Bean
	public ItemProcessor<Vendas, Vendas> procesadorValidacaoProcessorVendas() {
		// TODO: Implementar a lógica aqui...
		return vendas -> vendas;
	}
	
	@Bean
	public ItemProcessor<ItensVenda, ItensVenda> procesadorValidacaoProcessorItensVenda() {
		// TODO: Implementar a lógica aqui...
		return itensVenda -> itensVenda;
	}
}
