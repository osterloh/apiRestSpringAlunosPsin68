CREATE TABLE pessoa(
    id serial,
    nome varchar(100) not null,
    email varchar(100) not null,
    telefone varchar(45) not null,
    primary key (id)
);