# Exemplo: Olá Mundo e estruturas básicas em Python

# Variáveis e tipos
nome = "ADS"
semestre = 1
media = 8.5
aprovado = True

print(f"Curso: {nome}")
print(f"Semestre: {semestre}")
print(f"Média: {media}")
print(f"Aprovado: {aprovado}")

# Estrutura condicional
if media >= 6:
    print("Situação: Aprovado")
else:
    print("Situação: Reprovado")

# Laço de repetição
print("\nTabela de multiplicação do 5:")
for i in range(1, 11):
    print(f"5 x {i} = {5 * i}")

# Função
def calcular_fatorial(n):
    if n == 0 or n == 1:
        return 1
    return n * calcular_fatorial(n - 1)

print(f"\nFatorial de 5: {calcular_fatorial(5)}")
