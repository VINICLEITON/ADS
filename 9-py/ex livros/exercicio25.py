"""
EXERCÍCIO 25:
Crie um programa que receba o número dos 10 alunos de uma sala, armazenando-os em um vetor, 
junto com as notas obtidas ao longo do semestre (foram realizadas quatro avaliações). 
Elabore sub-rotinas para:
- determinar e mostrar a média aritmética de todos os alunos;
- indicar os números dos alunos que deverão fazer recuperação, ou seja, aqueles com média inferior a 6.
Observação: Todas as mensagens deverão ser mostradas no programa principal.
"""

# Sub-rotina 1: Determinar e mostrar a média aritmética de todos
def calcular_media_turma(notas):
    # sum(notas) faz a soma total, len(notas) divide pela quantidade de alunos
    media = sum(notas) / len(notas)
    return media

# Sub-rotina 2: Retornar lista de alunos em recuperação (média < 6)
def indicar_recuperacao(numeros_alunos, notas):
    alunos_recuperacao = []
    
    # O range(len()) percorre os índices de 0 a 9 (para 10 alunos)
    for i in range(len(notas)):
        # Verifica se a nota na posição 'i' é menor que 6
        if notas[i] < 6.0:
            alunos_recuperacao.append(f"Aluno {numeros_alunos[i]} (Nota: {notas[i]})")
            
    return alunos_recuperacao

# ==========================================
# PROGRAMA PRINCIPAL
# ==========================================
numeros = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
notas_finais = [7.5, 4.0, 8.5, 9.0, 5.5, 6.0, 3.5, 10.0, 5.0, 7.0]

# O enunciado exige que TODAS as mensagens sejam mostradas no programa principal
media_geral = calcular_media_turma(notas_finais)
recuperacao = indicar_recuperacao(numeros, notas_finais)

print(f"A média aritmética de toda a turma é: {media_geral:.2f}\n")
print("ALUNOS EM RECUPERAÇÃO:")
for aluno in recuperacao:
    print(aluno)

