package blackjack;

import java.util.*;

public class Hand {

	private List<Card> hand;
	private int handValue;

	/*
	 * Hand constructor
	 */
	public Hand(List<Card> hand) {
		this.hand = hand;
	}

	/*
	 * Creates a new empty Hand
	 */
	public Hand newHand() {
		return new Hand(new ArrayList<Card>());
	}

	/*
	 * Adds a Card to the Hand
	 */
	public void addCard(Card card) {
		hand.add(card);
	}

	/*
	 * Gives us the Top Card
	 * Will be used in Dealer class
	 */
	public Card viewTopCard() {
		return hand.get(0);
	}

	/*
	 * Gives us the Hands value 
	 * by adding the Cards values
	 */
	public int getHandValue() {
		for (Card card : hand) {
			handValue += card.getValue();
		}
		return handValue;
	}
	
	public boolean isBlackjack() {
		if (handValue == 21) {
			System.out.println("Blackjack!");
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
		hand.newHand();
		hand.getHandValue();
		System.out.println(hand);
	}
}
