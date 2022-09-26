package app;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplicacaoTest {

    Multiplicacao multiplicacao = new Multiplicacao();

    @Test
    public void verificandoCasoPositivo(){
       double result = multiplicacao.calcula("4", "2");
       assertEquals(8.0, result);
    }

    @Test
    public void verificandoCasoNegativo(){
        double result = multiplicacao.calcula("4", "-2");
        assertEquals(-8.0, result);
    }
    
}