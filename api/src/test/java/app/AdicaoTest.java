package app;

import org.junit.jupiter.api.Test;

import io.jooby.exception.BadRequestException;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AdicaoTest {
    
    Adicao adicao = new Adicao();

    @Test 
    public void verificandoCasoPositivo(){
        double resultado = adicao.calcula("15.0", "2000.6");
        assertEquals(2015.6, resultado);
    }

    @Test
    public void vericandoCasoNegativo(){
        double resultado = adicao.calcula("10", "-5");
        assertEquals(5.0, resultado);
    }

    @Test
    public void testForLetras() {
        Adicao adicao = new Adicao();
        assertThrows(BadRequestException.class, () -> {
            adicao.calcula("A", "0");
        });
    }
}