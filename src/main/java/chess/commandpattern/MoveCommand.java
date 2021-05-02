package chess.commandpattern;

import chess.movement.MoveImpl;
import chess.play.BoardInitializer;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MoveCommand implements Command {
    MoveImpl move;

    MoveCommand(MoveImpl move) {
        this.move = move;
    }

    @Override
    public void execute() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inp = this.getClass().getCanonicalName();
        try {
            while (inp != null && inp.trim() != "") {
                String expectedColor = "W";
                if (inp.trim().equals(""))
                    break;
                inp = br.readLine();
                if (inp.trim().equals(""))
                    break;
                String inputMove[] = inp.split(" ");
                if (!inputMove[0].substring(0, 1).trim().equals(expectedColor)) {
                    System.out.println(inputMove[0].substring(0, 1).equals(expectedColor) ? "Its Black Turn" : "Its White Turn");
                    continue;
                } else
                    expectedColor = inputMove[0].equals(expectedColor) ? "B" : expectedColor;

                move.move(inputMove);

                BoardInitializer.displayBoardState();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
