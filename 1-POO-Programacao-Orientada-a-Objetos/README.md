# 1. POO – Programação Orientada a Objetos

Disciplina focada em Programação Orientada a Objetos (POO) com ênfase na linguagem **Java**.

## Estrutura de Pastas

```
1-POO-Programacao-Orientada-a-Objetos/
├── build.xml                  # Script de build do Ant (usado pelo NetBeans)
├── manifest.mf                # Manifesto do JAR
├── nbproject/                 # Arquivos de configuração do NetBeans
│   ├── project.xml            # Definição do projeto
│   └── project.properties    # Caminhos de source/build
├── exercicios/
│   └── src/                   # Código-fonte Java (raiz dos fontes no NetBeans)
├── projetos/                  # Projetos e trabalhos da disciplina
└── test/                      # Testes unitários
```

## Tópicos Abordados

- Classes e Objetos
- Encapsulamento
- Herança
- Polimorfismo
- Abstração
- Interfaces e Classes Abstratas
- Coleções (`ArrayList`, `HashMap`, etc.)
- Tratamento de Exceções

## Linguagem

**Java** (JDK 17+)

---

## 🖥️ Como abrir no NetBeans

1. Abra o **NetBeans IDE**.
2. No menu superior, clique em **File → Open Project…**
3. Navegue até a pasta `1-POO-Programacao-Orientada-a-Objetos` dentro do repositório clonado.
4. O NetBeans irá reconhecer o projeto automaticamente (ícone de xícara de café ☕).
5. Clique em **Open Project**.
6. Os arquivos Java em `exercicios/src/` aparecerão na aba **Projects** do NetBeans.

> ⚠️ **Pré-requisito:** tenha o **JDK 17+** instalado e configurado no NetBeans  
> (`Tools → Java Platforms → Add Platform…`)

---

## Como Compilar e Executar

### Pelo NetBeans
- **Run (F6):** compila e executa a classe principal (`HelloWorld`)
- **Build (F11):** gera o `.jar` em `dist/`
- **Clean and Build (Shift+F11):** limpa e reconstrói o projeto

### Pela Linha de Comando
```bash
# Compilar
javac exercicios/src/NomeDoArquivo.java

# Executar
java -cp exercicios/src NomeDaClasse
```
