package blackjack;

import java.util.*;

public class BlackjackClient {

	public static void gameStart() {

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

	public static void main(String[] args) {
		
		gameStart();

	}
}
