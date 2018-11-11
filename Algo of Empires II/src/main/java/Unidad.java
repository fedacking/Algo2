package main.java;

public abstract class Unidad {
	private Celda posicion;

	public Unidad(Celda celda_test) {
		posicion = celda_test;
	}

	public int getX() {
		return posicion.getX();
	}
	public int getY() {
		return posicion.getX();
	}


}
