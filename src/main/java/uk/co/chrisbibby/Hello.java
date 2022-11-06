package uk.co.chrisbibby;

import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(name = "hello", description = "Say hello")
public class Hello implements Runnable {

  @Option(names = {"-n",
      "--name"}, description = "Personalise hello with a name", defaultValue = "Unknown")
  private String name;

  @Override
  public void run() {
    System.out.printf("Hello %s %n", name);
  }
}
