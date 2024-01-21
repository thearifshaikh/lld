package lld.chess.model.piece;

import lld.chess.model.piece.Piece;

public class Rook extends Piece {
    @Override
    public boolean canMove(Piece[][] grid,int x2, int y2) {
        return false;
    }
}
