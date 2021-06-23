ALTER TABLE pessoa
ADD COLUMN usuario_id BIGINT NOT NULL DEFAULT 'pessoa@teste.com';

ALTER TABLE pessoa ADD CONSTRAINT fk_usuario_pessoa
FOREIGN KEY (usuario_id) REFERENCES usuario (id);