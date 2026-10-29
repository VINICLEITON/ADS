
idades = []

for i in range(8):
    idade = int(input(f"Digite a idade do aluno {i + 1}: "))
    idades.append(idade)

codigos_disciplinas = []
for i in range(5):
    codigo = int(input(f"Digite o código da disciplina {i + 1}: "))
    codigos_disciplinas.append(codigo)

quantidade_provas = []
for i in range(8):
    linha = []
    for j in range(5):
        provas = int(
            input(
                f"Digite a quantidade de provas do aluno {i + 1} "
                f"na disciplina {codigos_disciplinas[j]}: "
            )
        )
        linha.append(provas)
    quantidade_provas.append(linha)

print("\nIdades dos alunos:")
print(idades)

print("\nCódigos das disciplinas:")
print(codigos_disciplinas)

print("\nQuantidade de provas por aluno e disciplina:")
for i in range(8):
    print(f"Aluno {i + 1}: {quantidade_provas[i]}")
