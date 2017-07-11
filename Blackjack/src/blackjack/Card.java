package blackjack;

public class Card {
	private Suit suit;
	private Rank rank;
	private int value;

	public Card(Rank rank, Suit suit) {
		this.suit = suit;
		this.rank = rank;
	}

	public int getValue() {
		return value;
	}

	public void setValue(Rank rank) {
		value = rank.getCardValue();
	}

	public String toString() {
		return String.format("%s of %s", rank, suit);
	}
}
