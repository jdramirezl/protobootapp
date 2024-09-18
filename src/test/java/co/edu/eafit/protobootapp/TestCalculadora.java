package co.edu.eafit.protobootapp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

//Pruebas unitarias del proyecto
public class TestCalculadora {

    //Pruebas unitarias para el cuadrado
    @Test
    public void testCuadradoPositivo() {
        Calculadora calc = new Calculadora();
        assertEquals(25.0, calc.cuadrado(5.0), 0);
    }

    @Test
    public void testCuadradoCero() {
        Calculadora calc = new Calculadora();
        assertEquals(0.0, calc.cuadrado(0.0), 0);
    }

    @Test
    public void testCuadradoUno() {
        Calculadora calc = new Calculadora();
        assertEquals(1.0, calc.cuadrado(1.0), 0);
    }

    @Test
    public void testCuadradoNegativo() {
        Calculadora calc = new Calculadora();
        assertEquals(16.0, calc.cuadrado(-4.0), 0);
    }
    
}
