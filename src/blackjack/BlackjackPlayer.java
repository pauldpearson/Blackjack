package blackjack;

import java.util.*;

public class BlackjackPlayer extends Player {

	private Player dealer;
	private Hand hand;
	private Card card;

	public BlackjackPlayer(Hand hand) {
		this.hand = hand;
	}

	public static BlackjackPlayer joinGame(Hand hand) {
		BlackjackPlayer player = new BlackjackPlayer(hand);
		return player;
	}

	public Card hitMe() {
		hand.addCard();
		return card;
	}

	public void setDealer(BlackjackDealer dealer) {
		this.dealer = dealer;
	}

	public Card dealCard() {
		throw new UnsupportedOperationException("Not available");
	}

	public String toString() {
		return hand.toString() + "\nPlayer Hand Value " + hand.getHandValue() + "\n";
	}

}
