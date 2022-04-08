-- loja.dm_cliente definition

-- Drop table

-- DROP TABLE loja.dm_cliente;

CREATE TABLE loja.dm_cliente (
	id_cliente int4 NOT NULL,
	ds_cliente varchar NULL,
	estado varchar NULL,
	situacao varchar NULL,
	classe varchar NULL,
	sexo bpchar(2) NULL,
	CONSTRAINT cliente_pk PRIMARY KEY (id_cliente)
);

-- Permissions

ALTER TABLE loja.dm_cliente OWNER TO postgres;
GRANT ALL ON TABLE loja.dm_cliente TO postgres;


-- loja.dm_produto definition

-- Drop table

-- DROP TABLE loja.dm_produto;

CREATE TABLE loja.dm_produto (
	id_produto int4 NOT NULL,
	ds_produto varchar NULL,
	valor float8 NULL,
	classe varchar NULL,
	CONSTRAINT produto_pk PRIMARY KEY (id_produto)
);

-- Permissions

ALTER TABLE loja.dm_produto OWNER TO postgres;
GRANT ALL ON TABLE loja.dm_produto TO postgres;


-- loja.dm_tempo definition

-- Drop table

-- DROP TABLE loja.dm_tempo;

CREATE TABLE loja.dm_tempo (
	id_tempo int4 NOT NULL,
	dia date NULL,
	trimestre date NULL,
	CONSTRAINT tempo_pk PRIMARY KEY (id_tempo)
);

-- Permissions

ALTER TABLE loja.dm_tempo OWNER TO postgres;
GRANT ALL ON TABLE loja.dm_tempo TO postgres;


-- loja.dm_vendedor definition

-- Drop table

-- DROP TABLE loja.dm_vendedor;

CREATE TABLE loja.dm_vendedor (
	id_vendedor int4 NOT NULL,
	ds_vendedor varchar NULL,
	nivel varchar NULL,
	venda float8 NULL,
	CONSTRAINT vendedor_pk PRIMARY KEY (id_vendedor)
);

-- Permissions

ALTER TABLE loja.dm_vendedor OWNER TO postgres;
GRANT ALL ON TABLE loja.dm_vendedor TO postgres;


-- loja.ft_venda definition

-- Drop table

-- DROP TABLE loja.ft_venda;

CREATE TABLE loja.ft_venda (
	val_uni float8 NULL,
	val_total float8 NULL,
	desconto float8 NULL,
	id_tempo int4 NULL,
	id_cliente int4 NULL,
	id_vendedor int4 NULL,
	id_produto int4 NULL,
	CONSTRAINT cliente_venda_fk FOREIGN KEY (id_cliente) REFERENCES loja.dm_cliente(id_cliente) ON DELETE RESTRICT,
	CONSTRAINT produtoo_venda_fk FOREIGN KEY (id_produto) REFERENCES loja.dm_produto(id_produto) ON DELETE RESTRICT,
	CONSTRAINT tempo_venda_fk FOREIGN KEY (id_tempo) REFERENCES loja.dm_tempo(id_tempo) ON DELETE RESTRICT,
	CONSTRAINT vendedor_venda_fk FOREIGN KEY (id_vendedor) REFERENCES loja.dm_vendedor(id_vendedor) ON DELETE RESTRICT
);

-- Permissions

ALTER TABLE loja.ft_venda OWNER TO postgres;
GRANT ALL ON TABLE loja.ft_venda TO postgres;