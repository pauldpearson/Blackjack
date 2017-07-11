package blackjack;

public enum Suit {
	SPADES("\u2660"), HEARTS("\u2665"), DIAMONDS("\u2666"), CLUBS("\u2663");

	private String icon;

	private Suit(String icon) {
		this.icon = icon;
	}

	public String getIcon() {
		return icon;
	}
}
