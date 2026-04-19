CREATE TABLE titular(
	numero_conta SERIAL PRIMARY KEY, 
	titular VARCHAR(60) NOT NULL, 
	saldo decimal(10, 2) NOT NULL
);
INSERT INTO titular(titular, saldo) VALUES('Marcelo', 12000);
select * from titular;