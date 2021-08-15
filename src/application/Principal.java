package application;

import chess.ChessMatch;

public class Principal {

	public static void main(String[] args) {
		ChessMatch xadrezPartida = new ChessMatch();
		UI.printTabuleiro(xadrezPartida.getPecas());
		
	}

}
