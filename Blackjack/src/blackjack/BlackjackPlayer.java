package blackjack;

import java.util.*;

public class BlackjackPlayer extends Player {

	/**
	 * Sets up the Dealer for the Player
	 */
	private Player dealer;
	private Hand hand;

	/**
	 * BlackjackPlayer constructor
	 * 
	 * @param hand
	 */
	public BlackjackPlayer(Hand hand) {
		this.hand = hand;
	}

	/**
	 * Allows the BlackjackPlayer to join a game of Blackjack
	 * @param hand
	 * @return
	 */
	public static BlackjackPlayer joinGame(Hand hand) {
		BlackjackPlayer player = new BlackjackPlayer(hand);
		return player;
	}

	/**
	 * Gives the BlackjackPlayer the ability to receive a Card
	 */
	public Card hitMe() {
		Card card = dealer.dealCard();
		hand.addCard(card);
		return card;
	}

	/**
	 * Gives the view of Player Hand
	 */
	public Hand viewHand() {
		return hand;
	}

	/**
	 * Sets up the Dealer for the Player
	 * @param dealer
	 */
	public void setDealer(BlackjackDealer dealer) {
		this.dealer = dealer;
	}

	/**
	 * Unsupported for Player
	 */
	public Card dealCard() {
		throw new UnsupportedOperationException("Not available");
	}

	public String toString() {
		return hand.toString() + "\nPlayer Hand Value " + hand.getHandValue() + "\n";
	}

	/*
	 * TEST
	 */
	public static void main(String[] args) {
		List<Card> sample = new ArrayList<Card>();
		Hand hand = new Hand(sample);
		BlackjackPlayer p1 = new BlackjackPlayer(hand);
		System.out.println(p1);

	}

}
