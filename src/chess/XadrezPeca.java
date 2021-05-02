package chess;

import boardgame.Pecas;
import boardgame.Tabuleiro;

public class XadrezPeca extends Pecas{
	private Cor cor;

	public XadrezPeca(Tabuleiro tabuleiro, Cor cor) {
		super(tabuleiro);
		this.cor = cor;
	}

	public Cor getCor() {
		return cor;
	}
}
