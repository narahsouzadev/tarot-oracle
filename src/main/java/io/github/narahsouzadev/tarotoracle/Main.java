package io.github.narahsouzadev.tarotoracle;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        CardSelector.run(scanner);
        scanner.close();
    }
}