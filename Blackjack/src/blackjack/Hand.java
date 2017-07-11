package blackjack;

import java.util.*;

public class Hand {

	private int handValue;
	private ArrayList<Card> hand;
	// private int aceCounter;

	public Hand(Deck deck) {
		hand = new ArrayList<Card>();
		for (int i = 0; i < 2; i++) {
			hand.add(deck.dealCard());
		}
		for (Card card : hand) {
			handValue += card.getValue();
		}
	}

	// not sure if this method is needed, wouldn't hitCard() replace this or
	// accomplish the same thing
	// public void addCard(Card card) {
	// this.hand.add(card);
	// }

	public int getHandValue() {
		return handValue;
	}

	// public int handSize() {
	// return hand.size();
	// }

	public boolean isBlackjack() {
		if (handValue == 21) {
			System.out.println("Blackjack!");
			return true;
		}
		return false;
	}

	// not sure if I want this as a boolean or not...
	public boolean isBusted() {
		if (handValue > 21) {
			return true;
		}
		return false;
	}

	public String toString() {
		return "Hand shows: " + hand + " " + handValue;
	}

}
