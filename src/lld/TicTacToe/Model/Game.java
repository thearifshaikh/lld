package lld.TicTacToe.Model;

import lld.TicTacToe.Model.Piece.PieceX;
import lld.TicTacToe.Model.Piece.PieceY;
import lld.TicTacToe.Model.Piece.PlayingPiece;

import java.util.Deque;
import java.util.LinkedList;

public class Game {
    Deque<Player> players;
    Board gameBoard;

    void initalizeGame() {
        PlayingPiece pieceX = new PieceX();
        PlayingPiece pieceY = new PieceY();

        Player player1 = new Player("Player1", pieceX);
        Player player2 = new Player("Player2", pieceY);

        players = new LinkedList<>();
        players.add(player1);
        players.add(player2);

        gameBoard = new Board(3);
    }

    void startGame() {

    }
}
