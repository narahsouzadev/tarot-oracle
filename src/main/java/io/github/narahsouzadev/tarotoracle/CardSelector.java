package io.github.narahsouzadev.tarotoracle;
import java.util.Scanner;
import java.util.Random;

public class CardSelector {
    public static void run(Scanner scanner) {
        Random random = new Random();

        System.out.println("Focus on a question...");
        System.out.println("When you are ready, press 'Enter' to choose a card.");

        boolean running = true;

        while (running) {
            String input = scanner.nextLine();

            if (input.isEmpty()) {
                int cardNumber = random.nextInt(22);
                String card = DeckRepository.CARDS[cardNumber];

                System.out.println("The number of the chosen card is " + card + " \uD83C\uDCCF");
                System.out.println("Press 'Enter' to choose another card or '0' to quit.");
            } else if (input.equals("0")) {
                running = false;
            } else {
                System.out.println("Invalid command, try again.");
            }
        }
    }
}
