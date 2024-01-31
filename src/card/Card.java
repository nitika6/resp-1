package card;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Nitika Nitika
 * Student Number: 991715699
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        // Fill the magic hand with random cards
        for (int i = 0; i < magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(generateRandomValue());
            c.setSuit(Card.SUITS[generateRandomSuitIndex()]);
            magicHand[i] = c;
        }
        
        // Hardcode a luck card
        Card luckCard = new Card();
        luckCard.setValue(2);
        luckCard.setSuit("Clubs");
        magicHand[6] = luckCard; // Hardcoded at the last index
        
        // Prompt the user to input a card
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your card value (1-13): ");
        int userValue = scanner.nextInt();
        System.out.print("Enter your card suit (Hearts, Diamonds, Spades, Clubs): ");
        String userSuit = scanner.next();
        
        // Create the user's card
        Card userCard = new Card();
        userCard.setValue(userValue);
        userCard.setSuit(userSuit);
        
        // Search for the user's card in the magic hand
        boolean found = false;
        for (Card card : magicHand) {
            if (card.getValue() == userCard.getValue() && card.getSuit().equalsIgnoreCase(userCard.getSuit())) {
                found = true;
                break;
            }
        }
        
        // Report the result
        if (found) {
            System.out.println("Congratulations! Your card is in the magic hand.");
        } else {
            System.out.println("Sorry, your card is not in the magic hand.");
        }
        
        scanner.close();
    }

    // Helper method to generate a random card value (1-13)
    private static int generateRandomValue() {
        return (int) (Math.random() * 13) + 1;
    }

    // Helper method to generate a random suit index (0-3)
    private static int generateRandomSuitIndex() {
        return (int) (Math.random() * 4);
    }
}
