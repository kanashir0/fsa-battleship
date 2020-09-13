package br.fsa.gui;
import java.util.Scanner;

import br.fsa.cli.BattleshipCLI;

public class Main {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BattleshipCLI game = new BattleshipCLI();
		
		try (Scanner scan = new Scanner(System.in)) {
			game.printIntro();
			System.out.print("Available game modes:\n\n" +
							 "[1] - Single Player (In progress)\n" +
							 "[2] - Multiplayer (Not implemented)\n" +
							 "[3] - Single Player vs Bot (Not implemented)\n\n" +
							 "Choose an option: ");
			if (scan.nextInt() == 1) {
				String cmd;
				char[] pos;
				boolean hasShip = true;
				int count = 0;
				
				game.startBoard();
				
				while(hasShip) {
					int xo = 11;
					int xf = 11;
					
					System.out.println("Choose a ship to place on the board!");
					System.out.print("Ship ID: ");
					int shipType = scan.nextInt();
					
					System.out.print("First coordinate (Example: A3): ");
					cmd = scan.next();
					pos = cmd.toCharArray();
					
					switch(Character.toLowerCase(pos[0])) {
						case 'a':
							xo = 0;						
						case 'b':
							xo = 1;
						case 'c':
							xo = 2;
						case 'd':
							xo = 3;
						case 'e':
							xo = 4;
						case 'f':
							xo = 5;
						case 'g':
							xo = 6;
						case 'h':
							xo = 7;
						case 'i':
							xo = 8;
						case 'j':
							xo = 9;
					}
					
					int yo = Integer.parseInt(String.valueOf(pos[1]));
					
					System.out.print("Second coordinate (Example: A3): ");
					cmd = scan.next();
					pos = cmd.toCharArray();
					switch(Character.toLowerCase(pos[0])) {
					case 'a':
						xf = 0;						
					case 'b':
						xf = 1;
					case 'c':
						xf = 2;
					case 'd':
						xf = 3;
					case 'e':
						xf = 4;
					case 'f':
						xf = 5;
					case 'g':
						xf = 6;
					case 'h':
						xf = 7;
					case 'i':
						xf = 8;
					case 'j':
						xf = 9;
				}

					int yf = Integer.parseInt(String.valueOf(pos[1]));
					
					if(game.validateShip(xo, yo, xf, yf, shipType)) {
						count++;
					}
					
					if (count == 5) {
						hasShip = false;
					}

				}
			}
		}
		
	}

}
