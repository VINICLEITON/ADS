# Exemplo: Conceitos básicos de POO em Python

# Classe base (abstração e encapsulamento)
class Animal:
    def __init__(self, nome, especie):
        self.__nome = nome       # atributo privado (encapsulamento)
        self.__especie = especie

    def get_nome(self):
        return self.__nome

    def get_especie(self):
        return self.__especie

    # Método que será sobrescrito (polimorfismo)
    def falar(self):
        return "..."

    def __str__(self):
        return f"{self.__especie}: {self.__nome}"


# Herança
class Cachorro(Animal):
    def __init__(self, nome):
        super().__init__(nome, "Cachorro")

    def falar(self):  # polimorfismo
        return "Au au!"


class Gato(Animal):
    def __init__(self, nome):
        super().__init__(nome, "Gato")

    def falar(self):  # polimorfismo
        return "Miau!"


# Criando objetos
animais = [Cachorro("Rex"), Gato("Mimi")]

for animal in animais:
    print(f"{animal} diz: {animal.falar()}")

