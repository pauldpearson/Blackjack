package blackjack;

import java.util.ArrayList;

public class Hand {

	private int handValue;
	private ArrayList<Card> hand;
	// private int aceCounter;
	// private Iterator<Card> iterator;


	public Hand(Deck deck) {
		hand = new ArrayList<Card>();
		for (int i = 0; i < 2; i++) {
			hand.add(deck.dealCard());
		}
		for (Card card : hand) {
			handValue += card.getValue();
		}
		//TODO getValue doesn't work yet in Card class
	}

	public void addCard(Card card) {
		this.hand.add(card);
	}

	public int getHandValue() {
		return handValue;
	}

	public int handSize() {
		return hand.size();
	}

	public boolean isBlackjack() {
		if (handValue == 21) {
			System.out.println("Blackjack!");
			return true;
		}
		return false;
	}

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
