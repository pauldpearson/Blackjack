package blackjack;

import static org.junit.Assert.*;

import org.junit.Test;

public class DeckTest {

	@Test
	public void testCreateDeck() {
		Deck deck = new Deck();
		for (int i = 0; i < 52; i++) {
			deck.dealCard();
		}
		assertTrue(deck.isDeckEmpty());
	}
}
