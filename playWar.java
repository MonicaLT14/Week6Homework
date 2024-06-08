package Week6Homework;

public class playWar {

	public static void main(String[] args) {
		//Instantiate a Deck and two Players
        Deck deck = new Deck();
        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");

        //Shuffle the deck
        deck.shuffle();

        // Draw cards
        for (int i = 0; i < 52; i++) {
            if (i % 2 == 0) {
                player1.draw(deck);
            } else {
                player2.draw(deck);
            }
        }

        // Play WAR by flipping your cards to compare
        for (int i = 0; i < 26; i++) {
            Card card1 = player1.flip();
            Card card2 = player2.flip();

            System.out.println(card1.getName() + " vs " + card2.getName());
            if (card1.getValue() > card2.getValue()) {
                player1.incrementScore();
                System.out.println("Player 1 wins this round.");
            } else if (card1.getValue() < card2.getValue()) {
                player2.incrementScore();
                System.out.println("Player 2 wins this round.");
            } else {
                System.out.println("It's a tie. No points awarded.");
            }

            System.out.println("Score - Player 1: " + player1.getScore() + ", Player 2: " + player2.getScore());
        }

        // Prints final score and winner
        if (player1.getScore() > player2.getScore()) {
            System.out.println("Player 1 wins the game with a score of " + player1.getScore());
        } else if (player1.getScore() < player2.getScore()) {
            System.out.println("Player 2 wins the game with a score of " + player2.getScore());
        } else {
            System.out.println("The game is a draw.");
        }
    }
}
