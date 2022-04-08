package com.lab.reader;

import javax.sql.DataSource;

import org.springframework.batch.item.database.JdbcCursorItemReader;
import org.springframework.batch.item.database.builder.JdbcCursorItemReaderBuilder;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.BeanPropertyRowMapper;

import com.lab.domain.ItensVenda;

public class ReaderItensVenda {

	@Bean
	public JdbcCursorItemReader<ItensVenda> jdbcCursorReaderItensVenda(
			@Qualifier("springDataSource") DataSource dataSource){
		return new JdbcCursorItemReaderBuilder<ItensVenda>()
				.name("jdbcCursorReader")
				.dataSource(dataSource)
				.sql("select * from relacional.itensvenda")
				.rowMapper(new BeanPropertyRowMapper<ItensVenda>(ItensVenda.class))
				.build();
	}
}
