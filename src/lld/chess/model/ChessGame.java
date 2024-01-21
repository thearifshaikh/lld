package lld.chess.model;

import lld.chess.model.piece.Piece;

import java.util.Deque;
import java.util.Scanner;

public class ChessGame {
    Deque<Player> players;
    Board board;

    public void initializeGame(String playerName1, String playerName2) {
        board = new Board();
        Player player1 = new Player(playerName1, Color.WHITE);
        Player player2 = new Player(playerName2, Color.BLACK);
        players.push(player1);
        players.push(player2);
    }

    public void playGame() {
        Player winner = null;
        while(winner!=null) {
            Player curPlayer = players.pop();
            players.push(curPlayer);
            Scanner in = new Scanner(System.in);
            int x1 = in.nextInt();
            int y1 = in.nextInt();
            int x2 = in.nextInt();
            int y2 = in.nextInt();

            Piece piece = board.getGrid()[x1][y1];
            if (piece != null) {
                boolean canMove = piece.canMove(board.getGrid(), x2, y2);
                if (canMove) {
                    board.move(piece,x2,y2);
                }
            }

            boolean kingChecked = board.isKingChecked(board.getGrid(), curPlayer.color);
            System.out.println(players.peek().name + " ur king is checked");

            boolean kingCheckMate = board.isKingCheckMate(board.getGrid(), curPlayer.color);
            System.out.println(players.peek().name + " ur king is check mate");
            if(kingCheckMate) {
                winner = curPlayer;
            }
        }
    }
}
