package blackjack;

import java.util.Scanner;

public class BlackjackClient {

	public static void main(String[] args) {

		System.out.println("Let's play Blackjack!");

		// Create the playing deck
		Deck playingDeck = new Deck();
		playingDeck.createDeck();
		playingDeck.shuffle();

		// Create a deck for the player???
		Deck playerDeck = new Deck();
		Deck dealerDeck = new Deck();

		double playerMoney = 100.00;

		Scanner userInput = new Scanner(System.in);

		// Game loop
		while (playerMoney > 0) {
			System.out.println("You have $" + playerMoney + ", how much to bet?");
			double playerBet = userInput.nextDouble();
			if (playerBet > playerMoney) {
				System.out.println("You don't have that much to bet.");
				break;
			}

			boolean endRound = false;

			playerDeck.draw(playingDeck);
			playerDeck.draw(playingDeck);

			dealerDeck.draw(playingDeck);
			dealerDeck.draw(playingDeck);

			while (true) {
				System.out.println("Your hand: ");
				System.out.println(playerDeck.toString());
				System.out.println("Your hand is valued at : " + playerDeck.cardValue());

				System.out.println("Dealer shows : " + dealerDeck.getCard(0).toString() + "[Hidden]");

				System.out.println("Hit or Stand?");
				String response = userInput.nextLine();

				if (response.equalsIgnoreCase("Hit")) {
					playerDeck.draw(playingDeck);
					System.out.println("You draw a " + playerDeck.getCard(playerDeck.deckSize() - 1));
					if (playerDeck.cardValue() > 21) {
						System.out.println("Bust");
						playerMoney -= playerBet;
						endRound = true;
						break;
					}
				}
				if (response.equalsIgnoreCase("Stand")) {
					break;
				}

			}
			System.out.println("Dealer has " + dealerDeck.toString());
			if (dealerDeck.cardValue() > playerDeck.cardValue() && endRound == false) {
				System.out.println("Dealer wins.");
				playerMoney -= playerBet;
				endRound = true;
			}

			// Dealer has to draw at 16, and stand at 17
			while ((dealerDeck.cardValue() < 17) && endRound == false) {
				dealerDeck.draw(playingDeck);
				System.out.println("Dealer draws: " + dealerDeck.getCard(dealerDeck.deckSize() - 1).toString());
			}

			System.out.println("Dealer has " + dealerDeck.cardValue());
			if ((dealerDeck.cardValue() > 21) && endRound == false) {
				System.out.println("Dealer busts, you win!");
				playerMoney += playerBet;
			}

			// Determine if push
			if ((playerDeck.cardValue() == dealerDeck.cardValue()) && endRound == false) {
				System.out.println("Push");
				endRound = true;
			}

			// Player wins the hand
			if ((playerDeck.cardValue() > dealerDeck.cardValue()) && endRound == false) {
				System.out.println("You win the hand!");
				playerMoney += playerBet;
				endRound = true;
			} else if (endRound == false) {
				System.out.println("You lose the hand.");
				playerMoney -= playerBet;
				endRound = true;
			}

			playerDeck.moveAllToDeck(playingDeck);
			dealerDeck.moveAllToDeck(playingDeck);
			System.out.println("End of hand.");

		}
		System.out.println("You are out of money, leave the table.");

		userInput.close();

	}

}
