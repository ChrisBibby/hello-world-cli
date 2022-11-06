package uk.co.chrisbibby;

import picocli.CommandLine;
import picocli.CommandLine.Command;

import java.util.concurrent.Callable;

@Command(
    name = "hello-world",
    mixinStandardHelpOptions = true,
    version = "hello-world 0.0.1",
    description = "Personalised greetings",
    subcommands = {
        Hello.class,
        Goodbye.class
    })
public class Main implements Callable<Integer> {
  public static void main(final String[] args) {
    System.exit(new CommandLine(new Main()).execute(args));
  }

  @Override
  public Integer call() {
    CommandLine.usage(this, System.out);
    return 0;
  }
}