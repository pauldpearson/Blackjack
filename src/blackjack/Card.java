package blackjack;

//TODO Need to account for Ace soft and hard values
public class Card {

    private Suit suit;
    private Rank rank;

    public Card() {
    }

    public Card(Rank rank, Suit suit) {
        this.suit = suit;
        this.rank = rank;
    }

    public int getValue() {
        return rank.getCardValue();
    }

    public String toString() {
        return rank.getCardSymbol() + " of " + suit.getIcon();
    }

    public static void main(String[] args) {
        Card card1 = new Card(Rank.EIGHT, Suit.HEARTS);
        Card card2 = new Card(Rank.JACK, Suit.SPADES);
        Card card3 = new Card(Rank.ACE, Suit.DIAMONDS);
        Card card4 = new Card(Rank.FOUR, Suit.CLUBS);
        System.out.println(card1 + " value " + card1.getValue());
        System.out.println(card2 + " value " + card2.getValue());
        System.out.println(card3 + " value " + card3.getValue());
        System.out.println(card4 + " value " + card4.getValue());
        int total = card1.getValue() + card2.getValue()+ card3.getValue() + card4.getValue();
        System.out.println("total " + total);
    }
}
