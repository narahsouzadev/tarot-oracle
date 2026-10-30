package io.github.narahsouzadev.tarotoracle;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, welcome to the tarot oracle! \uD83D\uDD2E");
        CardSelector.run(scanner);
        scanner.close();
    }
}