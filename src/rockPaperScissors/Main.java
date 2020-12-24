package rockPaperScissors;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String option = "Yes";
  while (!option.equalsIgnoreCase("no")){
      System.out.println("You can select out of the three options: \n Rock \n Paper \n Scissors");
      System.out.println("You can write \"No\" to exit the game");
      Scanner scanner = new Scanner(System.in);
      option  = scanner.next();

      switch (option.toLowerCase()) {
          case Utility.ROCK -> new UserChoice(Utility.ROCK).getResult();
          case Utility.PAPER -> new UserChoice(Utility.PAPER).getResult();
          case Utility.SCISSORS -> new UserChoice(Utility.SCISSORS).getResult();
          default -> throw new IllegalStateException("Unexpected value: " + option.toLowerCase());
      }
  }

  System.out.println("You have exited the game");


    }
}
