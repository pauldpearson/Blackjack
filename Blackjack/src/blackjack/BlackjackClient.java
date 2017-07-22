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

		int playerWins = 0;
		int dealerWins = 0;
		int push = 0;
		
		if (h2.getHandValue() > h1.getHandValue()) {
			System.out.println("Player wins\n");
			playerWins++;
		} else if (h1.getHandValue() > h2.getHandValue()) {
			System.out.println("Dealer wins\n");
			dealerWins++;
		} else {
			System.out.println("Push\n");
			push++;
		}
		System.out.println(playerWins + " times Player won");
		System.out.println(dealerWins + " times Dealer won");
		System.out.println(push + " times nobody won");

	}

	public static int countWins() {
		int count = 0;

		return count;
	}

	public static void main(String[] args) {
		playGame();
		
	}
}
