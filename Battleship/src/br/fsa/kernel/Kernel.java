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
	
	private boolean putShip(int xo, int yo, int xf, int yf, int shipType) {
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
	
	public boolean validateShip(int xo, int yo, int xf, int yf, int shipType) {
		int minX = 0;
		int minY = 0;
		int maxX = 0;
		int maxY = 0;
		
		// Se as posições estão dentro do tabuleiro
		if (xo < 0 || xo > SIZE || yo < 0 || yo > SIZE || xf < 0 || xf > SIZE || yf < 0 || yf > SIZE) {
			return false;
		}
		
		// Se está em linha (não pode diagonal)
		if ((xo == xf && yo == yf) || (xo != xf && yo != yf)) {
			return false;
		}
			
		// Se a distância é igual ao tamanho do navio
		if (xo == xf) {
			minX = xo;
			maxX = xf;
			if (yo < yf) {
				minY = yo;
				maxY = yf;
			} else {
				minY = yf;
				maxY = yo;
			}
			if (maxY - minY != shipType) {
				return false;
			} else {
				return putShip(minX, minY, maxX, maxY, shipType);
			}
			
		} else {
			minY = yo;
			maxY = yf;
			if (xo < xf) {
				minX = xo;
				maxX = xf;
			} else {
				minX = xf;
				maxX = xo;
			}
			if (maxX - minX != shipType) {
				return false;
			} else {
				return putShip(minX, minY, maxX, maxY, shipType);
			}
		}

	}
	
	public boolean shoot(String position) {
		return true; //fogo
//		return false; //agua
	}
}
