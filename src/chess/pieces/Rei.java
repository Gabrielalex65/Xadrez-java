package chess.pieces;

import boardgame.Board;
import chess.Color;
import chess.ChessPiece;

public class Rei extends ChessPiece {

	public Rei(Board board, Color color) {
		super(board, color);
	}
	@Override
	public String toString() {
		return "R";
	}

}
