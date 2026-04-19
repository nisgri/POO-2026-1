CREATE TABLE cliente(id SERIAL PRIMARY KEY, nome VARCHAR(60) NOT NULL, email VARCHAR(50) NOT NULL UNIQUE);
INSERT INTO cliente(nome, email) VALUES('Marcos', 'marcos@gmail.com');
select * from cliente;