package blackjack;



public class BlackjackClient {

	public static void main(String[] args) {

		Deck deck = new Deck();
		Hand hand1 = new Hand(deck);
		Hand hand2 = new Hand(deck);
		hand1.getCard(deck);
		hand2.getCard(deck);
		hand1.getCard(deck);
		hand2.getCard(deck);
		System.out.println(hand1);
		System.out.println(hand2);
		
		BlackjackPlayer player = new BlackjackPlayer();
		System.out.println(player);

	}
}
