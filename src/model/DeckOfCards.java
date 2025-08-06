package model;

import java.util.*;

public class DeckOfCards {
    public List<Card> cards;

    public DeckOfCards() {
        cards = new ArrayList<>();
        generateDeck();
        shuffle();
    }

    public void generateDeck() {
        // generation of the 21 Trumps + Excuse
        for (int i = 1; i <= 21; i++) {
            cards.add(new Card(Card.Suit.TRUMP, i));
        }
        cards.add(new Card(Card.Suit.TRUMP, 0)); // Excuse

        // 4 Suits (1 to 14) — 14 cards each
        for (Card.Suit suit : List.of(Card.Suit.HEART, Card.Suit.DIAMOND, Card.Suit.CLUB, Card.Suit.SPADE)) {
            for (int i = 1; i <= 10; i++) {
                cards.add(new Card(suit, i));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card draw() {
        return cards.remove(0);
    }

    public List<Card> draw(int count) {
        List<Card> drawn = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            drawn.add(draw());
        }
        return drawn;
    }

    public int size() {
        return cards.size();
    }
}
