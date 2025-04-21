CREATE TABLE contas_bancarias (
    id SERIAL PRIMARY KEY,
    titular VARCHAR(255),
    conta VARCHAR(50),
    agencia VARCHAR(50),
    saldo DECIMAL(10, 2),
    senha VARCHAR(255)
);

CREATE TABLE funcionarios (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(255),
    idade INT,
    endereco VARCHAR(255),
    cpf VARCHAR(14),
    cargo VARCHAR(255),
    salario DECIMAL(10, 2),
    conta_salario_id INT,
    FOREIGN KEY (conta_salario_id) REFERENCES contas_bancarias(id)
);

CREATE TABLE produtos (
    id SERIAL PRIMARY KEY,
    codigo VARCHAR(50),
    valor DECIMAL(10, 2),
    nome VARCHAR(255),
    quantidade INT
);

CREATE TABLE empresas (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(255),
    cnpj VARCHAR(18)
);

CREATE TABLE emails (
    id SERIAL PRIMARY KEY,
    empresa_id INT,
    email VARCHAR(255),
    FOREIGN KEY (empresa_id) REFERENCES empresas(id)
);
