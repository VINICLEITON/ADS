# Exemplo: Combinatória e Lógica em Python

import math

# ===== Combinatória =====

def fatorial(n):
    return math.factorial(n)

def permutacao(n, r):
    """P(n, r) = n! / (n-r)!"""
    return math.perm(n, r)

def combinacao(n, r):
    """C(n, r) = n! / (r! * (n-r)!)"""
    return math.comb(n, r)

def arranjo_com_repeticao(n, r):
    """A*(n, r) = n^r"""
    return n ** r

print("===== Combinatória =====")
print(f"Fatorial de 5: {fatorial(5)}")
print(f"Permutação P(8, 3): {permutacao(8, 3)}")
print(f"Combinação C(10, 4): {combinacao(10, 4)}")
print(f"Arranjo com repetição A*(3, 2): {arranjo_com_repeticao(3, 2)}")

# ===== Lógica Proposicional =====

print("\n===== Tabela Verdade: p AND q =====")
print(f"{'p':<6} {'q':<6} {'p AND q'}")
for p in [True, False]:
    for q in [True, False]:
        print(f"{str(p):<6} {str(q):<6} {str(p and q)}")

print("\n===== Tabela Verdade: p OR q =====")
print(f"{'p':<6} {'q':<6} {'p OR q'}")
for p in [True, False]:
    for q in [True, False]:
        print(f"{str(p):<6} {str(q):<6} {str(p or q)}")

print("\n===== Tabela Verdade: p IMPLICA q (p → q) =====")
print(f"{'p':<6} {'q':<6} {'p → q'}")
for p in [True, False]:
    for q in [True, False]:
        implicacao = (not p) or q
        print(f"{str(p):<6} {str(q):<6} {str(implicacao)}")

# ===== Aritmética Modular =====
print("\n===== Aritmética Modular =====")
print(f"17 mod 5 = {17 % 5}")
print(f"2^10 mod 7 = {pow(2, 10, 7)}")
