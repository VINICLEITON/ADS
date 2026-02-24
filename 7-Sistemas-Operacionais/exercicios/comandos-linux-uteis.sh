#!/usr/bin/env bash
# comandos-linux-uteis.sh
# Referência rápida de comandos Linux para Sistemas Operacionais

echo "===== Informações do Sistema ====="
echo "Hostname: $(hostname)"
echo "Usuário:  $(whoami)"
echo "Data/Hora: $(date)"
echo ""

echo "===== Uso de Disco ====="
df -h
echo ""

echo "===== Uso de Memória ====="
free -h
echo ""

echo "===== Processos em Execução (top 10 por CPU) ====="
ps aux --sort=-%cpu | head -11
echo ""

echo "===== Variáveis de Ambiente Importantes ====="
echo "PATH: $PATH"
echo "HOME: $HOME"
echo "SHELL: $SHELL"
