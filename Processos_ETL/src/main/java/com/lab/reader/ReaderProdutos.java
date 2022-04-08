package com.lab.reader;

import javax.sql.DataSource;

import org.springframework.batch.item.database.JdbcCursorItemReader;
import org.springframework.batch.item.database.builder.JdbcCursorItemReaderBuilder;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.BeanPropertyRowMapper;

import com.lab.domain.Produtos;

public class ReaderProdutos {

	@Bean
	public JdbcCursorItemReader<Produtos> jdbcCursorReaderProdutos(
			@Qualifier("springDataSource") DataSource dataSource){
		return new JdbcCursorItemReaderBuilder<Produtos>()
				.name("jdbcCursorReader")
				.dataSource(dataSource)
				.sql("select * from relacional.produtos")
				.rowMapper(new BeanPropertyRowMapper<Produtos>(Produtos.class))
				.build();
	}
}
