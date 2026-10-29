
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




"""
=================================================================
RESUMO 1: VETORES (LISTAS) EM PYTHON
=================================================================
Na linguagem Python, os "vetores" do seu livro de lógica são
chamados de Listas. Elas são mutáveis (podem crescer, diminuir 
e ter seus valores alterados).
"""

# 1. CRIANDO UM VETOR
vetor_vazio = []
vetor_preenchido = ['b', 'c', 'd'] 

# 2. ADICIONANDO ELEMENTOS
vetor_preenchido.append('e')    # Adiciona 'e' no final da lista -> ['b', 'c', 'd', 'e']
vetor_preenchido.insert(0, 'a') # Insere 'a' na posição 0 -> ['a', 'b', 'c', 'd', 'e']

# 3. ALTERANDO E REMOVENDO ELEMENTOS
vetor_preenchido[2] = 'j'       # Troca o item da posição 2 pelo 'j'
del vetor_preenchido[3]         # Remove o item da posição 3 (Atenção: usar colchetes [])
vetor_preenchido.pop()          # Remove o último item da lista
vetor_preenchido.remove('a')    # Remove o primeiro elemento 'a' que encontrar pelo valor

# Evitar erro ao remover algo que não existe:
if 'f' in vetor_preenchido:
    vetor_preenchido.remove('f')

# 4. PREENCHENDO VETOR COM DADOS DO USUÁRIO (input)
valores_usuario = []
# range(0, 5) vai rodar 5 vezes (posições 0, 1, 2, 3, 4)
for cont in range(0, 5):
    # Pede o valor, converte para inteiro (int) e já adiciona (append) na lista
    # Descomente a linha abaixo para testar:
    # valores_usuario.append(int(input('Adicione um número: ')))
    pass

# 5. PERCORRENDO VETORES (OS LAÇOS DE REPETIÇÃO)
Lanche = ['Suco', 'Pizza', 'Pudim']

# Opção A: Acessando apenas os valores diretamente (Mais simples)
print("\n--- Percorrendo por valor ---")
for L in Lanche:
    print(f'Item: {L}') 

# Opção B: Acessando a Posição e o Valor ao mesmo tempo (Função enumerate)
print("\n--- Percorrendo com enumerate ---")
for C, L in enumerate(Lanche): 
    print(f'Na posição {C} encontrei o valor {L}')

# Opção C: Percorrendo pelo tamanho do vetor (Essencial para múltiplos vetores, Ex. 13 e 25)
print("\n--- Percorrendo pelo índice (range/len) ---")
for i in range(len(Lanche)):
    print(f'Posição {i}: {Lanche[i]}')

# 6. FUNÇÕES NATIVAS SALVA-VIDAS (Para cálculos rápidos)
Valores = [3, 4, 5, 0, 2, 1] 

tamanho = len(Valores)  # Conta quantos itens existem (Resultado: 6)
maior = max(Valores)    # Acha o maior número (Resultado: 5)
menor = min(Valores)    # Acha o menor número (Resultado: 0)
soma = sum(Valores)     # Soma tudo (Resultado: 15)

# Ordenação:
Valores.sort()             # Organiza do menor para o maior: [0, 1, 2, 3, 4, 5]
Valores.sort(reverse=True) # Organiza do maior para o menor: [5, 4, 3, 2, 1, 0]

# Descobrir a posição de um valor específico:
posicao_do_cinco = Valores.index(5) # Acha em qual posição o número 5 está guardado