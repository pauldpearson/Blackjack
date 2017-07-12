package blackjack;

import java.util.*;

public class BlackjackPlayer {

	private int money;
	private int bet;
	private boolean ante;
	private ArrayList<Card> playerHand;

	/*
	 * BlackjackPlayer constructor with initial hand
	 */
	public BlackjackPlayer(Hand hand) {
		playerHand = new ArrayList<Card>();
	}

	public int getMoney() {
		return money;
	}

	public int getBet() {
		return bet;
	}

	public boolean getAnte() {
		return ante;
	}
	
	public void hitMe(Deck deck) {
		deck.dealCard();
	}

	public String toString() {
		return "Player's hand " + playerHand;
	}

}
