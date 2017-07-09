package blackjack;

import java.util.*;

public class Player {

	private int money;
	private int bet;
	private boolean ante;
	private ArrayList<Card> player;

	/*
	 * Use the default constructor for Player
	 */

	public int getMoney() {
		return money;
	}

	public int getBet() {
		return bet;
	}

	public boolean getAnte() {
		return true;
	}

	public String toString() {
		return "Player is " + player;
	}

}
