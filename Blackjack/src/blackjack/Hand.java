package blackjack;

import java.util.*;

public class Hand {

	private int handValue;
	private ArrayList<Card> hand;

	// TODO need to change this constructor to remove the dealing of 2 cards
	public Hand(Deck deck) {
		hand = new ArrayList<Card>();
//		for (int i = 0; i < 2; i+=1) {
//			hand.add(deck.dealCard());
//		}
//		for (Card card : hand) {
//			handValue += card.getValue();
//		}
	}

	public int getHandValue() {
		return handValue;
	}

	//TODO When printed to console this only shows the last dealt card
	public ArrayList<Card> getCard(Deck deck) {  
		hand = new ArrayList<Card>();
		hand.add(deck.dealCard());
		for (Card card : hand) {
			handValue += card.getValue();
		}
		return hand;
	}

	// TODO This doesn't deal properly
	// It deals out of order, test it without shuffling the deck
	public ArrayList<Card> getHand(Deck deck) {
		hand = new ArrayList<Card>();
		for (int i = 0; i < 2; i++) {
			hand.add(deck.dealCard());
		}
		for (Card card : hand) {
			handValue += card.getValue();
		}
		return hand;
	}
	
	/*
	 * Determines if Hand is Blackjack
	 * CURRENTLY WORKING
	 */
	public boolean isBlackjack(Hand hand) {
		if (hand.getHandValue() == 21) {
			System.out.println("Blackjack!!!\n");
			return true;
		}
		return false;
	}

	/*
	 * Determines if Hand is Busted
	 * CURRENTLY WORKING
	 */
	public boolean isBusted(Hand hand) {
		if (hand.getHandValue() > 21) {
			System.out.println("Busted\n");
			return true;
		}
		return false;
	}

	public String toString() {
		return hand + "" + " \nHand value: " + handValue;
	}

}
