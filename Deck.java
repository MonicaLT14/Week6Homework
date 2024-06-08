package Week6Homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> cards;//List of Card

    // Constructor
    public Deck() {
        cards = new ArrayList<Card>();
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] names = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        for (String suit : suits) {
            for (int i = 2; i <= 14; i++) {
                cards.add(new Card(i, names[i - 2] + " of " + suit));
            }
        }
    }

    // Method to shuffle the cards
    public void shuffle() {
        Collections.shuffle(cards);
    }

    // Method to draw a card
    public Card draw() {
        return cards.remove(0);
    }
}

