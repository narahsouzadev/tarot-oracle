package io.github.narahsouzadev.tarotoracle;
import java.util.Scanner;
import java.util.Random;

public class CardSelector {
    public static void run(Scanner scanner) {
        Random random = new Random();

        System.out.println("Hello, welcome to the tarot oracle! \uD83D\uDD2E");
        System.out.println("Focus on a question...");
        System.out.println("When you are ready, press 'Enter' to choose a card.");

        String input = scanner.nextLine();

        if (input.isEmpty()) {
            int card = random.nextInt(22);
            int cardResult = card + 1;

            System.out.println("The number of the chosen card is " + cardResult + " \uD83C\uDCCF");
        } else {
            System.out.println("Invalid option! ⚠");
        }
    }
}
