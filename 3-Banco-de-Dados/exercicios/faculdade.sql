-- =============================================
-- Exemplo: Banco de dados de uma faculdade
-- =============================================

-- Criar banco de dados
CREATE DATABASE IF NOT EXISTS faculdade;
USE faculdade;

-- Tabela de cursos
CREATE TABLE cursos (
    id       INT          PRIMARY KEY AUTO_INCREMENT,
    nome     VARCHAR(100) NOT NULL,
    duracao  INT          NOT NULL COMMENT 'Duração em semestres'
);

-- Tabela de alunos
CREATE TABLE alunos (
    id        INT          PRIMARY KEY AUTO_INCREMENT,
    nome      VARCHAR(100) NOT NULL,
    cpf       CHAR(11)     UNIQUE NOT NULL,
    email     VARCHAR(150) UNIQUE,
    curso_id  INT,
    FOREIGN KEY (curso_id) REFERENCES cursos(id)
);

-- Tabela de disciplinas
CREATE TABLE disciplinas (
    id        INT          PRIMARY KEY AUTO_INCREMENT,
    nome      VARCHAR(100) NOT NULL,
    carga_h   INT          NOT NULL COMMENT 'Carga horária em horas'
);

-- Tabela de matrículas (N:N entre alunos e disciplinas)
CREATE TABLE matriculas (
    aluno_id       INT  NOT NULL,
    disciplina_id  INT  NOT NULL,
    semestre       CHAR(6) NOT NULL COMMENT 'Ex: 2024.1',
    nota           DECIMAL(4,2),
    PRIMARY KEY (aluno_id, disciplina_id, semestre),
    FOREIGN KEY (aluno_id)      REFERENCES alunos(id),
    FOREIGN KEY (disciplina_id) REFERENCES disciplinas(id)
);

-- =============================================
-- Inserindo dados de exemplo
-- =============================================
INSERT INTO cursos (nome, duracao) VALUES
    ('Análise e Desenvolvimento de Sistemas', 5),
    ('Ciência da Computação', 8);

INSERT INTO alunos (nome, cpf, email, curso_id) VALUES
    ('João Silva',  '11111111111', 'joao@email.com',  1),
    ('Maria Lima',  '22222222222', 'maria@email.com', 1);

INSERT INTO disciplinas (nome, carga_h) VALUES
    ('Algoritmos e Programação', 80),
    ('Banco de Dados',           80),
    ('Estrutura de Dados',       60);

INSERT INTO matriculas (aluno_id, disciplina_id, semestre, nota) VALUES
    (1, 1, '2024.1', 8.5),
    (1, 2, '2024.1', 7.0),
    (2, 1, '2024.1', 9.0);

-- =============================================
-- Consultas de exemplo
-- =============================================

-- Listar todos os alunos com seus cursos
SELECT a.nome AS aluno, c.nome AS curso
FROM alunos a
JOIN cursos c ON a.curso_id = c.id;

-- Notas do aluno João
SELECT a.nome AS aluno, d.nome AS disciplina, m.nota
FROM matriculas m
JOIN alunos      a ON m.aluno_id      = a.id
JOIN disciplinas d ON m.disciplina_id = d.id
WHERE a.nome = 'João Silva';

-- Média de notas por disciplina
SELECT d.nome AS disciplina, ROUND(AVG(m.nota), 2) AS media
FROM matriculas  m
JOIN disciplinas d ON m.disciplina_id = d.id
GROUP BY d.nome
ORDER BY media DESC;
