package blackjack;

import java.util.*;

public class Hand {


	private List<Card> hand;

	private int handValue;

	public Hand(List<Card> hand) {
		this.hand = hand;
	}

	public Hand newHand() {
		return new Hand(new ArrayList<Card>());
	}

	public void addCard(Card card) {
		hand.add(card);
	}

	// NOT WORKING YET
	public Card viewTopCard() {
		hand.remove(0);
		return hand.get(0);
	}


	public int getHandValue() {
		for (Card card : hand) {
			handValue += card.getValue();
		}
		return handValue;
	}


	public boolean isBlackjack() {
		if (getHandValue() == 21) {
			System.out.println("Blackjack!");
			return true;
		}
		return false;
	}


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
