package app;

import io.jooby.annotations.*;
import io.jooby.exception.BadRequestException;

@Path("/divisao/{op1}/{op2}")

public class Divisao {
    
    @GET
    public double calcula(@PathParam("op1") String op1Str, @PathParam("op2") String op2Str) {
        try {
            double op1 = Double.parseDouble(op1Str);
            double op2 = Double.parseDouble(op2Str);
            double resultado = 0;
            if (op2 == 0) {
                throw new BadRequestException("A calculadora só realizar divisoes por 0.");    
            } else{
                 resultado = op1 / op2 ; 
            }
            return resultado;
        } catch (NumberFormatException nfe) {
            throw new BadRequestException(" O operador é inválido.");
        }
    }
}

