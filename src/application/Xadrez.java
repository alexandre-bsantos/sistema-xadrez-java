package application;

import chess.ChessMatch;

public class Xadrez {

	public static void main(String[] args) {

		ChessMatch chessMatch = new ChessMatch();
		// UI = User interface (Inteface do usu�rio) - Classe
		UI.printBoard(chessMatch.getPieces());
	}

}
