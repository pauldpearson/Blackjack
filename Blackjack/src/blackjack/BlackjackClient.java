package blackjack;

public class BlackjackClient {

	public static void main(String[] args) {
		
		BlackjackPlayer player1 = new BlackjackPlayer("Player 1");
		BlackjackPlayer player2 = new BlackjackPlayer("Player 2");
		player1.getHand();
		player2.getHand();
		player1.isBlackjack();
		player2.isBlackjack();
		System.out.println(player1);
		System.out.println(player2);

		if(player1.getPlayerHandValue() > player2.getPlayerHandValue()) {
			System.out.println("Player 1 wins");
		} else if (player1.getPlayerHandValue() < player2.getPlayerHandValue()) {
			System.out.println("Player 2 wins");
		} else if (player1.getPlayerHandValue() == player2.getPlayerHandValue()) {
			System.out.println("It's a push");
		}
	}
}
