package boardgame;

public class Piece {
	protected Position position;
	public Board board;

	public Piece(Board board){
		this.board = board;
	}

	protected Board getBoard(){
		return board;
	}

}
