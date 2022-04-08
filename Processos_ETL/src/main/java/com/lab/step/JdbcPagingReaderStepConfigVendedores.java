package com.lab.step;


import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.lab.domain.Vendedores;

@Configuration
public class JdbcPagingReaderStepConfigVendedores {
/*	@Autowired
	private StepBuilderFactory stepBuilderFactory;
	
	@Bean
	public Step jdbcPagingReaderStepVendedores(ItemReader<Vendedores> jdbcCursorReaderVendedores,
			ItemProcessor<Vendedores, Vendedores> procesadorValidacaoProcessorVendedores,
			ItemWriter<Vendedores> jdbcPagingWriterVendedores) {
		return stepBuilderFactory
				.get("jdbcPagingReaderStep")
				.<Vendedores, Vendedores>chunk(1)
				.reader(jdbcCursorReaderVendedores)
				.processor(procesadorValidacaoProcessorVendedores)
				.writer(jdbcPagingWriterVendedores)
				.build();
	}*/
	
}

