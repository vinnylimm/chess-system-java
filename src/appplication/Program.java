package application;
import boardgame.Position;
import boardgame.Board;
import boardgame.Piece;
import chess.ChessMatch;

public class Program {
	public static void main(String[] args){
		ChessMatch chessMatch = new ChessMatch();
		UI.printBoard(chessMatch.getPieces());

	}

}
