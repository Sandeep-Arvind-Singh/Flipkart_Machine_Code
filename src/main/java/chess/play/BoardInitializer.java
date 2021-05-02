package chess.play;

import chess.model.Board;

public class BoardInitializer {

	public static void initialize() {
		
		String board[][] = {
				{"WR", "WH", "WC", "WQ", "WK", "WC", "WH", "WR"},
				{"WP", "WP", "WP", "WP", "WP", "WP", "WP", "WP"},
				{"--", "--", "--", "--", "--", "--", "--", "--"},
				{"--", "--", "--", "--", "--", "--", "--", "--"},
				{"--", "--", "--", "--", "--", "--", "--", "--"},
				{"--", "--", "--", "--", "--", "--", "--", "--"},
				{"BP", "BP", "BP", "BP", "BP", "BP", "BP", "BP"},
				{"BR", "BH", "BC", "BQ", "BK", "BC", "BH", "BR"}
				};
		Board.TOP_WHITE = false;
		Board.CHESS_BOARD = new String [8][8];
		Board.CHESS_BOARD=board;
	}
	
	public static void initialize(String board[][]) {
		Board.CHESS_BOARD = new String [8][8];
		Board.CHESS_BOARD=board;
		if(Board.CHESS_BOARD[0][0].charAt(0)== 'W')
			Board.TOP_WHITE = true;
		else
			Board.TOP_WHITE = false;
	}
	
	public static void displayBoardState() {
		System.out.println("CURRENT BOARD:");
		for(int i=0;i<8;i++) {
			for(int j=0;j<8;j++) {
				System.out.print(Board.CHESS_BOARD[i][j] +" ");
			}
			System.out.println();
		}
	}
}