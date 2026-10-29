"""
EXERCÍCIO 16:
Faça uma sub-rotina que receba um vetor X de 20 números reais como parâmetro e retorne a soma dos elementos de X.
"""

def somar_vetor(vetor_X):
    soma = 0 # Variável acumuladora começa a zero
    
    for numero in vetor_X:
        # Pega no valor anterior da soma e junta o novo número
        soma = soma + numero 
        
    return soma # Retorna o total

# ==========================================
# PROGRAMA PRINCIPAL
# ==========================================
# Vetor de 20 números reais (números com casas decimais / vírgula flutuante)
vetor_teste = [5.5, 10.0, 4.5, 2.0] # Resumido para testar

resultado_soma = somar_vetor(vetor_teste)

print(f"Vetor: {vetor_teste}")
print(f"A soma de todos os elementos é: {resultado_soma}")

