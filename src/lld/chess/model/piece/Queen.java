package lld.chess.model.piece;

public class Queen extends Piece {
    @Override
    public boolean canMove(Piece[][] grid,int x2, int y2) {
        return false;
    }
}
