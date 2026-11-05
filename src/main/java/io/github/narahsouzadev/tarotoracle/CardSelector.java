package io.github.narahsouzadev.tarotoracle;
import java.util.Scanner;
import java.util.Random;

public class CardSelector {
    public static void run(Scanner scanner) {
        Random random = new Random();

        String[] cardsList = {
                "0 - THE FOOL",
                "I - THE MAGICIAN",
                "II - THE HIGH PRIESTESS",
                "III - THE EMPRESS",
                "IV - THE EMPEROR",
                "V - THE HIEROPHANT",
                "VI - THE LOVERS",
                "VII - THE CHARIOT",
                "VIII - STRENGTH",
                "IX - THE HERMIT",
                "X - WHEEL OF FORTUNE",
                "XI - JUSTICE",
                "XII - THE HANGED MAN",
                "XIII - DEATH",
                "XIV - TEMPERANCE",
                "XV - THE DEVIL",
                "XVI - THE TOWER",
                "XVII - THE STAR",
                "XVIII - THE MOON",
                "XIX - THE SUN",
                "XX - JUDGEMENT",
                "XXI - THE WORLD"
        };

        System.out.println("Focus on a question...");
        System.out.println("When you are ready, press 'Enter' to choose a card.");

        boolean running = true;

        while (running) {
            String input = scanner.nextLine();

            if (input.isEmpty()) {
                int cardNumber = random.nextInt(22);

                System.out.println("The number of the chosen card is " + cardsList[cardNumber] + " \uD83C\uDCCF");
                System.out.println("Press 'Enter' to choose another card or '0' to quit.");
            } else if (input.equals("0")) {
                running = false;
            } else {
                System.out.println("Invalid command, try again.");
            }
        }
    }
}
