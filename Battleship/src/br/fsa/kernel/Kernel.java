package br.fsa.kernel;

public class Kernel {
	
	// atributos
	public static final int SIZE = 10;
	
	public static final int CARRIER = 5;
	public static final int BATTLESHIP = 4;
	public static final int CRUISER = 3;
	public static final int SUBMARINE = 2;
	public static final int DESTROYER = 1;
	
	int[][] board;
	
	// construtores
	public Kernel() {
		board = new int[SIZE][SIZE];
		startBoard();
	}
	
	public void startBoard() {
		for (int j = 0; j < SIZE; j++) {
			for (int i = 0; i < SIZE; i++) {
				board[i][j] = 0;
			}
		}
	}
	
	public boolean putShip(int xo, int yo, int xf, int yf, int shipType) {
		for (int y = yo; y <= yf; y++) {
			for (int x = xo; x <= xf; x++) {
				if (board[x][y] != 0) {
					return false;
				}
			}
		}
		
		switch (shipType) {
		case CARRIER:
			for (int y = yo; y <= yf; y++) {
				for (int x = xo; x <= xf; x++) {
					board[x][y] = CARRIER;
				}
			}
			return true;
			
		case BATTLESHIP:
			for (int y = yo; y <= yf; y++) {
				for (int x = xo; x <= xf; x++) {
					board[x][y] = BATTLESHIP;
				}
			}
			return true;
		
		case CRUISER:
			for (int y = yo; y <= yf; y++) {
				for (int x = xo; x <= xf; x++) {
					board[x][y] = CRUISER;
				}
			}
			return true;
			
		case SUBMARINE:
			for (int y = yo; y <= yf; y++) {
				for (int x = xo; x <= xf; x++) {
					board[x][y] = SUBMARINE;
				}
			}
			return true;
			
		case DESTROYER:
			for (int y = yo; y <= yf; y++) {
				for (int x = xo; x <= xf; x++) {
					board[x][y] = DESTROYER;
				}
			}
			return true;
			
		default:
			return false;
		}
	}
	
	public boolean shoot(String position) {
		return true; //fogo
//		return false; //agua
	}
}
