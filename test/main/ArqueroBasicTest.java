package main;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import main.Celda;


public class ArqueroBasicTest{
	
    @Test
    public void inicializarArqueroEn11yTestear() {
    	Celda celdaArquero = new Celda(1,1);
    	Arquero arqueroTest= new Arquero(celdaArquero);

    	assertEquals(1,arqueroTest.getX(), "Getter y Setter test de X");
    	assertEquals(1,arqueroTest.getY(), "Getter y Setter test de Y");
    }
}

