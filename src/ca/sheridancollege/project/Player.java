package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Player {
    private String name;
    private ArrayList<Card> hand;

    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<>();
    }

    public void addCard(Card card) {
        if (card != null) {
            hand.add(card);
        }
    }

    public List<Card> getHand() {
        return hand;
    }

    public String getName() {
        return name;
    }

    public boolean hasCardWithValue(String value) {
        return hand.stream().anyMatch(card -> card.getValue().equalsIgnoreCase(value));
    }

    public List<Card> giveAllCardsWithValue(String value) {
        List<Card> givenCards = new ArrayList<>();
        Iterator<Card> iterator = hand.iterator();
        while (iterator.hasNext()) {
            Card card = iterator.next();
            if (card.getValue().equalsIgnoreCase(value)) {
                givenCards.add(card);
                iterator.remove();
            }
        }
        return givenCards;
    }

    public int checkAndRemovePairs() {
        // This method should check for pairs and remove them from the hand
        return 0; // Placeholder
    }

    public void showHand() {
        System.out.println(name + "'s hand: " + hand);
    }

}
