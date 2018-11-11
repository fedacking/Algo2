package main;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import main.Celda;


public class CeldaBasicTest {
	
    @Test
    public void inicializarCeldaEn11yTestear() {
    	Celda celdaTest = new Celda(1,1);

    	assertEquals(1,celdaTest.getX(), "Getter y Setter test de X");
    	assertEquals(1,celdaTest.getY(), "Getter y Setter test de Y");
    }
    
    public void celdaAgregarObjetoPosicionable() {
    	Celda celdaTest = new Celda(1,1);
    	Unidad unidadTest = new Espadachin(celdaTest);

    	assertEquals(1,celdaTest.getX(), "Getter y Setter test de X");
    	assertEquals(1,celdaTest.getY(), "Getter y Setter test de Y");
    }
}
