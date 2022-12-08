package application;

import java.util.Scanner;

import boardgame.Board;
import boardgame.Position;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Program {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		ChessMatch  chessMatch = new ChessMatch();
		
		while(true) {
		UI.printBoard(chessMatch.getPieces());
		System.out.println();
		System.out.println("Source");
		ChessPosition source = UI.readChessPosition(scan);
		
		System.out.println();
		System.out.println("Target");
		ChessPosition target = UI.readChessPosition(scan);
		
		ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
		
		}
	}
}