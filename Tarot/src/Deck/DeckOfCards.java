package Deck;

import java.util.ArrayList;

public class DeckOfCards {
    public ArrayList<Cards> mainDeck = new ArrayList<>();
    public DeckOfCards() {
        String[] colors = {"Hearts", "Diamonds", "Clubs", "Spades"}; //Définition des couleurs de base
        String[] names = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Knight", "Queen", "King"}; // Définition des valeurs de base
        
        //Création des cartes
        for (String color : colors) {
            for (int i = 0; i < names.length; i++) {

                mainDeck.add(new Cards(names[i], i + 1, color));
            }
        }
    
        //Création des atouts
        String[] trumpvalues = {"1", "2,", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21"};
        for (int i = 0; i < trumpvalues.length; i++) {
            Trump trumpCard = new Trump(trumpvalues[i], i + 1, "Trump", false);
            mainDeck.add(trumpCard);
        }
    }
}