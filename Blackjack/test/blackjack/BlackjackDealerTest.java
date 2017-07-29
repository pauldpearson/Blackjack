package blackjack;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class BlackjackDealerTest {

	@Test
	public void test() {
		Deck deck = Deck.createDeck();
		Hand h1 = new Hand(new ArrayList<Card>());
		BlackjackDealer dealer = BlackjackDealer.startGame(h1, deck);
		assertEquals(dealer, dealer);
	}

}
