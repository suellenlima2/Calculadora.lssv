package app;

import io.jooby.annotations.*;
import io.jooby.exception.BadRequestException;

@Path("/adicao/{op1}/{op2}")
public class Adicao {
    
    @GET
    public double calcula(@PathParam("op1") String op1Str, @PathParam("op2") String op2Str) {
        try {
            double op1 = Double.parseDouble(op1Str);
            double op2 = Double.parseDouble(op2Str);
            return(op1 + op2);

        } catch (NumberFormatException nfe) {
            throw new BadRequestException("Operador não é válido");
        }
    }
}