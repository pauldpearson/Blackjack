package blackjack;

public class BlackjackClient {

	public static void main(String[] args) {

		// Initial Hand
		Deck deck = new Deck();
		deck.shuffle();
		Hand playerHand = new Hand(deck);
		Hand dealerHand = new Hand(deck);
		playerHand.isBlackjackOrBusted();
		System.out.println("Player hand " + playerHand);
		System.out.println();
		dealerHand.isBlackjackOrBusted();
		System.out.println("Dealer's hand " + dealerHand);
		System.out.println();

		if (playerHand.getHandValue() < 16) {
			playerHand.getCard(deck);
			playerHand.isBlackjackOrBusted();
			System.out.println("Player's hit card " + playerHand);
			System.out.println();
		} else if (playerHand.getHandValue() == 21) {
			System.out.println("Player wins");
		} else if (dealerHand.getHandValue() < 16) {
			dealerHand.getCard(deck);
			dealerHand.isBlackjackOrBusted();
			System.out.println("Dealer's hit card " + dealerHand);
			System.out.println();
		}

		if (playerHand.getHandValue() > dealerHand.getHandValue()) {
			System.out.println("Player wins");
		} else if (playerHand.getHandValue() == dealerHand.getHandValue()) {
			System.out.println("It's a push, here's your money back");
		} else if (dealerHand.getHandValue() > playerHand.getHandValue()) {
			System.out.println("Dealer wins");
		}
	}

}
