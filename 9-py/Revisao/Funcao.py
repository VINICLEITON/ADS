
# PADRÃO 1: Passar um vetor e retornar UM número (Ex: Exercicio 15 - Contar pares)
def contar_pares(vetor):
    quantidade = 0
    for numero in vetor: # Percorre todos os itens da lista
        if numero % 2 == 0: # Verifica se é par (resto da divisão por 2 é igual a zero)
            quantidade += 1
    return quantidade


# PADRÃO 2: Passar um vetor e retornar OUTRO vetor (Ex: Exercicio 14 - Separar dados)
def separar_maiores_que_zero(vetor_original):
    vetor_novo = [] # Cria um vetor vazio para guardar a resposta
    for num in vetor_original:
        if num > 0:
            vetor_novo.append(num) # Adiciona no novo vetor
    return vetor_novo


# PADRÃO 3: Receber DOIS vetores e retornar UM vetor (Ex: Exercicio 19 - Intersecção)
def achar_numeros_comuns(vetor_a, vetor_b):
    vetor_interseccao = []
    # Um jeito bem "Python" e mais simples de fazer do que usar dois 'for' alinhados:
    for item in vetor_a:
        if item in vetor_b: 
            vetor_interseccao.append(item)
    return vetor_interseccao

lista_prova = [10, -5, 2, 7, -8, 4]
lista_teste = [10, 2, 99]

# 1. Testando a contagem (Ex 15)
total_pares = contar_pares(lista_prova)
print(f"Quantidade de pares: {total_pares}")

# 2. Testando a separação (Ex 14)
apenas_positivos = separar_maiores_que_zero(lista_prova)
print(f"Valores maiores que zero: {apenas_positivos}")

# 3. Testando intersecção (Ex 19)
numeros_iguais = achar_numeros_comuns(lista_prova, lista_teste)
print(f"Números presentes nos dois vetores: {numeros_iguais}")