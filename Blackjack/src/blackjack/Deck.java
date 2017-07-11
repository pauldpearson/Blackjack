package blackjack;

import java.util.*;

public class Deck {
	/*
	 * A Deck Collection of our Card class
	 */
	private ArrayList<Card> deck;
	// private Iterator<Card> iterator;

	/*
	 * Constructor to create the deck of cards Generate the cards using enhanced
	 * for loops .values refers to the values of Enum deck.add adds new Card to
	 * the deck using ArrayList method
	 */
	public Deck() {
		deck = new ArrayList<Card>();
		for (Suit s : Suit.values()) {
			for (Rank r : Rank.values()) {
				deck.add(new Card(r, s));
			}
		}
	}

	/*
	 * getDeck method to return our deck
	 */
	public ArrayList<Card> getDeck() {
		return deck;
	}

	/*
	 * Shuffle method using Collections class method
	 */
	public void shuffle() {
		Collections.shuffle(deck);
	}

	/*
	 * Deals the card from the deck then removes that card from the deck
	 */
	public Card dealCard() {
		deck.get(0);
		return deck.remove(0);
	}

	/*
	 * Gives us the Deck size to test the dealCard() method
	 */
	public void deckSize() {
		System.out.println("Deck size: " + deck.size());

	}

	public String toString() {
		return String.format("%s \n", deck);
	}

}