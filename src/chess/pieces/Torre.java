package chess.pieces;

import boardgame.Board;
import chess.Color;
import chess.ChessPiece;

public class Torre extends ChessPiece {

	public Torre(Board board, Color color) {
		super(board, color);
	}
	
	@Override
	public String toString() {
		return "T";
	}
	
}
