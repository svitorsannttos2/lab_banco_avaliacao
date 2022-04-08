package com.lab.reader;

import javax.sql.DataSource;

import org.springframework.batch.item.database.JdbcCursorItemReader;
import org.springframework.batch.item.database.builder.JdbcCursorItemReaderBuilder;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.BeanPropertyRowMapper;

import com.lab.domain.Clientes;

@Configuration
public class ReaderClientes {

	@Bean
	public JdbcCursorItemReader<Clientes> jdbcCursorReaderClientes(
			@Qualifier("springDataSource") DataSource dataSource){
		return new JdbcCursorItemReaderBuilder<Clientes>()
				.name("jdbcCursorReader")
				.dataSource(dataSource)
				.sql("select * from relacional.clientes")
				.rowMapper(new BeanPropertyRowMapper<Clientes>(Clientes.class))
				.build();
	}

}
