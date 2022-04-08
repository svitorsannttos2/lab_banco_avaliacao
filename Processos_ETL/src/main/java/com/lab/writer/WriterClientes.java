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

import com.lab.domain.Clientes;

@Configuration
public class WriterClientes {
	
	/*@Bean
	public ItemWriter<Clientes> jdbcPagingWriter() {
		return Clientes -> Clientes.forEach(System.out::println);
	}*/
	
	@Bean
	public JdbcBatchItemWriter<Clientes> jdbcContaWriterClientes(@Qualifier("appDataSource") DataSource daaSource){
		return new JdbcBatchItemWriterBuilder<Clientes>()
				.dataSource(daaSource)
				.sql("INSERT INTO loja.dm_cliente (id_cliente, ds_cliente, estado, situacao, classe, sexo) VALUES (?,?,?,?,?,?)")
				.itemPreparedStatementSetter(itemPreparedStatementSetter())
				.build();
		}

	private ItemPreparedStatementSetter<Clientes> itemPreparedStatementSetter() {
		return new ItemPreparedStatementSetter<Clientes>() {

			@Override
			public void setValues(Clientes item, PreparedStatement ps) throws SQLException {
				ps.setInt(1, item.getIdCliente());
				ps.setString(2, item.getCliente());
				ps.setString(3, item.getEstado());
				ps.setString(4, null);
				ps.setString(5, item.getStatus());
				ps.setString(6, item.getSexo());
			}
			
		};
	}
}
