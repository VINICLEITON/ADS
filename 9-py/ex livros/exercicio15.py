"""
EXERCÍCIO 15:
Elabore uma sub-rotina que receba um vetor X de 15 números inteiros como parâmetro e retorne a quantidade de valores pares em X.
"""

def contar_pares(vetor_X):
    quantidade_pares = 0 # Inicia o contador a zero
    
    for numero in vetor_X:
        # Se o resto da divisão por 2 for igual a zero (%), então é par
        if numero % 2 == 0: 
            quantidade_pares += 1 # Soma 1 à quantidade
            
    return quantidade_pares # Devolve o resultado final

# ==========================================
# PROGRAMA PRINCIPAL
# ==========================================
# O exercício pede 15 números inteiros. Vetor de teste:
vetor_teste = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15]

# Chama a sub-rotina
total = contar_pares(vetor_teste)

print(f"O vetor possui {total} valores pares.")

