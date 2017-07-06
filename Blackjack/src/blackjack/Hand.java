package blackjack;

public class Hand {

	private int handValue;

	public boolean isBlackjack() {
		if (handValue == 21) {
			return true;
		} else {
			return false;
		}
	}

}
