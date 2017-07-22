package blackjack;

import java.util.ArrayList;

public class BlackjackDealer extends Player {

	private Deck deck;
	private Hand hand;
	private Player player;

	/**
	 * BlackjackDealer constructor
	 * 
	 * @param hand
	 * @param deck
	 */
	public BlackjackDealer(Hand hand, Deck deck) {
		this.hand = hand;
		this.deck = deck;
	}

	public static BlackjackDealer startGame(Hand hand, Deck deck) {
		BlackjackDealer dealer = new BlackjackDealer(hand, deck);
		return dealer;
	}

	/**
	 * Deals a Card from the Deck
	 */
	public Card dealCard() {
		Card card = deck.dealCard();
		return card;
	}

	/**
	 * Deals the Hand to both Player and Dealer
	 */
	public void dealHand() {
		for (int i = 0; i < 2; i++) {
			hitMe();
			player.hitMe();
		}
	}

	/**
	 * Allows Dealer to hit a Card to his Hand
	 */
	public Card hitMe() {
		Card card = dealCard();
		hand.addCard(card);
		return card;
	}

	public Hand viewHand() {
		return hand;
	}

	public void newDeck() {
		if (deck.isDeckEmpty()) {
			deck = Deck.createDeck();
		}
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public String toString() {
		return hand.toString() + "\nDealer Hand Value: " + hand.getHandValue() + "\n";
	}

	public static void main(String[] args) {
		Deck deck = Deck.createDeck();
		Hand h1 = new Hand(new ArrayList<Card>());
		Hand h2 = new Hand(new ArrayList<Card>());

		BlackjackDealer dealer = BlackjackDealer.startGame(h1, deck);
		BlackjackPlayer player = BlackjackPlayer.joinGame(h2);

		dealer.setPlayer(player);
		player.setDealer(dealer);
		dealer.dealHand();

		System.out.println(player);
		System.out.println(dealer);

	}

}
