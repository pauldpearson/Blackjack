package blackjack;

import java.util.*;

public class Hand {

	/**
	 * Collection of Cards that make up the Hand
	 */
	private List<Card> hand;

	/**
	 * Hand Value data member
	 */
	private int handValue;

	/**
	 * Hand constructor
	 * 
	 * @param hand
	 */
	public Hand(List<Card> hand) {
		this.hand = hand;
	}

	/**
	 * Creates a new empty Hand
	 */
	public Hand newHand() {
		return new Hand(new ArrayList<Card>());
	}

	/**
	 * Adds a Card to the Hand
	 */
	public void addCard(Card card) {
		hand.add(card);
	}

	/**
	 * Gives us the Top Card; will be used in Dealer class
	 */
	// NOT WORKING YET
	public Card viewTopCard() {
		hand.remove(0);
		return hand.get(0);
	}

	/**
	 * Gives us the Hands value by adding the Cards values
	 */
	public int getHandValue() {
		for (Card card : hand) {
			handValue += card.getValue();
		}
		return handValue;
	}

	/**
	 * Determines if the Hand is Blackjack
	 * 
	 * @return
	 */
	public boolean isBlackjack() {
		if (getHandValue() == 21) {
			System.out.println("Blackjack!");
			return true;
		}
		return false;
	}

	/**
	 * Determines if the Hand is Busted
	 * 
	 * @return
	 */
	public boolean isBusted() {
		if (getHandValue() > 21) {
			System.out.println("Busted");
			return true;
		}
		return false;
	}

	public String toString() {
		return "" + hand;
	}

	/*
	 * TEST
	 */
	public static void main(String[] args) {
		List<Card> cards = new ArrayList<Card>();
		Hand hand = new Hand(cards);
		System.out.println("Empty hand: " + hand);
	}
}
