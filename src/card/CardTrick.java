/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7]; // Fix the array size
        
        for (int i = 0; i < magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        // add one luckcard hard code 2,clubs
        // ... (existing code)

        // Hardcoded lucky card
        Card luckyCard = new Card();
        luckyCard.setValue(2);  // Set your desired card value
        luckyCard.setSuit("Clubs");  // Set your desired card suit

        // Search for the lucky card in the randomly generated array
        boolean found = false;
        for (Card card : magicHand) {
            if (card.getValue() == luckyCard.getValue() && card.getSuit().equalsIgnoreCase(luckyCard.getSuit())) {
                found = true;
                break;
            }
        }

        // Report the result to the user
        if (found) {
            System.out.println("Congratulations! You found the lucky card.");
        } else {
            System.out.println("Sorry, the lucky card is not in the magic hand.");
        }
    }
}
