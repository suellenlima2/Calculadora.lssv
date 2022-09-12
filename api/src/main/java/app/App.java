package app;

import io.jooby.Jooby;

public class App extends Jooby {

  {
    mvc(new Index());
    mvc(new Adicao());
    mvc(new Subtracao());
    mvc(new Multiplicacao);
    mvc(new Divisao());
  }

  public static void main(final String[] args) {
    runApp(args, App::new);
  }

}
