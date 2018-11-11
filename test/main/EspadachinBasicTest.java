package main;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import main.Celda;


public class EspadachinBasicTest {
	
    @Test
    public void inicializarEspadachinEn11yTestear() {
    	Celda celdaEspadachin = new Celda(1,1);
    	Espadachin espadachinTest= new Espadachin(celdaEspadachin);

    	assertEquals(1,espadachinTest.getX(), "Getter y Setter test de X");
    	assertEquals(1,espadachinTest.getY(), "Getter y Setter test de Y");
    }
}

