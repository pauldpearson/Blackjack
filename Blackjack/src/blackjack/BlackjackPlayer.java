package blackjack;

import java.util.ArrayList;

public class BlackjackPlayer {
	
	private int money;
	private int ante;
	private String name;
	private ArrayList<Hand> playerHand;
	

	public BlackjackPlayer() {
		playerHand = new ArrayList<Hand>();
	}

	public String toString() {
		return "Player " + name + " hand shows " + playerHand;
	}

}
