package br.fsa.kernel;

public class Kernel {
	
	// atributos
	public static final int size = 10;
	int[][] board;
	
	// construtores
	public Kernel() {
		board = new int[size][size];
	}
	
	// metodos
	
	public boolean shoot(String position) {
		return true; //fogo
//		return false; //agua
	}
}
