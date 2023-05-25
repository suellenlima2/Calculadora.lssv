package app;

import io.jooby.annotations.*;
import io.jooby.exception.BadRequestException;
@Path("/multiplicacao/{op1}/{op2}")

//Multiplication
public class Multiplicacao {
        @GET
        public double calculate(@PathParam("op1") String op1Str, @PathParam("op2") String op2Str) {
            try {
                double op1 = Double.parseDouble(op1Str);
                double op2 = Double.parseDouble(op2Str);
                double result = op1*op2;

                return result;
            } catch (NumberFormatException nfe) {
                throw new BadRequestException("operator is not valid!");
            }
        }
    }


