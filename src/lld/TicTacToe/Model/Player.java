package lld.TicTacToe.Model;

import lld.TicTacToe.Model.Piece.PlayingPiece;

public class Player {
    public String name;
    public PlayingPiece playingPiece;

    public Player(String name, PlayingPiece playingPiece) {
        this.name = name;
        this.playingPiece = playingPiece;
    }
}
