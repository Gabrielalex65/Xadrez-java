package application;

import boardgame.Posicao;
import boardgame.Tabuleiro;
import chess.XadrezPartida;

public class Principal {

	public static void main(String[] args) {
		XadrezPartida xadrezPartida = new XadrezPartida();
		UI.printTabuleiro(xadrezPartida.getPecas());
		
	}

}
