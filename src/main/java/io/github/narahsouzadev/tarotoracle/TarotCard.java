package io.github.narahsouzadev.tarotoracle;

public class TarotCard {
    private int number;
    private String name;
    private String keywords;
    private String message;

    public TarotCard(int number, String name, String keywords, String message) {
        this.number = number;
        this.name = name;
        this.keywords = keywords;
        this.message = message;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getKeywords() {
        return keywords;
    }

    public String getMessage() {
        return message;
    }
}
