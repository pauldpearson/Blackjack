package blackjack;

import java.awt.*;

public enum Suit {
    SPADES("\u2660"), HEARTS("\u2665"), DIAMONDS("\u2666"), CLUBS("\u2663");

    private final String icon;

    private Suit(String icon) {
        this.icon = icon;
    }

    public String getIcon() {
        return icon;
    }

    //TODO set the color of suits for red or black
}
