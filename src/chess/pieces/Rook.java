package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class Rook extends ChessPiece {

	public Rook(Board board, Color color) {
		super(board, color);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "R";
	}

	@Override
	public boolean[][] possibleMoves() {
		// implementação provisória
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
        // por enquanto		
		return mat;
	}	
	
}
