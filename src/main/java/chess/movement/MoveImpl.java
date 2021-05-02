package chess.movement;

import chess.model.*;
import chess.pool.PieceFactory;

public class MoveImpl implements Move {

	String piece;
	int srcX;
	int srcY;
	int destX;
	int destY;
	char color;
	char pieceType;
	
	private void initializeValues(String inputMove[]) {
		piece = inputMove[0];
		srcX = Integer.parseInt(""+inputMove[1].charAt(0));
		srcY = Integer.parseInt(""+inputMove[1].charAt(1));
		destX = Integer.parseInt(""+inputMove[2].charAt(0));
		destY = Integer.parseInt(""+inputMove[2].charAt(1));
		color = piece.charAt(0);
		pieceType = piece.charAt(1);
		
	}
	//alternate movement, check mate, winning logic, castling, pawn to queen conversion
	//camel movement
	
	@Override
	public void move(String inputMove[]) {
		initializeValues(inputMove);
		Piece pieceObj = PieceFactory.getPiece(piece);
		boolean check1=pieceObj.validateFirst(srcX, srcY, destX, destY, piece);
		boolean check2=pieceObj.validateForPiece(srcX, srcY, destX, destY);
		if(!check1 || !check2)
			System.out.println("Invalid move");
		if(check1 && check2)
			pieceObj.move(srcX, srcY, destX, destY, piece);
	}
}
