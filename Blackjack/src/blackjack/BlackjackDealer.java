package blackjack;

import java.util.ArrayList;

public class BlackjackDealer {

	private Deck deck; // Deck dealer is using
	private Hand hand;
	private BlackjackPlayer player; // Player, Dealer is playing against
	private BlackjackDealer dealer;

	public BlackjackDealer(Hand hand, Deck deck) {
		this.hand = hand;
		this.deck = deck;
	}

	public static BlackjackDealer startGame(Hand hand, Deck deck) {
		BlackjackDealer dealer = new BlackjackDealer(hand, deck);
		return dealer;
	}

	public Card dealCard() {
		Card card = deck.dealCard();
		return card;
	}

	public void dealHand() {
		player.dealCard();
		dealer.dealCard();
	}

	public Card hitMe() {
		Card card = deck.dealCard();
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

	public String toString() {
		return hand.toString() + "\nDealer Hand Value: " + hand.getHandValue() + "\n";
	}

	public static void main(String[] args) {
		Deck deck = Deck.createDeck();
		Hand h1 = new Hand(new ArrayList<Card>());
		Hand h2 = new Hand(new ArrayList<Card>());

		BlackjackDealer dealer = BlackjackDealer.startGame(h1, deck);
		BlackjackPlayer player = BlackjackPlayer.joinGame(h2);

		System.out.println(dealer);
		System.out.println(player);

	}

}
