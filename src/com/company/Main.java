package com.company;

import java.util.Random;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	/*
        In your main class, deal the user a hand of two cards
        Display the total of the two card values to the user
        If the cards equal 21, declare Black Jack and congratulate the user.
        If the cards are not equal to 21, ask the user to hit (get another card) or stay (take the current score and end the “hand)
        Allow the user to keep getting cards until their value exceeds 21 or they choose to stay
        Bonus: Can you figure out a way to handle Aces being worth 1 or 11?
        Super Bonus: Can you handle the dealer also playing a hand to see who wins with the closest score to 21?

	 */
        //----Program Starts Here-----
        Random rnd = new Random(52);
        Deck newDeck = new Deck();
        Scanner userInput = new Scanner(System.in);
        String playerResponse;
        String playerResponseHit;
        int playerCounter;
        int dealerCounter;
        int newTotalValue;

        newDeck.buildDeck();

        System.out.println("Dealer: Welcome to the Blackjack table. Let's Play!");

            System.out.println("Here are your first two cards.");
            Dealer cardPicks = new Dealer();
            cardPicks.shuffleDeck();
            cardPicks.deal("Player");
            playerCounter = cardPicks.totalValue;
            cardPicks.deal("Dealer");
            dealerCounter = cardPicks.totalValue;

            while(playerCounter < 21) {
                    System.out.println("Dealer: Would you like to Stay or Hit?");
                    playerResponseHit = userInput.next();
                    if (playerResponseHit.equals("Hit")) {
                        cardPicks.hit();
                        playerCounter = playerCounter + cardPicks.hitValue;
                        System.out.println("Player, your new total is " + (playerCounter));

                    }//end if Hit
                    else {
                        System.out.println("No more cards for you. Your total is " + playerCounter);
                        cardPicks.revealDealer("Dealer");
                        dealerCounter += dealerCounter;
                        break;
                    }//end else statement

            }//end while playerCounter


        if(playerCounter == 21) {
            System.out.println("Player has Blackjack!");
            cardPicks.revealDealer("Dealer");
            dealerCounter += dealerCounter;
            System.out.println(dealerCounter);
            cardPicks.determineWinner(playerCounter, dealerCounter);
        }
        else if(playerCounter > 21)
                System.out.println("You bust! You lose!");
        else
            cardPicks.determineWinner(playerCounter, dealerCounter);

        //evaluate the results


    }//end main
}//end Main
