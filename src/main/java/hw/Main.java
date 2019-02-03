package hw;

import java.util.Arrays;

public class Main {

  public static void main(final String[] args) {
    System.out.println("args = " + Arrays.asList(args));
    final HelloWorld helloWorld = new HelloWorld();
    System.out.println(helloWorld.getMessage());
    System.out.println(helloWorld.getYear());
    System.out.println("bye for now");
  }
}
