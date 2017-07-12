package blackjack;

import java.util.*;

public class Hand {

	private int handValue;
	private ArrayList<Card> hand;

	public Hand(Deck deck) {
		hand = new ArrayList<Card>();
		for (int i = 0; i < 2; i++) {
			hand.add(deck.dealCard());
		}
		for (Card card : hand) {
			handValue += card.getValue();
		}
	}

	public int getHandValue() {
		return handValue;
	}

	public boolean isBlackjack() {
		if (handValue == 21) {
			System.out.println("Blackjack!!!");
			return true;
		}
		return false;
	}

	public boolean isBusted() {
		if (handValue > 21) {
			System.out.println("Busted");
			return true;
		}
		return false;
	}

	public String toString() {
		return hand + " \nHand value: " + handValue;
	}

}
