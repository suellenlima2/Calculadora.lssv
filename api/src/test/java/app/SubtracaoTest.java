package app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubtracaoTest {
    
    Subtracao subtracao;

    @Test
    public void verificaCasoBase() {
        double resultado = subtracao.calcula("4", "2");
        assertEquals(2.0, resultado);
    }
    
    @Test
    public void verficaCasoNumeroNegativo() {
        double resultado = subtracao.calcula("-4", "-2");
        assertEquals(-2.0, resultado);

    }
}