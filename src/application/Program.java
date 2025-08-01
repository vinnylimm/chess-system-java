package application;
import chess.ChessMatch;
import chess.ChessPosition;
import chess.ChessPiece;
import chess.ChessException;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Program {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		ChessMatch chessMatch = new ChessMatch();
		List<ChessPiece> captured = new ArrayList<>();

		while(!chessMatch.getCheckMate()){
			try{
				UI.clearScreen();
				UI.printMatch(chessMatch, captured);
				System.out.println();
				System.out.print("Source: ");
				ChessPosition source = UI.readChessPosition(sc);

				boolean[][] possibleMoves = chessMatch.possibleMoves(source);
				UI.clearScreen();
				UI.printBoard(chessMatch.getPieces(), possibleMoves);

				System.out.println();
				System.out.print("Target: ");
				ChessPosition target = UI.readChessPosition(sc);

				ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
				if(capturedPiece != null){
					captured.add(capturedPiece);
				}
			}
			catch(ChessException e){
				System.out.println(e.getMessage());
				sc.nextLine();
			}
			catch(InputMismatchException e){
				System.out.println(e.getMessage());
				sc.nextLine();
			}
		}
		UI.clearScreen();
		UI.printMatch(chessMatch, captured);

	}

}
