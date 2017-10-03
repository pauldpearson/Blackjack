package blackjack;

public enum Suit {
    SPADES("\u2660"), HEARTS("\u2665"), DIAMONDS("\u2666"), CLUBS("\u2663");

    private String icon;

    /**
     *
     * @param icon
     */
    private setSuit(String icon) {
        this.icon = icon;
    }

    /**
     *
     * @return
     */
    public String getIcon() {
        return icon;
    }
}
