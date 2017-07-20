package blackjack;

import java.util.*;

public class Deck {
	/*
	 * A Deck Collection of our Card class
	 */
	private List<Card> deck;

	/*
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
	
	public static Deck createDeck() {
		Deck deck = new Deck();
		return deck;
	}

	/*
	 * Shuffle method
	 */
	public void shuffle() {
		Collections.shuffle(deck);
	}

	/*
	 * Deals the card from the deck then removes that card from the deck
	 */
	public Card dealCard() {
		// System.out.println(deck.get(0));
		return deck.remove(0);
	}
	
	/*
	 * Tells us when the Deck is empty
	 */
	public boolean isDeckEmpty() {
		return deck.isEmpty();
	}

	/*
	 * Gives us the Deck size to test the dealCard() method
	 */
	public void deckSize() {
		System.out.println("Deck size: " + deck.size());
	}

	public String toString() {
		return deck + "";
	}

	/*
	 * TEST
	 */
	public static void main(String[] args) {
		Deck deck = new Deck();
		System.out.println("Fresh deck \n" + deck + "\n");
		deck.shuffle();
		System.out.println("Shuffled deck \n" + deck + "\n");
		deck.dealCard();
		System.out.println("Deck after a deal\n" + deck);
		deck.deckSize();

	}
}