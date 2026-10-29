"""
EXERCÍCIO 14:
Faça uma sub-rotina que receba um vetor X de 30 elementos inteiros como parâmetro e retorne dois vetores A e B. 
O vetor A deve conter os elementos de X que sejam maiores que zero e o vetor B, os elementos menores ou iguais a zero.
"""

# Cria a sub-rotina que recebe o vetor original
def separar_vetores(vetor_X):
    vetor_A = [] # Lista vazia para os maiores que zero
    vetor_B = [] # Lista vazia para os menores ou iguais a zero
    
    # O ciclo for percorre cada elemento do vetor_X
    for numero in vetor_X:
        if numero > 0:
            vetor_A.append(numero) # Adiciona no vetor A
        else:
            vetor_B.append(numero) # Adiciona no vetor B
            
    # Retorna os dois vetores criados
    return vetor_A, vetor_B 

# ==========================================
# PROGRAMA PRINCIPAL
# ==========================================
# Criando um vetor de teste (o exercício pede 30 elementos, colocamos alguns para testar)
vetor_teste = [10, -5, 0, 4, -2, 8, -9, 1]

# Chama a função e recebe os dois vetores de volta
A, B = separar_vetores(vetor_teste) 

print(f"Vetor Original: {vetor_teste}")
print(f"Vetor A (Maiores que zero): {A}")
print(f"Vetor B (Menores ou iguais a zero): {B}")

