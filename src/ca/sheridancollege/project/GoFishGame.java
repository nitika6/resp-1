package ca.sheridancollege.project;

import java.util.*;

public class GoFishGame {
    private GroupOfCards deck;
    private ArrayList<Player> players;
    private Scanner scanner;

    public GoFishGame(int numberOfPlayers) {
        deck = new GroupOfCards(52);
        deck.shuffle();
        players = new ArrayList<>();
        scanner = new Scanner(System.in);

        for (int i = 1; i <= numberOfPlayers; i++) {
            players.add(new Player("Player " + i));
        }

        // Deal initial cards
        for (Player player : players) {
            for (int i = 0; i < 5; i++) {
                player.addCard(deck.drawCard());
            }
        }
    }

    public void play() {
        boolean gameOver = false;
        while (!gameOver) {
            for (Player player : players) {
                System.out.println(player.getName() + "'s turn");
                takeTurn(player);
                if (isGameOver()) {
                    gameOver = true;
                    break;
                }
            }
        }
        declareWinner();
    }

    private void takeTurn(Player currentPlayer) {
        if (currentPlayer.getHand().isEmpty()) {
            Card drawnCard = deck.drawCard();
            if (drawnCard != null) {
                currentPlayer.addCard(drawnCard);
            }
            return;
        }

        System.out.println("Your hand: " + currentPlayer.getHand());
        System.out.println("Enter a card value you want to ask for:");
        String askedValue = scanner.nextLine();

        Player askedPlayer = selectPlayer(currentPlayer);

        // Remaining implementation...
    }

    private Player selectPlayer(Player currentPlayer) {
        System.out.println("Select a player to ask:");
        for (int i = 0; i < players.size(); i++) {
            if (!players.get(i).equals(currentPlayer)) {
                System.out.println((i + 1) + ". " + players.get(i).getName());
            }
        }
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over
        return players.get(choice - 1);
    }

    private boolean isGameOver() {
        // Implementation...
    }

    private void declareWinner() {
        // Implementation...
    }

   
}
