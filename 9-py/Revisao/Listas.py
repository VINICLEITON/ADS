#diferença das Tuplas pras Listas 
#TUPLAS
Lanche = ('b','c','d') #Ela e uma tupla que e imutaveis, e não se pode almentar diminuir ou alterar


#LISTA

Lanche = ['b','c','d'] #Essa ja e mutavel pode-se adicionar, subistituir e aumentar

Lanche.append('e') #Adicionar ao final Lacnche = [b,c,d,e]

Lanche.insert(0,'a') #Adiciona um item a uma posição especifica, no caso posição zero, Lanche = [a,b,c,d,e]

del Lanche(3) #Remove pelo indice
Lanche.pop(3) #Remove pelo indice ou se caso seja sem indice remove o ultimo
Lanche.remove('d') #Remove pelo elemento, e ele so remove o primeiro que achar
Lanche[2] = 'j' #Ele troca o elemento da posição 2 sendo oem 'Lanche = [a,b,c,d,e]' o 'c' pelo 'j'

if 'f' in Lanche: #So vai remover caso tenho esse indice em Lanche, evita erro de imagem
    Lanche.remove('f')
else:
    print('não achei o elemento')

for L in Lanche:
    print(f'{L} ...', end='') #ele vai rodar item por item da lista e apresentar juntamente a mensagem que deixei '...' e o end='' deixa na mesma linha
    
for C, L in enumerate(Lanche): #A função enumerate pega a posição e o valor, ficando em 'c' a posição e em 'l' o valor armasenado nesta posição
    print(f'na posição {C} encontrei o valor {L}')
print('final da lista')
    
    
#Algumas funções
    
Valores = list(range(4,11)) #Essa função cria uma lista que começa em 4 e termina em 10, e se colocar um terceiro numero tipo : range(4,11,2) ele vai criar esta lista pulando de 2 em dois 

Valores = [3,4,5,0,2,1] 
Valores.sort() #Isso vai ordenar os valores de uma lista deixando em ordem como  [0,1,2,3,4,5]
Valores.sort(reverse=True) #Isso faz ela ficar ao inverso do maior para o menor

len(Valores) #Isso apresenta o tamanho da lista no caso seria 6


#Usuario insere o valor

for cont in range(0,5):
    Valores.append(int(input('Adicione um valor: ')))
    
