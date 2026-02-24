# Exemplo: Pilha (Stack) implementada em Python

class Pilha:
    def __init__(self):
        self._dados = []

    def empilhar(self, item):
        """Adiciona um elemento no topo da pilha."""
        self._dados.append(item)

    def desempilhar(self):
        """Remove e retorna o elemento do topo da pilha."""
        if self.esta_vazia():
            raise IndexError("Pilha vazia")
        return self._dados.pop()

    def topo(self):
        """Retorna o elemento do topo sem remover."""
        if self.esta_vazia():
            raise IndexError("Pilha vazia")
        return self._dados[-1]

    def esta_vazia(self):
        return len(self._dados) == 0

    def tamanho(self):
        return len(self._dados)


# Uso
if __name__ == "__main__":
    pilha = Pilha()
    pilha.empilhar(10)
    pilha.empilhar(20)
    pilha.empilhar(30)

    print(f"Topo: {pilha.topo()}")          # 30
    print(f"Desempilhado: {pilha.desempilhar()}")  # 30
    print(f"Tamanho: {pilha.tamanho()}")    # 2
