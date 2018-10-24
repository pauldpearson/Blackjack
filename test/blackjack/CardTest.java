package blackjack;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Collection;

public class CardTest {

	@Test
	public void testCardValue() {
		Card card1 = new Card(Rank.EIGHT, Suit.HEARTS);
		assertTrue(card1.getValue() == 8);
		
		Card card2 = new Card(Rank.JACK, Suit.SPADES);
		assertFalse(card2.getValue() == 4);

	}


}
