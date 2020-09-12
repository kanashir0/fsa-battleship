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
		printIntro();
		printBoard(msg);
	}
	
	@Override
	public void validateShip(int xo, int yo, int xf, int yf, int shipType) {
		// TODO Auto-generated method stub
		if(game.validateShip(xo, yo, xf, yf, shipType)) {
			msg = "The ship has been positioned!";
			printBoard(msg);
		} else {
			msg = "Wrong position, try again with a different position!";
			printBoard(msg);
		}
		
	}

	public void printIntro() {
		System.out.println("    JAMAICAN BATTLESHIP GAME\n" + 
						   "-----------------------------------\n" +
						   "You have 5 ships to place in the board, the ships are described below:\n" +
						   "");
	}
	
	public void printBoard(String msg) {
		
	}

	
}
