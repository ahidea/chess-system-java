package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		this.position = null; // --> simbolizando que a pe�a n�o est� no tabuleiro
	}

	protected Board getBoard() {
		return board;
	}


}
