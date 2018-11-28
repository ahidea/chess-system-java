package chess;

import boardgame.Board;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {

	private Board board;
	
	public ChessMatch( ) {
		board = new Board(8,8);
		initialSetup();
	}
	
	public ChessPiece[][] getPieces() {
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for(int i=0; i<board.getRows(); i++) {
			for(int j=0; j<board.getColumns(); j++) {
				mat[i][j] = (ChessPiece)board.piece(i,j);
			}
		}
		return mat;
	}

	private void placeNewPiece(char column, int row, ChessPiece piece) {
	  board.placePiece(piece, new ChessPosition(column, row).toPosition() );	
	}
	
	private void initialSetup() {
//		board.placePiece(new Rook(board,Color.WHITE), new Position(2,1) );
//		board.placePiece(new King(board,Color.BLACK), new Position(0,4) );
//		board.placePiece(new King(board,Color.WHITE), new Position(7,4) );
		placeNewPiece('b',6,new Rook(board,Color.WHITE));
		placeNewPiece('e',8,new King(board,Color.BLACK));
		placeNewPiece('e',1,new King(board,Color.WHITE));
	}
}
