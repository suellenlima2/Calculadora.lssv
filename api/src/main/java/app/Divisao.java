package app;

import io.jooby.annotations.*;
import io.jooby.exception.BadRequestException;

@Path("/divisao/{op1}/{op2}")

//DIVISION
public class Divisao {
    
    @GET
    public double calculate(@PathParam("op1") String op1Str, @PathParam("op2") String op2Str) {
        try {
            double op1 = Double.parseDouble(op1Str);
            double op2 = Double.parseDouble(op2Str);
            double result = 0;
            if (op2 == 0) {
                throw new BadRequestException("A calculadora só realizará divisões por 0.");    
            } else{
                 result = op1 / op2 ; 
            }
            return result;
        } catch (NumberFormatException nfe) {
            throw new BadRequestException("operator is not valid");
        }
    }
}

