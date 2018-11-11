package test.java;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import main.java.Celda;
import main.java.Espadachin;
import main.java.Arquero;

public class UnidadTestsBasico {
	@Test
	public void InicializarEspadachinPosicion() {
		Celda celda_test = new Celda(1,1);
		Espadachin espadachin_test = new Espadachin(celda_test);
		
		assertEquals(1, espadachin_test.getX(), "El espadachin tiene que tener la x de su celda");
		assertEquals(1, espadachin_test.getY(), "El espadachin tiene que tener la y de su celda");
	}
	public void InicializarArqueroPosicion() {
		Celda celda_test = new Celda(1,1);
		Arquero arquero_test = new Arquero(celda_test);
		
		assertEquals(1, arquero_test.getX(), "El espadachin tiene que tener la x de su celda");
		assertEquals(1, arquero_test.getY(), "El espadachin tiene que tener la y de su celda");
	}
}
