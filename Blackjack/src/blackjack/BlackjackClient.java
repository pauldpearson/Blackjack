package blackjack;

import java.util.*;

public class BlackjackClient {

	// private BlackjackPlayer player;
	// private BlackjackDealer dealer;

	public static void playGame() {

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

		if (h2.getHandValue() > h1.getHandValue()) {
			System.out.println("Player wins");
		} else if (h1.getHandValue() > h2.getHandValue()) {
			System.out.println("Dealer wins");
		} else {
			System.out.println("Push");
		}
	}

	public static void main(String[] args) {
		playGame();
	}
}
