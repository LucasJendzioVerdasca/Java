package model;

public class Card {
    public enum Suit {
        TRUMP, HEART, DIAMOND, CLUB, SPADE
    }

    private Suit suit;
    private int value; // 1–21 for trumps, 1–14 for suits, 0 for Excuse

    public Card(Suit suit, int value) {
        this.suit = suit;
        this.value = value;
    }

    public Suit getSuit() {
        return suit;
    }

    public int getValue() {
        return value;
    }

    public boolean isExcuse() {
        return suit == Suit.TRUMP && value == 0;
    }

    @Override
    public String toString() {
        if (isExcuse()) return "Excuse";
        if (suit == Suit.TRUMP) return "Trump " + value;
        return suit + " " + value;
    }
}
