package blackjack;

public class BlackjackClient {

	public static void main(String[] args) {

		Deck deck = new Deck();
		System.out.print(deck);
		deck.shuffle();
		System.out.println(deck);
	}

}
