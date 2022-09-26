package app;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class DivisaoTest {
    
    Divisao divisao = new Divisao();

    @Test 
    public void verificandoCasoPositivo(){
        double resultado = divisao.calcula("8", "2");
        assertEquals(4.0, resultado);
    }

    @Test
    public void vericandoCasoNegativo(){
        double resultado = divisao.calcula("10", "-5");
        assertEquals(-2.0, resultado);
    }

}
