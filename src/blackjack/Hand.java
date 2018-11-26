package blackjack;

import java.util.ArrayList;
import java.util.List;

public class Hand {

    private List<Card> hand;
    private Card card;
    private int handValue;

    public Hand(List<Card> hand) {
        this.hand = hand;
    }

    public void addCard() {
        hand.add(card);
    }

    public int getHandValue() {
        for (Card card : hand) {
            handValue += card.getValue();
        }
        return handValue;
    }

    public boolean isBlackjack() {
        if (getHandValue() == 21) {
            System.out.println("Blackjack!");
            return true;
        }
        return false;
    }

    public boolean isBusted() {
        if (getHandValue() > 21) {
            System.out.println("Busted");
            return true;
        }
        return false;
    }

	public String toString() {
		return "Hand: " + hand;
	}

    public static void main(String[] args) {
        List<Card> cards = new ArrayList<Card>();
        Hand hand = new Hand(cards);
        hand.addCard();
        System.out.println(hand);
    }
}