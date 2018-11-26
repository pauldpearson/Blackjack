package blackjack;

public abstract class Player {

    private Hand hand;
    private Card card;

    Card hitMe() {
        hand.addCard();
        return card;
    }

    boolean isBlackjack() {
        return hand.getHandValue() == 21;
    }

    boolean isBusted() {
        return hand.getHandValue() >= 21;
    }
}
