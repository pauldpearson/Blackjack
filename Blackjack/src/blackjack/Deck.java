package blackjack;

import java.util.*;

public class Deck {
	/**
	 * A Deck Collection of our Card class
	 */
	private List<Card> deck;

	/**
	 * Constructor to create a deck of cards
	 */
	public Deck() {
		deck = new ArrayList<Card>();
		for (Suit s : Suit.values()) {
			for (Rank r : Rank.values()) {
				deck.add(new Card(r, s));
			}
		}
	}

	/**
	 * Create Deck method
	 * @return deck
	 */
	public static Deck createDeck() {
		Deck deck = new Deck();
		deck.shuffle();
		return deck;
	}

	/**
	 * Shuffle method
	 */
	public void shuffle() {
		Collections.shuffle(deck);
	}

	/**
	 * Deals the card from the deck then removes that card from the deck
	 */
	public Card dealCard() {
		Card card = deck.remove(0);
		return card;
	}

	/**
	 * Tells us when the Deck is empty
	 */
	public boolean isDeckEmpty() {
		return deck.isEmpty();
	}

	/**
	 * Gives us the Deck size to test the dealCard() method
	 */
	public void deckSize() {
		System.out.println("Deck size: " + deck.size());
	}

	// TODO find a better way to print Deck
	public String toString() {
		return deck + "";
	}

	/*
	 * TEST
	 */
	public static void main(String[] args) {
		Deck deck = Deck.createDeck();
		System.out.println(deck);
		deck.deckSize();
	}
}