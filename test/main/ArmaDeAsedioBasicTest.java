package main;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import main.Celda;


public class ArmaDeAsedioBasicTest{
	
    @Test
    public void inicializarArqueroEn11yTestear() {
    	Celda celdaArmaDeAsedio = new Celda(1,1);
    	ArmaDeAsedio armaDeAsedioTest= new ArmaDeAsedio(celdaArmaDeAsedio);

    	assertEquals(1,armaDeAsedioTest.getX(), "Getter y Setter test de X");
    	assertEquals(1,armaDeAsedioTest.getY(), "Getter y Setter test de Y");
    }
}

