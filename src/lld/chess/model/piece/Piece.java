package lld.chess.model.piece;

import lld.chess.model.Color;

public abstract class Piece {
    Color color;
    int x;
    int y;
    boolean isActive;
    public abstract boolean canMove(Piece[][] grid,int x2, int y2);
}
