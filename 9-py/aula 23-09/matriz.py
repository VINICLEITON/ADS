matriz = []

for i in range(3):
    linha = []
    
    for j in range (3):
        print("Elemento da linha",i,"coluna",j)
        linha.append(int(input("Numero :")))
        
    matriz.append(linha)
    
print(matriz)

'''
[7,4]
[3,1]
[2,9]

'''
for j in range(len(matriz[0])): 
    somaColuna = 0
    
    for i in range(len(matriz)):
        somaColuna += matriz[i][j]
        
        print(matriz[i][j])