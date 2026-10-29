"""
EXERCÍCIO 19:
Faça uma sub-rotina que receba como parâmetro dois vetores de dez números inteiros, determine e mostre o vetor intersecção entre eles.
"""

# Sub-rotina que recebe os dois vetores
def intersecao(vetor_1, vetor_2):
    vetor_resultado = []
    
    # Percorre cada elemento do primeiro vetor
    for numero in vetor_1:
        # Se o número estiver no vetor 2 E ainda não tiver sido adicionado ao resultado
        if numero in vetor_2 and numero not in vetor_resultado:
            vetor_resultado.append(numero)
            
    return vetor_resultado

# ==========================================
# PROGRAMA PRINCIPAL
# ==========================================
vetor_A = [30, 5, 90, -29, 2, 2]
vetor_B = [-10, -29, 30, 1, 2, 90]

# Chamando a função
iguais = intersecao(vetor_A, vetor_B)

print(f"Vetor A: {vetor_A}")
print(f"Vetor B: {vetor_B}")
print(f"A intersecção (elementos presentes em ambos) é: {iguais}")

