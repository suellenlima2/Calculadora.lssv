package app;

import io.jooby.annotations.*;

@Path("/")
public class Index {

  @GET
  public String index() {
    return("Bem vindos a API calculadora!");

  }
}
