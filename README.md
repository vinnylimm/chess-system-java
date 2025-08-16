
# Chess System Java

![Chess Game](https://img.shields.io/badge/Game-Chess-blue) ![Java](https://img.shields.io/badge/Language-Java-orange) ![Status](https://img.shields.io/badge/Status-Complete-brightgreen)

Um sistema de jogo de xadrez completo desenvolvido em Java como projeto de aprendizado de programação orientada a objetos.

## 📋 Funcionalidades

- Tabuleiro de xadrez tradicional 8x8
- Movimentação de todas as peças seguindo as regras oficiais
- Captura de peças
- Cheque e cheque-mate
- Promoção de peões
- Roque (castling)
- En passant
- Turnos alternados entre jogadores
- Controle de peças capturadas
- Interface no console

## 🧩 Peças Implementadas

- ♔/♚ Rei
- ♕/♛ Rainha
- ♖/♜ Torre
- ♗/♝ Bispo
- ♘/♞ Cavalo
- ♙/♟ Peão

## 🚀 Como Executar

### Pré-requisitos
- Java JDK 8 ou superior instalado

### Instalação e Execução Rápida

1. Clone o repositório:
   ```bash
   git clone https://github.com/vinnylimm/chess-system-java.git
   ```
2. Navegue até o diretório do projeto:
   ```bash
   cd chess-system-java/src
   ```
3. Execute o script de instalação:
   ```bash
   chmod +x install.sh  # Dá permissão de execução ao script
   ./install.sh         # Compila todos os arquivos Java
   ```
4. Inicie o jogo:
   ```bash
   java application/Program
   ```
## 🎮 Como Jogar

1. O jogo começa com as peças brancas
2. Para mover uma peça, digite a posição no formato "a1" (coluna linha)
3. Digite a posição de destino quando solicitado
4. O jogo indicará se o movimento é válido
5. O jogo termina quando um rei é colocado em cheque-mate
