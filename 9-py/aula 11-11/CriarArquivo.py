#modo de leitura e sobreescrita do arquivo "w"
""" f = open("teste","w")
print(f)

f.write("Agora e hora de")
f.write(" fechar o arquivo")
"""
#modo de leitura "r"
""" f = open("teste","r")
texto = f.read(10) #o numero delimita a quantidade de caracteres a ser lida 
print(texto)
 """

#modo de leitura e sobrescrita  com quebra linha e fechamento "w"
""" f = open("teste","w")
f.write(" linha um\n linha dois\n linha tres")
f.close() """

#modo de leitura que le a primeira linha
""" f = open("teste","r")
print(f.readline()) """

#modo de leitura que le o arquivo e cria um arrey com cada item sendo uma linha
""" 
f = open("teste","r")
print(f.readlines()) """

#modo que começa a inserir os dados que tavam no arquivo em uma variavel
""" arquivo = open("numeros.txt","w")
for linha in range(1,101):
    arquivo.write(f"{linha}\n")
arquivo.close() """

#adiciona os dados de cada linha do arquivo .txt em um item do arrey e apresenta (le o aruivo e apresenta na tela as linhas do mesmo   )
arquivo =open("nuemero.txt","r")
for linha in arquivo.readlines():
    print(linha)
arquivo.close()
