package test.java;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import main.java.Celda;

public class CeldaTestsBasicos {

	@Test
	public void CeldaInicializacionCorrecta() {
		Celda celda_test = new Celda(1,1);
		
		assertEquals(1, celda_test.getX(), "La celda tiene que tener el x con el que lo inicialize");
		assertEquals(1, celda_test.getY(), "La celda tiene que tener el x con el que lo inicialize");
	}
	
	@Test
	public void CeldaDistanciaCorrecta() {
		Celda celda_1 = new Celda(1,1);
		Celda celda_2 = new Celda(3,2);
		
		assertEquals(2, celda_1.distancia(celda_2), "La celda tiene que tener la distancia tal que sea la maxima diferencia entre los x y los y");
	}
	
	@Test
	public void CeldaDistanciaCorrecta0() {
		Celda celda_1 = new Celda(1,1);
		Celda celda_2 = new Celda(1,1);
		
		assertEquals(0, celda_1.distancia(celda_2), "La celda tiene que tener la distancia tal que sea la maxima diferencia entre los x y los y");
	}
}
