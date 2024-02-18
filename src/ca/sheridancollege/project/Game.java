package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Scanner;

public class GoFish extends Game {

    private Deck deck; 
    private Scanner scanner;

    public GoFish(String name) {
        super(name);
        this.deck = new Deck();
        this.scanner = new Scanner(System.in);
        deck.shuffle();
        dealInitialCards();
    }

    @Override
    public void play() {
        boolean gameOver = false;
        while (!gameOver) {
            for (Player player : getPlayers()) {
                System.out.println(player.getName() + "'s turn.");
                takeTurn(player);
                if (isGameOver()) {
                    gameOver = true;
                    break;
                }
            }
        }
        declareWinner();
    }

    private void takeTurn(Player player) {
        // Implement player turn logic
       
    }

    private void dealInitialCards() {
        // Deal 5 or 7 cards to each player
        for (Player player : getPlayers()) {
            for (int i = 0; i < 5; i++) { // Assuming 5 cards are dealt
                player.addCard(deck.drawCard());
            }
        }
    }

    private boolean isGameOver() {
        // Game over logic, e.g., deck is empty or all players have no cards
        return false; // Placeholder
    }

    @Override
    public void declareWinner() {
        // Logic to declare the winner, e.g., player with the most pairs
    }

    // Additional methods as required...
}
