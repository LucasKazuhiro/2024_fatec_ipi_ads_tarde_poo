-- Active: 1714681517288@@mysql-be9956e-meu-primeiro-projeto.d.aivencloud.com@24580@defaultdb



# Criando uma table
CREATE TABLE tb_pessoa(
    cod_pessoa INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(200) NOT NULL,
    fone VARCHAR(200) NOT NULL,
    email VARCHAR(200) NULL
);




# Inserindo dados na table
INSERT INTO tb_pessoa
(nome, fone, email) VALUES
('José', '11223344', 'jose@email.com');


INSERT INTO tb_pessoa
(nome, fone, email) VALUES
('João', '22334455', 'joao@gmail.com'),
('Maria', '33445566', 'maria@email.com');




# Selects
SELECT * FROM tb_pessoa;

SELECT nome, email FROM tb_pessoa;

SELECT * FROM tb_pessoa WHERE cod_pessoa = 1;

SELECT * FROM tb_pessoa WHERE nome LIKE 'J%';




# Atualizando dados da table
UPDATE tb_pessoa SET nome = 'José da Silva' WHERE cod_pessoa = 1;

UPDATE tb_pessoa SET nome = CONCAT(nome, ' Gomes') WHERE cod_pessoa = 2 OR cod_pessoa = 3;

# ou 
# UPDATE tb_pessoa SET nome = CONCAT(nome, ' Gomes') WHERE cod_pessoa in (2, 3);





# Deletando dados da table
DELETE FROM tb_pessoa WHERE cod_pessoa = 4;







# Adicionando coluna do tipo BOOLEAN com valores preenchidos
ALTER TABLE tb_pessoa ADD ativo BOOLEAN DEFAULT TRUE NOT NULL;