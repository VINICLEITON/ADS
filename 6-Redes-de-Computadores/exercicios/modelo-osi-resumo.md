# Resumo: Modelo OSI e TCP/IP

## Modelo OSI (7 Camadas)

| # | Camada            | Função Principal                               | Exemplos de Protocolo     |
|---|-------------------|------------------------------------------------|---------------------------|
| 7 | Aplicação         | Interface com o usuário / aplicações           | HTTP, FTP, DNS, SMTP      |
| 6 | Apresentação      | Codificação, criptografia e compressão         | SSL/TLS, JPEG, ASCII      |
| 5 | Sessão            | Controle de sessões e conexões                 | NetBIOS, RPC              |
| 4 | Transporte        | Transmissão fim-a-fim, controle de fluxo       | TCP, UDP                  |
| 3 | Rede              | Roteamento e endereçamento lógico (IP)         | IP, ICMP, ARP             |
| 2 | Enlace de Dados   | Transmissão entre nós adjacentes (MAC)         | Ethernet, Wi-Fi (802.11)  |
| 1 | Física            | Transmissão de bits pelo meio físico           | Cabo, fibra, ondas de rádio|

---

## Modelo TCP/IP (4 Camadas)

| Camada TCP/IP   | Corresponde ao OSI        |
|-----------------|---------------------------|
| Aplicação       | Aplicação + Apresentação + Sessão |
| Transporte      | Transporte                |
| Internet        | Rede                      |
| Acesso à Rede   | Enlace + Física           |

---

## Endereçamento IPv4

- Endereço: 32 bits → 4 octetos decimais (ex: `192.168.1.10`)
- Classes:
  - **Classe A:** `1.0.0.0` – `126.255.255.255` (máscara `/8`)
  - **Classe B:** `128.0.0.0` – `191.255.255.255` (máscara `/16`)
  - **Classe C:** `192.0.0.0` – `223.255.255.255` (máscara `/24`)

### Exemplo de sub-rede (CIDR)
- Rede: `192.168.1.0/24`
- Máscara: `255.255.255.0`
- Hosts disponíveis: 254 (de `192.168.1.1` a `192.168.1.254`)
- Broadcast: `192.168.1.255`

---

## TCP vs UDP

| Característica | TCP                  | UDP                  |
|----------------|----------------------|----------------------|
| Confiabilidade | Garantida            | Não garantida        |
| Orientado a conexão | Sim (3-way handshake) | Não           |
| Velocidade     | Menor                | Maior                |
| Uso típico     | HTTP, FTP, email     | DNS, streaming, jogos|
