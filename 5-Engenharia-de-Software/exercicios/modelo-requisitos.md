# Modelo de Especificação de Requisitos de Software (ERS)

**Projeto:** ___________________________
**Versão:** 1.0
**Data:** ___/___/______
**Autor:** ___________________________

---

## 1. Introdução

### 1.1 Objetivo
> Descreva o objetivo do sistema.

### 1.2 Escopo
> Descreva o que o sistema faz e o que está fora do escopo.

### 1.3 Definições e Abreviações
| Termo | Definição |
|-------|-----------|
|       |           |

---

## 2. Descrição Geral

### 2.1 Perspectiva do Produto
> Contexto do sistema no ambiente.

### 2.2 Funções do Produto
> Resumo das principais funcionalidades.

### 2.3 Usuários e Atores
| Ator       | Descrição                       |
|------------|---------------------------------|
| Usuário    | Usuário comum do sistema        |
| Administrador | Gerencia configurações e dados |

---

## 3. Requisitos Funcionais

| ID    | Descrição                                  | Prioridade |
|-------|--------------------------------------------|------------|
| RF-01 | O sistema deve permitir login de usuário   | Alta       |
| RF-02 | O sistema deve permitir cadastro de dados  | Alta       |
| RF-03 | O sistema deve gerar relatórios            | Média      |

---

## 4. Requisitos Não Funcionais

| ID     | Tipo           | Descrição                                           |
|--------|----------------|-----------------------------------------------------|
| RNF-01 | Desempenho     | Resposta em menos de 2 segundos                     |
| RNF-02 | Segurança      | Senhas armazenadas com hash bcrypt                  |
| RNF-03 | Usabilidade    | Interface responsiva para mobile e desktop          |
| RNF-04 | Disponibilidade| Sistema disponível 99,5% do tempo                   |

---

## 5. Casos de Uso (Resumo)

### UC-01: [Nome do Caso de Uso]
- **Ator Principal:** Usuário
- **Pré-condição:** Usuário autenticado
- **Fluxo Principal:**
  1. Usuário acessa a funcionalidade
  2. Sistema exibe formulário
  3. Usuário preenche e confirma
  4. Sistema valida e salva os dados
- **Fluxo Alternativo:**
  - 3a. Dados inválidos: sistema exibe mensagem de erro

---

## 6. Restrições

- O sistema deve ser desenvolvido em _______________
- O banco de dados utilizado será _______________
