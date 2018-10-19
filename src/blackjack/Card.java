package blackjack;

//TODO Need to account for Ace soft and hard values
public class Card {

	private Suit suit;
	private Rank rank;

	public Card(Rank rank, Suit suit) {
		this.suit = suit;
		this.rank = rank;
	}

	public int getValue() {
		return rank.getCardValue();
	}

	public String toString() {
		return rank.getCardSymbol() + " of " + suit.getIcon();
	}

}
