package blackjack;

public class BlackjackClient {

	public static void main(String[] args) {

		Deck deck1 = new Deck();
		System.out.print("Full deck: " + deck1);
		deck1.deckSize();

		System.out.print("Deck minus one deal: " + deck1);
		deck1.dealCard();
		deck1.deckSize();

		Deck deck2 = new Deck();
		deck2.shuffle();
		System.out.print("Shuffled deck: " + deck2);
		deck2.deckSize();

		deck2.shuffle();
		System.out.print("Shuffled deck minus one deal: " + deck2);
		deck2.dealCard();
		deck2.deckSize();
	}

}
