"""
EXERCÍCIO 24:
Faça um programa que receba a temperatura média de cada mês do ano e armazene-as em um vetor. 
O programa deverá calcular e mostrar a maior e a menor temperatura do ano, junto com o mês em que elas ocorreram 
(o mês deverá ser mostrado por extenso: 1 = janeiro; 2 = fevereiro; ...).
Observação: Não se preocupe com empates. Cada cálculo deve ser realizado e mostrado em uma sub-rotina.
"""

def calcular_temperaturas(temperaturas):
    # Vetor com o nome dos meses por extenso, alinhados com o índice (0 a 11)
    meses = ["Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", 
             "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"]
    
    # max() e min() encontram os maiores e menores valores nativamente no Python
    maior_temp = max(temperaturas)
    menor_temp = min(temperaturas)
    
    # .index() encontra a posição exata onde ocorreu a temperatura no vetor (Ex: posição 0 = Janeiro)
    indice_maior = temperaturas.index(maior_temp)
    indice_menor = temperaturas.index(menor_temp)
    
    # Extrai o nome do mês usando a posição encontrada
    mes_maior = meses[indice_maior]
    mes_menor = meses[indice_menor]
    
    # O enunciado pede para mostrar os dados dentro da própria sub-rotina
    print("--- RESULTADOS DO ANO ---")
    print(f"Maior temperatura: {maior_temp}°C ocorrida em {mes_maior}")
    print(f"Menor temperatura: {menor_temp}°C ocorrida em {mes_menor}")

# ==========================================
# PROGRAMA PRINCIPAL
# ==========================================
# Vetor com 12 temperaturas representando os meses de Janeiro a Dezembro
temps_do_ano = [30.5, 32.0, 29.5, 27.0, 24.5, 21.0, 19.5, 22.0, 25.0, 28.5, 31.0, 31.5]

calcular_temperaturas(temps_do_ano)

