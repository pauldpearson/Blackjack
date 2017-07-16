package blackjack;

import java.util.*;

public class Hand {

	private int handValue;
	private ArrayList<Card> hand;

	public Hand() {
		Deck deck = new Deck();
		deck.shuffle();
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

	public ArrayList<Card> getCard(Deck deck) {
		hand = new ArrayList<Card>();
		hand.add(deck.dealCard());
		for (Card card : hand) {
			handValue += card.getValue();
		}
		return hand;
	}

	public String toString() {
		return hand + " \nHand value: " + handValue;
	}

}
