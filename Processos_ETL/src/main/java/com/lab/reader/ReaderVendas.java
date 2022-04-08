package com.lab.reader;

import javax.sql.DataSource;

import org.springframework.batch.item.database.JdbcCursorItemReader;
import org.springframework.batch.item.database.builder.JdbcCursorItemReaderBuilder;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.BeanPropertyRowMapper;

import com.lab.domain.Vendas;

public class ReaderVendas {

	@Bean
	public JdbcCursorItemReader<Vendas> jdbcCursorReaderVendas(
			@Qualifier("springDataSource") DataSource dataSource){
		return new JdbcCursorItemReaderBuilder<Vendas>()
				.name("jdbcCursorReader")
				.dataSource(dataSource)
				.sql("select * from relacional.vendas")
				.rowMapper(new BeanPropertyRowMapper<Vendas>(Vendas.class))
				.build();
	}
}
