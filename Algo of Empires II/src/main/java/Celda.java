package main.java;

import java.lang.Math;

public class Celda {
	private int X;
	private int Y;
	
	public Celda(int x, int y) {
		setX(x);
		setY(y);
	}

	public int getX() {
		return X;
	}

	public void setX(int x) {
		X = x;
	}

	public int getY() {
		return Y;
	}

	public void setY(int y) {
		Y = y;
	}

	public int distancia(Celda celda_2) {
		return Math.max(Math.abs(X - celda_2.getX()),Math.abs(Y - celda_2.getY()));
	}
	
	public int distancia(int X_1, int Y_1) {
		return Math.max(Math.abs(X - X_1),Math.abs(Y - Y_1));
	}

}
