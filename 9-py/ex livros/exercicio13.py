"""
EXERCÍCIO 13:
Foi realizada uma pesquisa entre 15 habitantes de uma região. Os dados coletados de cada habitante foram: idade, sexo, salário e número de filhos.
Faça uma sub-rotina que leia esses dados armazenando-os em vetores. Depois, crie sub-rotinas que recebam esses vetores como parâmetro e retornem a média de salário entre os habitantes, a menor e a maior idade do grupo e a quantidade de mulheres com três filhos que recebem até R$ 500,00 (utilize uma sub-rotina para cada cálculo).
"""

# 1. Sub-rotina para Média de salário
def media_salario(salarios):
    # sum() soma todos os valores do vetor, len() conta a quantidade de elementos
    return sum(salarios) / len(salarios)

# 2. Sub-rotina para Menor e maior idade
def menor_maior_idade(idades):
    # min() acha o menor valor, max() acha o maior valor
    menor = min(idades)
    maior = max(idades)
    return menor, maior # Retorna os dois valores ao mesmo tempo

# 3. Sub-rotina para Quantidade de mulheres com 3 filhos que recebem até 500
def mulheres_3_filhos_ate_500(sexos, filhos, salarios):
    quantidade = 0
    # Percorre o vetor usando o índice (i) para poder aceder aos 3 vetores na mesma posição
    for i in range(len(sexos)):
        # Verifica as três condições na mesma posição 'i'
        if sexos[i] == 'F' and filhos[i] == 3 and salarios[i] <= 500.00:
            quantidade += 1
    return quantidade

# ==========================================
# PROGRAMA PRINCIPAL
# ==========================================
# Dados fictícios para teste (o exercício pede 15, aqui testamos com 4)
idades_habitantes = [25, 40, 30, 22]
sexos_habitantes = ['M', 'F', 'F', 'F']
salarios_habitantes = [1500.0, 450.0, 300.0, 480.0]
filhos_habitantes = [0, 3, 3, 3]

# Chamando as sub-rotinas e guardando os resultados
media = media_salario(salarios_habitantes)
menor_id, maior_id = menor_maior_idade(idades_habitantes)
qtd_mulheres = mulheres_3_filhos_ate_500(sexos_habitantes, filhos_habitantes, salarios_habitantes)

# Apresentando os resultados no ecrã
print(f"Média de Salários: R$ {media:.2f}")
print(f"Menor Idade: {menor_id} | Maior Idade: {maior_id}")
print(f"Mulheres com 3 filhos e salário até R$500: {qtd_mulheres}")

