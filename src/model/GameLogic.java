package model;

import java.util.*;

public class GameLogic {
    public DeckOfCards deck;
    public List<Player> players;
    public int currentPlayerIndex;

    public GameLogic(List<String> playerNames) {
        deck = new DeckOfCards();
        players = new ArrayList<>();
        for (String name : playerNames) {
            players.add(new Player(name));
        }
        dealCards();
        currentPlayerIndex = 0;
    }

    public void dealCards() {
        int cardsPerPlayer = 18; // For 4 players in French tarot
        for (Player player : players) {
            player.setHand(deck.draw(cardsPerPlayer));
        }
        // Le chien contient les 6 cartes restantes
    }

    public Player getCurrentPlayer() {
        return players.get(currentPlayerIndex);
    }

    public void nextPlayer() {
        currentPlayerIndex = (currentPlayerIndex + 1) % players.size();
    }

    public List<Player> getPlayers() {
        return players;
    }
}