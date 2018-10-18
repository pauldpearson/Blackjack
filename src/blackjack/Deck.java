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

//	public static Deck createDeck() {
//		Deck deck = new Deck();
//		return deck;
//	}

	public void shuffle() {
		Collections.shuffle(deck);
	}

	public Card dealCard() {
		Card card = deck.remove(0);
		return card;
	}

	public boolean isDeckEmpty() {
		return deck.isEmpty();
	}

	public void deckSize() {
		System.out.println("Deck size: " + deck.size());
	}

	// TODO find a better way to print Deck
	public String toString() {
		return deck + "";
	}

}