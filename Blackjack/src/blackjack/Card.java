package blackjack;

public class Card {
	private Suit suit;
	private Rank rank;
	//int value;

	public Card(Rank rank, Suit suit) {
		this.suit = suit;
		this.rank = rank;
	}
	
	public Rank getRank() {
		return rank;
	}

	public int getValue() {
		return rank.getCardValue();
	}
	
	public String getSuit() {
		return suit.getIcon();
	}

//	public void setValue(Rank rank) {
//		value = rank.getCardValue();
//	}

	public String toString() {
		return String.format("%s of %s", rank, suit);
	}
}
