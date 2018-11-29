package boardgame;

public abstract class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		this.position = null; // --> simbolizando que a pe�a n�o est� no tabuleiro
	}

	protected Board getBoard() {
		return board;
	}

	public abstract boolean[][] possibleMoves();
	
	// "hook method"
	
	public boolean possibleMove(Position position) {
		return possibleMoves()[position.getRow()][position.getColumn()];
	}
	
	public boolean IsThereAnyPossibleMove() {
		boolean[][] mat = possibleMoves();
		// usar mat.length --> por ser matriz quadrada!!!
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat.length; j++) {
				if( mat[i][j] == true ) {
					return true;
				}
			}
		}
		return false;
	}
}
