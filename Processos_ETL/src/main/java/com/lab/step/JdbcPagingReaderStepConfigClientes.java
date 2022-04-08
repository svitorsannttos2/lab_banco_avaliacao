package com.lab.step;


import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.lab.domain.Clientes;

@Configuration
public class JdbcPagingReaderStepConfigClientes {
	@Autowired
	private StepBuilderFactory stepBuilderFactory;
	
	@Bean
	public Step jdbcPagingReaderStepClientes(ItemReader<Clientes> jdbcCursorReaderClientes,
			ItemProcessor<Clientes, Clientes> procesadorValidacaoProcessorClientes,
			ItemWriter<Clientes> jdbcPagingWriterClientes) {
		return stepBuilderFactory
				.get("jdbcPagingReaderStep")
				.<Clientes, Clientes>chunk(1)
				.reader(jdbcCursorReaderClientes)
				.processor(procesadorValidacaoProcessorClientes)
				.writer(jdbcPagingWriterClientes)
				.build();
	}
	
}

