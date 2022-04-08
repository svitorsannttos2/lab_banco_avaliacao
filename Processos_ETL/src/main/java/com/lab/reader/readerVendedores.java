package com.lab.reader;

import javax.sql.DataSource;

import org.springframework.batch.item.database.JdbcCursorItemReader;
import org.springframework.batch.item.database.builder.JdbcCursorItemReaderBuilder;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.BeanPropertyRowMapper;

import com.lab.domain.Vendedores;

public class readerVendedores {

	@Bean
	public JdbcCursorItemReader<Vendedores> jdbcCursorReaderVendedores(
			@Qualifier("springDataSource") DataSource dataSource){
		return new JdbcCursorItemReaderBuilder<Vendedores>()
				.name("jdbcCursorReader")
				.dataSource(dataSource)
				.sql("select * from relacional.vendedores")
				.rowMapper(new BeanPropertyRowMapper<Vendedores>(Vendedores.class))
				.build();
	}
}
