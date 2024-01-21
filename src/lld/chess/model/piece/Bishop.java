package lld.chess.model.piece;

import lld.chess.model.Color;
import lld.chess.model.piece.Piece;

public class Bishop extends Piece {
    public Bishop(Color color) {
        this.color = color;
    }

    @Override
    public boolean canMove(Piece[][] grid,int x2, int y2) {
        return false;
    }
}
