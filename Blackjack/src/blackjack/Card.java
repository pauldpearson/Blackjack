package blackjack;

public class Card {
	private Suit suit;
	private Rank rank;

	/*
	 * Card constructor passing Rank and Suit enum
	 */
	public Card(Rank rank, Suit suit) {
		this.suit = suit;
		this.rank = rank;
	}

	public Rank getRank() {
		return rank;
	}

	/*
	 * getValue() to get our rank value from Rank enum
	 */
	public int getValue() {
		return rank.getCardValue();
	}

	/*
	 * getSuit() to get our suit icon from Suit enum
	 */
	public String getSuit() {
		return suit.getIcon();
	}

	public String toString() {
		return rank.getCardSymbol() + " of " + suit.getIcon();
	}
}
