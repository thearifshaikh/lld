package lld.chess.model.piece;

import lld.chess.model.Color;

public class Pawn extends Piece {
    public Pawn(Color color) {
        this.color = color;
    }

    @Override
    public boolean canMove(Piece[][] grid,int x2, int y2) {
        return false;
    }
}
