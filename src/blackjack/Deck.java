package blackjack;

import java.util.*;

public class Deck {

    private List<Card> deck;

    public Deck() {
        deck = new ArrayList<Card>();
        for (Suit s : Suit.values()) {
            for (Rank r : Rank.values()) {
                deck.add(new Card(r, s));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(deck);
    }

    public Card dealCard() {
        Card card = deck.remove(0);
        System.out.println("Dealt card: " + card);
        return card;
    }

    public boolean isDeckEmpty() {
        System.out.println("Deck is empty");
        return deck.isEmpty();
    }

    //TODO make this a value so once empty we can get a new deck
    public int deckSize() {
        System.out.println("Deck size: " + deck.size());
        return deck.size();
    }

    public String toString() {
        return "\n" + deck;
    }

    public static void main(String[] args) {
        Deck deck = new Deck();
        System.out.println("\nUnshuffled deck: \n" + deck);
        deck.deckSize();
        deck.shuffle();
        System.out.println("\nShuffled deck: \n" + deck);
        System.out.println("\nDealing a card...\n");

        for (int i = 1; i <= 52; i++) {
            deck.dealCard();
            if (deck.deckSize() == 1) {
                System.out.println("Final card...");
            }
        }
    }
}