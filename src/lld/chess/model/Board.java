package lld.chess.model;

import lld.chess.model.piece.Pawn;
import lld.chess.model.piece.Piece;

public class Board {

    private Piece[][] grid;
    public static final int BOARD_SIZE = 8;

    public Piece[][] getGrid() {
        return grid;
    }

    public Board() {
        grid=new Piece[BOARD_SIZE][BOARD_SIZE];
        for(int j=0;j<BOARD_SIZE;j++) {
            grid[1][0]=new Pawn(Color.BLACK);
            grid[6][0]=new Pawn(Color.WHITE);
        }
        //
        //
    }

    public void move(Piece piece, int x2, int y2) {
        // move piece kill and stuff
    }

    public boolean isKingChecked(Piece[][] grid, Color color) {
        // find all attack positions for each piece of this color, see if king of opposite player is at risk
        return false;
    }

    public boolean isKingCheckMate(Piece[][] grid, Color color) {
        // find all attack positions for each piece of this color, see if king of opposite player is at risk and no way out
        return false;
    }
}
