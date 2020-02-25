package application;

import chess.ChessMatch;

public class Xadrez {

	public static void main(String[] args) {

		ChessMatch chessMatch = new ChessMatch();
		// UI = User interface (Inteface do usuário) - Classe
		UI.printBoard(chessMatch.getPieces());
	}

}
