package blackjack;


public class BlackjackPlayer {

	private Hand playerHand;
	private String name;

	
	public BlackjackPlayer(String name) {
		this.name = name;
	}

	public Hand getHand() {
		return playerHand = new Hand();
	}

	public Hand hitMe(Deck deck) {
		playerHand.getCard(deck);
		return playerHand;
	}
	
	public int getPlayerHandValue() {
		return playerHand.getHandValue();
	}
	
	public boolean isBlackjack() {
		if (playerHand.getHandValue() == 21) {
			System.out.println("Blackjack!!!");
			return true;
		}
		return false;
	}

	public boolean isBusted() {
		if (playerHand.getHandValue() > 21) {
			System.out.println("Busted");
			return true;
		}
		return false;
	}

	public String toString() {
		return name + " " + playerHand;
	}
}
