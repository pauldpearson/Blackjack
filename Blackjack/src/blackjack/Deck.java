package blackjack;

import java.util.*;

public class Deck {

	private ArrayList<Card> deck;

	public Deck() {
		this.deck = new ArrayList<Card>();
	}

	// Creates the deck of cards
	public void createDeck() {
		// Generate the cards using enhanced for loops
		// values refers to the values of Enum
		for (Suit cardSuit : Suit.values())  
			for (Value cardValue : Value.values()) {
				// Add a new card to the deck using add method of ArrayList
				deck.add(new Card(cardSuit, cardValue));
			}
	}

	public void shuffle() {
		Collections.shuffle(deck);
	}

	public void removeCard(int i) {
		deck.remove(i);
	}

	public Card getCard(int i) {
		return this.deck.get(i);
	}

	public void addCard(Card addCard) {
		this.deck.add(addCard);
	}

	// Method to draw from the deck
	public void draw(Deck comingFrom) {
		this.deck.add(comingFrom.getCard(0));
		comingFrom.removeCard(0);
	}
	
	public void moveAllToDeck(Deck moveTo) {
		int thisDeckSize = this.deck.size();
		
		for(int i = 0; i < thisDeckSize; i++) {
			moveTo.addCard(this.getCard(i));
		}
		for (int i = 0; i <thisDeckSize; i++) {
			this.removeCard(0);
		}
	}
	
	public int deckSize() {
		return this.deck.size();
	}

	public int cardValue() {
		int totalValue = 0;
		int aces = 0;

		for (Card aCard : this.deck) {
			switch (aCard.getValue()) {
			case TWO:
				totalValue += 2;
				break;
			case THREE:
				totalValue += 3;
				break;
			case FOUR:
				totalValue += 4;
				break;
			case FIVE:
				totalValue += 5;
				break;
			case SIX:
				totalValue += 6;
				break;
			case SEVEN:
				totalValue += 7;
				break;
			case EIGHT:
				totalValue += 8;
				break;
			case NINE:
				totalValue += 9;
				break;
			case TEN:
				totalValue += 10;
				break;
			case JACK:
				totalValue += 10;
				break;
			case QUEEN:
				totalValue += 10;
				break;
			case KING:
				totalValue += 10;
				break;
			case ACE:
				totalValue += 1;
				break;
			}
		}

		for (int i = 0; i < aces; i++) {
			if (totalValue > 10) {
				totalValue += 1;
			} else {
				totalValue += 11;
			}
		}
		return totalValue;
	}

	public String toString() {
		String cardListOutput = "";
		for (Card aCard : this.deck) {
			cardListOutput += "\n" + " " + aCard.toString();
		}
		return cardListOutput;
	}
}
