package blackjack;

import static org.junit.Assert.*;

import org.junit.Test;

public class CardTest {

	@Test
	public void testCardValue() {
		Card card1 = new Card(Rank.EIGHT, Suit.HEARTS);
		assertTrue(card1.getValue() == 8);
		
		Card card2 = new Card(Rank.JACK, Suit.SPADES);
		assertFalse(card2.getValue() == 4);
	}
	
	

}
