package chess.pieces;

import boardgame.Tabuleiro;
import chess.Cor;
import chess.XadrezPeca;

public class Rei extends XadrezPeca{

	public Rei(Tabuleiro tabuleiro, Cor cor) {
		super(tabuleiro, cor);
	}
	@Override
	public String toString() {
		return "R";
	}

}
