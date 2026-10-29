estudantes = []
notas = []

for i in range(3):
    print("*" * 30)
    estudantes.append(input("Digite o nome do estudante: "))
    linha = []

    for j in range(2):
        print(f"Nota {j + 1}")
        linha.append(float(input()))

    notas.append(linha)

for i in range(len(estudantes)):
    soma = 0

    for j in range(len(notas[0])):
        soma += notas[i][j]

    media = soma / len(notas[0])

    if media >= 7:
        situacao = "Aprovado"
    elif media >= 6:
        situacao = "Exame"
    else:
        situacao = "Reprovado"

    print(f"\nAluno: {estudantes[i]}")
    print(f"Média: {media:.2f}")
    print(f"Situação: {situacao}")

soma_turma = 0
for i in range(len(estudantes)):
    soma = 0
    for j in range(len(notas[0])):
        soma += notas[i][j]
    soma_turma += soma / len(notas[0])

media_turma = soma_turma / len(estudantes)
print(f"\nMédia da turma: {media_turma:.2f}")
