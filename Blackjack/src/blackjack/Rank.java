package blackjack;

public enum Rank {

	TWO(2, "2"), THREE(3, "3"), FOUR(4, "4"), FIVE(5, "5"), SIX(6, "6"), SEVEN(7, "7"), EIGHT(8, "8"), NINE(9,
			"9"), TEN(10, "10"), JACK(10, "J"), QUEEN(10, "Q"), KING(10, "Q"), ACE(11, "A");

	/**
	 * Rank data members to call in our Card class
	 * @param cardValue
	 * @param cardSymbol 
	 */
	private int cardValue;
	private String cardSymbol;

	/**
	 * Rank Enum Constructor
	 * @param cardValue
	 * @param cardSymbol
	 */
	private Rank(int cardValue, String cardSymbol) {
		this.cardValue = cardValue;
		this.cardSymbol = cardSymbol;
	}

	/**
	 * Gets the Cards symbol
	 */
	public String getCardSymbol() {
		return cardSymbol;
	}

	/**
	 * Gets the Card value
	 */
	public int getCardValue() {
		return cardValue;
	}
}