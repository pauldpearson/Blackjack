package blackjack;

import java.util.ArrayList;

public class BlackjackTable {

	private Deck deck;
	private Player player;
	private Player dealer;
	private Hand hand;

	public BlackjackTable(Hand hand, Player player, Player dealer) {
		this.setHand(hand);
		this.setPlayer(player);
		this.setDealer(dealer);
	}
	
	public static void startGame() {
		
	}
	
	

	public static void playGame() {
		
		startGame();

		Deck deck = Deck.createDeck();
		Hand dealerHand = new Hand(new ArrayList<Card>());
		Hand playerHand = new Hand(new ArrayList<Card>());

		BlackjackDealer dealer = BlackjackDealer.startGame(dealerHand, deck);
		BlackjackPlayer player = BlackjackPlayer.joinGame(playerHand);

		dealer.setPlayer(player);
		player.setDealer(dealer);
		dealer.dealHand();
		// NOT WORKING YET dealer.viewHand();

		System.out.println(player);
		System.out.println(dealer);

		if (playerHand.getHandValue() > dealerHand.getHandValue()) {
			System.out.println("Player wins\n");
		} else if (dealerHand.getHandValue() > playerHand.getHandValue()) {
			System.out.println("Dealer wins\n");
		} else {
			System.out.println("Push\n");
		}
	}

	public Deck getDeck() {
		return deck;
	}

	public void setDeck(Deck deck) {
		this.deck = deck;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public Player getDealer() {
		return dealer;
	}

	public void setDealer(Player dealer) {
		this.dealer = dealer;
	}

	public Hand getHand() {
		return hand;
	}

	public void setHand(Hand hand) {
		this.hand = hand;
	}

}
