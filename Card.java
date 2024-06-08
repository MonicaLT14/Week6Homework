package Week6Homework;

public class Card {
    private int value; // contains a value from 2-14 representing cards 2-Ace
    private String name; // e.g. Ace of Diamonds, or Two of Hearts

    // Constructor
    public Card(int value, String name) {
        this.value = value;
        this.name = name;
    }

    // Getters and Setters for value
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    
    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Method to print out information about a card
    public void describe() {
        System.out.println("Card Information: ");
        System.out.println("Name: " + this.name);
        System.out.println("Value: " + this.value);

    }
}