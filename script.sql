CREATE DATABASE 20221_usjt_psc_segunda_sistema_academico;

USE 20221_usjt_psc_segunda_sistema_academico;

-- cod_usuario, login, senha
-- 1, admin, admin
-- 2, rodrigo, 123456
-- 3, amanda, 654321
-- 4, rodrigo, abacdefg

CREATE TABLE tb_usuario(
	cod_usuario INT PRIMARY KEY AUTO_INCREMENT,
    login VARCHAR(200) NOT NULL,
    senha VARCHAR(200) NOT NULL
);

INSERT INTO tb_usuario(login, senha) VALUES ('admin', 'admin');
INSERT INTO tb_usuario(login, senha) VALUES ('rodrigo', '123456');

INSERT INTO tb_usuario(login, senha) VALUES
('amanda', '654321'), ('rodrigo', 'abcdefg');

SELECT cod_usuario, login, senha FROM tb_usuario;

SELECT * FROM tb_usuario;

SELECT login, senha FROM tb_usuario;

UPDATE tb_usuario SET senha='1234' WHERE cod_usuario = 2;

DELETE FROM tb_usuario WHERE cod_usuario = 3;




