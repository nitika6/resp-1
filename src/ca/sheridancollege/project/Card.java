package ca.sheridancollege.project;

public class Card {
    private String suit;
    private String value;

    public Card(String suit, String value) {
        this.suit = suit;
        this.value = value;
    }

    public String getSuit() {
        return suit;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value + " of " + suit;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Card card = (Card) obj;
        return value.equals(card.value);
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    // Method to check if two cards are a match for Go Fish
    public boolean isMatch(Card otherCard) {
        return this.equals(otherCard);
    }
}
