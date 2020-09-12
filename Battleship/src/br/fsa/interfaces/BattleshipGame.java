package br.fsa.interfaces;

public interface BattleshipGame {
	public void startBoard();
	public void validateShip(int xo, int yo, int xf, int yf, int shipType);
}
