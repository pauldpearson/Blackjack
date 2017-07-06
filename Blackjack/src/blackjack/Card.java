package blackjack;


public class Card {
	private Suit suit;
	private Rank rank;

	public Card(Rank rank, Suit suit) {
		this.suit = suit;
		this.rank = rank;
	}

	public Rank getRank() {
		return rank;
	}

	public Rank softValue() {
		return rank;
	}

	public Rank hardValue() {
		return rank;
	}

	public String toString() {
		 return rank + " of " + suit;
	}
}
