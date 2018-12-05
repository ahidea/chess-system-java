package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Pawn extends ChessPiece {

	public Pawn(Board board, Color color) {
		super(board, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean[][] possibleMoves() {
		
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
		
		Position p = new Position(0, 0);
		
		if ( getColor() == Color.WHITE) {
			// WHITE : ao avançar -> descrementa linha
			// testa primeira casa a frente
			p.setValues( position.getRow() - 1, position.getColumn() );
			if ( getBoard().positionExists(p) && !getBoard().thereIsAPiece(p) ) {
				mat[p.getRow()][p.getColumn()] = true;
			}
			// testa segunda e primeira casa a frete
			Position p2 = new Position( position.getRow() - 1, position.getColumn() );
			p.setValues( position.getRow() - 2, position.getColumn() );
			if ( getBoard().positionExists(p) && !getBoard().thereIsAPiece(p) && getBoard().positionExists(p2) && !getBoard().thereIsAPiece(p2) && getMoveCount() == 0 ) {
				mat[p.getRow()][p.getColumn()] = true;
			}
			// testa diagonal a esquerda
			p.setValues( position.getRow() - 1, position.getColumn() - 1 );
			if ( getBoard().positionExists(p) && isThereOpponentPiece(p) ) {
				mat[p.getRow()][p.getColumn()] = true;
			}			
			// testa diagonal a direita
			p.setValues( position.getRow() - 1, position.getColumn() + 1 );
			if ( getBoard().positionExists(p) && isThereOpponentPiece(p) ) {
				mat[p.getRow()][p.getColumn()] = true;
			}
		}
		else {
			// BLACK : ao avançar -> incrementa linha
			// testa primeira casa a frente
			p.setValues( position.getRow() + 1, position.getColumn() );
			if ( getBoard().positionExists(p) && !getBoard().thereIsAPiece(p) ) {
				mat[p.getRow()][p.getColumn()] = true;
			}
			// testa segunda e primeira casa a frete
			Position p2 = new Position( position.getRow() + 1, position.getColumn() );
			p.setValues( position.getRow() + 2, position.getColumn() );
			if ( getBoard().positionExists(p) && !getBoard().thereIsAPiece(p) && getBoard().positionExists(p2) && !getBoard().thereIsAPiece(p2) && getMoveCount() == 0 ) {
				mat[p.getRow()][p.getColumn()] = true;
			}
			// testa diagonal a esquerda
			p.setValues( position.getRow() + 1, position.getColumn() - 1 );
			if ( getBoard().positionExists(p) && isThereOpponentPiece(p) ) {
				mat[p.getRow()][p.getColumn()] = true;
			}			
			// testa diagonal a direita
			p.setValues( position.getRow() + 1, position.getColumn() + 1 );
			if ( getBoard().positionExists(p) && isThereOpponentPiece(p) ) {
				mat[p.getRow()][p.getColumn()] = true;
			}				
		}	
		
		return mat;
	}

	@Override
	public String toString() {
		return "P";
	}	
}
