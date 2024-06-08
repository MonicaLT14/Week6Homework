package Week6Homework;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private List<Card> hand;//List of Cards
    private int score;//Score
    private String name;//Name

    // Constructor
    public Player(String name) {
        hand = new ArrayList<Card>();
        score = 0;
        this.name = name;
    }

    // Method to describe the player
    public void describe() {
    	System.out.println("Player Name: " + this.name);
        System.out.println("Score: " + this.score);
        System.out.println("Hand: ");
        for (Card card : this.hand) {
            card.describe();
        }
    }

    // Method to flip a card
    public Card flip() {
        return hand.remove(0);
    }

    // Method to draw a card
    public void draw(Deck deck) {
        hand.add(deck.draw());
}
 // Method to increment the score
    public void incrementScore() {
        score++;
    }

    // Getters and Setters
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
