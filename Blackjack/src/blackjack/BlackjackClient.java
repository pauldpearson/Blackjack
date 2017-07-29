package blackjack;

import java.util.*;

public class BlackjackClient {

	public static void playGame() {

		Deck deck = Deck.createDeck();
		Hand h1 = new Hand(new ArrayList<Card>());
		Hand h2 = new Hand(new ArrayList<Card>());

		BlackjackDealer dealer = BlackjackDealer.startGame(h1, deck);
		BlackjackPlayer player = BlackjackPlayer.joinGame(h2);

		dealer.setPlayer(player);
		player.setDealer(dealer);
		dealer.dealHand();
		// NOT WORKING YET dealer.viewHand();

		System.out.println(player);
		System.out.println(dealer);

		if (h2.getHandValue() > h1.getHandValue()) {
			System.out.println("Player wins\n");
		} else if (h1.getHandValue() > h2.getHandValue()) {
			System.out.println("Dealer wins\n");
		} else {
			System.out.println("Push\n");
		}

	}

	public static void main(String[] args) {

		for (int i = 0; i <= 10; i++) {
			playGame();
			System.out.println("New Game\n");
		}
	}
}
