package br.fsa.cli;

import br.fsa.interfaces.BattleshipGame;
import br.fsa.kernel.Kernel;

public class BattleshipCLI implements BattleshipGame{
	
	Kernel game;
	String msg;

	@Override
	public void startBoard() {
		game = new Kernel();
		msg = "Game started!";
		printBoard(msg);
	}
	
	@Override
	public boolean validateShip(int xo, int yo, int xf, int yf, int shipType) {
		// TODO Auto-generated method stub
		if(game.validateShip(xo, yo, xf, yf, shipType)) {
			msg = "The ship has been positioned!";
			printBoard(msg);
			return true;
		} else {
			msg = "Error, check the Ship ID and the coordinations you have inserted!";
			printBoard(msg);
			return false;
		}
		
	}

	public void printIntro() {
		System.out.println("+----------------------------------+\n" +
						   "|      JAMAICAN BATTLESHIP GAME    |\n" + 
						   "+----------------------------------+\n" +
						   "| You have 5 ships to place in the |\n" +
						   "| board, they are described below: |\n" +
						   "+----+-----------------+-----------+\n" +
						   "| ID |   NAME          |  SLOTS    |\n" +
						   "| 5  | Carrier         |  6        |\n" +
						   "| 4  | Battleship      |  5        |\n" +
						   "| 3  | Cruiser         |  4        |\n" +
						   "| 2  | Submarine       |  3        |\n" +
						   "| 1  | Destroyer       |  2        |\n" +
						   "+----+-----------------+-----------+");
	}
	
	public void printBoard(String msg) {
		System.out.println();
		System.out.println("+-------------------------------------------+\n" +
						   "|                GAME BOARD                 |\n" + 
						   "+---+---+---+---+---+---+---+---+---+---+---+\n" +
						   "|   | A | B | C | D | E | F | G | H | I | J |");
		for (int j = 0; j < 10; j++) {
			System.out.print("| " + j + " ");
			for (int i = 0; i < 10; i++) {
				System.out.print("| " + game.getBoardPos(i, j) + " ");
			}
			System.out.println("|");
		}
		System.out.println("+---+---+---+---+---+---+---+---+---+---+---+");
		System.out.println("Message: " + msg);

	}
	
}
