# 1. POO – Programação Orientada a Objetos

Disciplina focada em Programação Orientada a Objetos (POO) com ênfase na linguagem **Java**.

> Esta pasta é uma **pasta normal** (não é um projeto Java). Cada projeto Java fica em sua própria subpasta, pronto para ser aberto individualmente no NetBeans.

## Estrutura de Pastas

```
1-POO-Programacao-Orientada-a-Objetos/
├── atividades-em-sala/        # Projetos Java das atividades feitas em sala de aula
├── projetos/                  # Projetos e trabalhos maiores da disciplina
├── exemplos/                  # Exemplos de código e projetos de referência
│   ├── JavaPackPOO/           # Coleção de exemplos e códigos de aula
│   │   └── src/
│   │       ├── BaseCodigos/       # Exemplos base (Arrays, Laços, Strings, etc.)
│   │       ├── CodigosDeAulas/    # Códigos vistos em aula (entrada, repetição, etc.)
│   │       └── atividades/        # Atividades anteriores
│   └── POO-Java/              # Projeto NetBeans de exemplo (Ant/build.xml)
│       ├── build.xml
│       ├── manifest.mf
│       ├── nbproject/
│       └── test/
└── README.md
```

### Como adicionar um novo projeto

1. Crie o projeto Java no NetBeans normalmente (**File → New Project…**).
2. Salve-o **dentro** de uma das subpastas acima, por exemplo:
   - Atividade de aula → `atividades-em-sala/NomeDoProjeto/`
   - Projeto maior → `projetos/NomeDoProjeto/`
   - Exemplo de referência → `exemplos/NomeDoProjeto/`
3. Cada projeto fica em sua própria pasta com seus arquivos `nbproject/`, `build.xml`, `src/`, etc.

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

## 🖥️ Como abrir um projeto no NetBeans

1. Abra o **NetBeans IDE**.
2. No menu superior, clique em **File → Open Project…**
3. Navegue até a **subpasta do projeto** desejado (ex.: `atividades-em-sala/MinhaAtividade/`).
4. O NetBeans reconhecerá o projeto automaticamente (ícone de xícara de café ☕).
5. Clique em **Open Project**.

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
5. Depois abra o projeto desejado dentro de `1-POO-Programacao-Orientada-a-Objetos/`.

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
