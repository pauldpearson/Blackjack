package blackjack;

public class Card {
	private Suit suit;
	private Rank rank;

	// TODO find a way to "map" rank and value
	private int value;



	/*
	 * Constructor taking rank and suit as params
	 * 
	 * @param Rank
	 * 
	 * @param Suit
	 */
	public Card(Rank rank, Suit suit) {
		this.suit = suit;
		this.rank = rank;
	}

	public Rank getRank() {
		return rank;
	}

	// TODO this is not working yet!!!
	public int getValue() {
		return value;
	}

	public String toString() {
		return String.format("%s of %s", rank, suit);
	}
}
