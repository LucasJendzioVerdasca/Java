package model;

import java.util.*;

public class Player {
    public String name;
    public List<Card> hand;

    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Card> getHand() {
        return hand;
    }

    public void addCardToHand(Card card) {
        hand.add(card);
    }

    public void setHand(List<Card> cards) {
        hand.clear();
        hand.addAll(cards);
    }

    public Card playCard(int index) {
        if (index >= 0 && index < hand.size()) {
            return hand.remove(index);
        }
        return null;
    }

    @Override
    public String toString() {
        return name;
    }
}
