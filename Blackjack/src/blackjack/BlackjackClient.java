package blackjack;

public class BlackjackClient {

	public static void main(String[] args) {

		// Testing the creation of an unshuffled deck
		// Deck deck1 = new Deck();
		// System.out.print("Unsuffled deck: " + deck1);
		// deck1.deckSize();
		// System.out.println();

		// Testing the above but with a deal from the deck
		// System.out.print("Unshuffled deck minus one deal: " + deck1);
		// deck1.dealCard();
		// deck1.deckSize();
		// System.out.println();

		// Testing the shuffle method
		// Deck deck2 = new Deck();
		// deck2.shuffle();
		// System.out.print("Shuffled deck: " + deck2);
		// deck2.deckSize();
		// System.out.println();

		// Testing the shuffle method with a deal
		// deck2.shuffle();
		// System.out.print("Shuffled deck minus one deal: " + deck2);
		// deck2.dealCard();
		// deck2.deckSize();
		// System.out.println();

		Deck deck3 = new Deck();
		deck3.shuffle();
		Hand hand = new Hand(deck3);
		System.out.println(hand);
		hand.isBlackjack();
	}
}
