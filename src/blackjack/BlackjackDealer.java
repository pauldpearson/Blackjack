package blackjack;

public class BlackjackDealer extends Player {

	private Deck deck;
	private Hand hand;
	private Player player;
	private Card card;

	public BlackjackDealer(Hand hand, Deck deck) {
		this.hand = hand;
		this.deck = deck;
	}

	public static BlackjackDealer startGame(Hand hand, Deck deck) {
		BlackjackDealer dealer = new BlackjackDealer(hand, deck);
		return dealer;
	}

	public Card dealCard() {
		card = deck.dealCard();
		return card;
	}

	void dealHand() {
		for (int i = 0; i < 2; i++) {
			hitMe();
			player.hitMe();
		}
	}

	public Card hitMe() {
		return dealCard();
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public String toString() {
		return hand.toString() + "\nDealer Hand Value: " + hand.getHandValue() + "\n";
	}

}
