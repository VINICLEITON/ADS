matriz = []


for i in range (3) :
    linha = []

    for j in range (3):
        
        print("-"*30)
        print("Elemento da coluna linha",i,"coluna",j)
        linha.append(int(input()))
        
        

    matriz.append(linha)

print("+-+"*15)
for i in matriz:
    print(*i)