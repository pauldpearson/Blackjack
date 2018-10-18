package blackjack;

public class BlackjackDealer extends Player {

	private Deck deck;
	private Hand hand;
	private Player player;

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
		for (int i = 0; i < 2; i++) {
			hitMe();
			player.hitMe();
		}
	}

	public Card hitMe() {
		Card card = dealCard();
		hand.addCard(card);
		return card;
	}

	//hand.viewTopCard is not working, probably not necessary either
//	public Hand viewHand() {
//		hand.viewTopCard();
//		return hand;
//	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public String toString() {
		return hand.toString() + "\nDealer Hand Value: " + hand.getHandValue() + "\n";
	}

}
