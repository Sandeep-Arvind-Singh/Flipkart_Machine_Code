package chess.play;

import chess.model.Board;
import chess.movement.Move;
import chess.movement.MoveImpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

/*	public static void main(String[] args) throws IOException {

		Move move = new MoveImpl();
		System.out.println("Input:");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inp = br.readLine();
		if(inp.equals("Board")) {
			String board[][] = new String[8][8];
			for(int i=0;i<8;i++) {
				String row = br.readLine();
				String rowArr[]=row.split(" ");
				if(row.trim()!="")
				for(int j=0;j<8;j++) {
					board[i][j] = rowArr[j];
				}
			}
			BoardInitializer.initialize(board);
			System.out.println();
			System.out.println("BOARD CONSTRUCTED:");
			BoardInitializer.displayBoardState();
		}
		else if(inp.equals("Display")) {
			BoardInitializer.initialize();
			System.out.println();
			System.out.println("BOARD DISPLAY:");
			BoardInitializer.displayBoardState();
		}
		inp=br.readLine();
		if(inp.equals("Moves")){
			while(inp!=null && inp.trim()!="") {
				if(inp.trim().equals(""))
					break;
				inp = br.readLine();
				if(inp.trim().equals(""))
					break;
				String inputMove[]=inp.split(" ");
		if(!inputMove[0].substring(0,1).trim().equals(expectedColor) ) {
					System.out.println(inputMove[0].substring(0,1).equals(expectedColor) ? "Its Black Turn" : "Its White Turn");
					continue;
				}
				else
					expectedColor = inputMove[0].equals(expectedColor)?"B":expectedColor;

					move.move(inputMove);

				BoardInitializer.displayBoardState();
			}
		}
	}*/

    public static void main(String[] args) throws IOException {

        Move move = new MoveImpl();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BoardInitializer.initialize();
        System.out.println();
        System.out.println("BOARD DISPLAY:");
        BoardInitializer.initialize(Board.CHESS_BOARD);
        BoardInitializer.displayBoardState();


        while (true) {
            String expectedColor = "W";
            String inp = br.readLine();
            if (inp.trim().equals(""))
                break;

            String inputMove[] = inp.split(" ");
           //				if(move.validate(inputMove)) {
            move.move(inputMove);
//				}
            BoardInitializer.displayBoardState();

        }
    }
}