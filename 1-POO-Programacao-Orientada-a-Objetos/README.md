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

## 🔗 Git + GitHub direto do NetBeans (sem download/upload manual)

### 1. Clone o repositório pelo NetBeans (primeira vez)

1. No NetBeans, vá em **Team → Git → Clone…**
2. Em **Repository URL**, cole:
   ```
   https://github.com/VINICLEITON/ADS.git
   ```
3. Informe seu **usuário GitHub** e um **Personal Access Token (PAT)** no campo senha  
   _(Para criar o token: GitHub → Settings → Developer settings → Personal access tokens → Generate new token → marque `repo`)_
4. Escolha o diretório local de destino e clique em **Next → Finish**.
5. Quando perguntar qual projeto abrir, selecione `1-POO-Programacao-Orientada-a-Objetos`.

> Se já clonou manualmente, pule para o passo 2.

---

### 2. Salvar (commit) e enviar (push) pelo NetBeans

Após editar ou criar um arquivo Java:

1. Clique com o botão direito no projeto na aba **Projects**.
2. Vá em **Git → Commit…**
3. Escreva uma mensagem descritiva (ex.: `Adiciona exercício de herança`) e clique **Commit**.
4. Para enviar ao GitHub: **Git → Remote → Push…** → confirme o branch e clique **Push**.

Atalho rápido de teclado: `Ctrl+K` (commit) e depois repita o passo 4 pelo menu para o push.

> ✅ Após o push, o GitHub Actions compila automaticamente seu projeto e avisa se houver erro de compilação (veja a aba **Actions** no repositório GitHub).

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
