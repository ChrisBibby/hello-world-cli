package uk.co.chrisbibby;

import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(name = "goodbye", description = "Say goodbye")
public class Goodbye implements Runnable {
  @Option(names = {"-n",
      "--name"}, description = "Personalise goodbye with a name", defaultValue = "Unknown")
  private String name;

  @Override
  public void run() {
    System.out.printf("Goodbye %s %n", name);
  }
}
