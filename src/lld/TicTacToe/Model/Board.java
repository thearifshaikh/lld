package lld.TicTacToe.Model;

import lld.TicTacToe.Model.Piece.PlayingPiece;

public class Board {
    int size;
    PlayingPiece[][] board;

    Board(int size){
        size = this.size;
        board = new PlayingPiece[size][size];
    }

    public void printBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] != null) {
                    System.out.print(board[i][j].type.name() + "   ");
                } else {
                    System.out.print("    ");
                }
                System.out.print(" | ");
            }
            System.out.println();
        }
    }
}
