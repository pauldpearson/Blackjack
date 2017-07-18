package blackjack;

import java.util.*;

public class BlackjackPlayer {

	private ArrayList<Hand> playerHand;

	public BlackjackPlayer() {
		playerHand = new ArrayList<Hand>();
	}

	public ArrayList<Hand> getHand() {
		return playerHand;
	}
	
	public boolean hitMe(Hand hand) {
		return true;
	}

	//TODO this is not working properly
	public void hitMe() {
		playerHand.get(0);
	}

	public String toString() {
		return playerHand + "\n";
	}
}
