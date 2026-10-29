def prenchermatriz(nlinha, ncoluna):
    matriz = []
    
    for i in range(nlinha):
        linha = []
        
        for j in range (ncoluna):
            
            print("-"*30)
            print("Elemento da coluna linha",i,"coluna",j)
            linha.append(int(input()))
            
            print("-"*30)
        
        matriz.append(linha)
    
    return matriz