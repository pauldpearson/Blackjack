package blackjack;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class BlackjackPlayerTest {

	@Test
	public void test() {
		List<Card> sample = new ArrayList<Card>();
		Hand hand = new Hand(sample);
		BlackjackPlayer p1 = new BlackjackPlayer(hand);
		assertEquals(p1, p1);
	
	}

}
