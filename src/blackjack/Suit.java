package blackjack;

public enum Suit {

    SPADES("\u2660\uFE0F"), HEARTS("\u2764\uFE0F"), DIAMONDS("\u2666\uFE0F"), CLUBS("\u2663\uFE0F");

    private final String icon;

    Suit(String icon) {
        this.icon = icon;
    }

    public String getIcon() {
        return icon;
    }

}
