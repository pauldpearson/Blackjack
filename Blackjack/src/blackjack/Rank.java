package blackjack;

public enum Rank {

	// TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING,
	// ACE;

	TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10), JACK(10), QUEEN(10), KING(
			10), ACE(11);

	private int cardValue;

	private Rank(int value) {
		cardValue = value;
	}

	public int getCardValue() {
		return cardValue;
	}

}