package blackjack;

import java.util.ArrayList;

public class BlackjackDealer {

	private ArrayList<Hand> dealerHand;
	
	public BlackjackDealer() {
		dealerHand = new ArrayList<Hand>();
	}
	
	public Hand dealHand(Deck deck) {
		Hand dealerHand = new Hand(deck);
		return dealerHand;
	}

	public String toString() {
		return "Dealer's hand shows " + dealerHand;
	}
}
