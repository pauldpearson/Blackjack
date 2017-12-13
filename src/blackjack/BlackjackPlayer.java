package blackjack;

import java.util.*;


public class BlackjackPlayer extends Player {


	private Player dealer;
	private Hand hand;

	public BlackjackPlayer(Hand hand) {
		this.hand = hand;
	}

	public static BlackjackPlayer joinGame(Hand hand) {
		BlackjackPlayer player = new BlackjackPlayer(hand);
		return player;
	}

	public Card hitMe() {
		Card card = dealer.dealCard();
		hand.addCard(card);
		return card;
	}

	public Hand viewHand() {
		return hand;
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

	public static void main(String[] args) {
		List<Card> sample = new ArrayList<Card>();
		Hand hand = new Hand(sample);
		BlackjackPlayer p1 = new BlackjackPlayer(hand);
		System.out.println(p1);

	}

}
