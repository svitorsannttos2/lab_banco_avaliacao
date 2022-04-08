package com.lab.writer;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.batch.item.database.ItemPreparedStatementSetter;
import org.springframework.batch.item.database.JdbcBatchItemWriter;
import org.springframework.batch.item.database.builder.JdbcBatchItemWriterBuilder;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.lab.domain.Vendedores;

@Configuration
public class WriterVendedores {
/*
	@Bean
	public JdbcBatchItemWriter<Vendedores> jdbcContaWriterVendedores(@Qualifier("appDataSource") DataSource daaSource){
		return new JdbcBatchItemWriterBuilder<Vendedores>()
				.dataSource(daaSource)
				.sql("INSERT INTO loja.dm_vendedor (id_vendedor, ds_vendedor, nivel, venda) VALUES (?,?,?,?)")
				.itemPreparedStatementSetter(itemPreparedStatementSetter())
				.build();
		}

	private ItemPreparedStatementSetter<Vendedores> itemPreparedStatementSetter() {
		return new ItemPreparedStatementSetter<Vendedores>() {

			@Override
			public void setValues(Vendedores item, PreparedStatement ps) throws SQLException {
				ps.setInt(1, item.getIdVendedor());
				ps.setString(2, item.getNome());
				ps.setString(3, null);
				ps.setInt(0, 0);
			}
			
		};
	}*/
}
