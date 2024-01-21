package lld.chess;

import lld.chess.model.ChessGame;

public class Main {
    public static void main(String[] args) {
        ChessGame chessGame = new ChessGame();
        chessGame.initializeGame("arif", "manoj");
        chessGame.playGame();
    }
}
