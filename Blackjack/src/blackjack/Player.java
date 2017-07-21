package blackjack;

public abstract class Player {
	
	abstract Card hitMe();
	abstract Card dealCard();
	abstract Hand viewHand();
	
	// Should we add an abstract method for isBlackjack and isBusted

}
