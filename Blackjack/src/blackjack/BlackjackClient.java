package blackjack;
import java.util.*;
public class BlackjackClient {

	private BlackjackPlayer player;
	private BlackjackDealer dealer;
	
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
