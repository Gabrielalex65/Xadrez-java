package chess;

import boardgame.Board;
import chess.pieces.Rei;
import chess.pieces.Torre;

public class ChessMatch {
	private Board board;
	
	public ChessMatch() {
		board = new Board(8, 8);
		ConfigInicial();
	}
	
	public ChessPiece[][] getPecas() {
		ChessPiece[][] mat = new ChessPiece[board.getLinhas()][board.getColunas()];
		for(int i = 0; i < board.getLinhas(); i++) {
			for(int j = 0; j < board.getColunas(); j++ ) {
				mat[i][j] = (ChessPiece) board.peca(i, j);
			}
		}
		return mat;
	}
	private void placeNewPiece(char column, int row, ChessPiece piece) {
		board.colocarPeca(piece, new ChessPosition(column, row).toPosition());
	}
	private void ConfigInicial() {
		placeNewPiece('b',6,new Torre(board, Color.BRANCA));
		placeNewPiece('e',8,new Rei(board, Color.PRETA));
		placeNewPiece('e',1,new Rei(board, Color.BRANCA));
	}
}
