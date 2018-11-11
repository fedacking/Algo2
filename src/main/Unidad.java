package main;

public abstract class Unidad {
	private Celda posicion;
	
	public Unidad(Celda celda) {
		setPosicion(celda);
	}

	public Celda getPosicion() {
		return posicion;
	}

	private void setPosicion(Celda posicion) {
		this.posicion = posicion;
	}

}
