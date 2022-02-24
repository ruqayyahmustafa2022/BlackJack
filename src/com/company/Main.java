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
        Dealer pickCard = new Dealer();
        Deck newDeck = new Deck();
        Scanner userInput = new Scanner(System.in);
        String playerResponse;
        String playerResponseHit;
        int cardCounter;
        int newTotalValue;

        newDeck.buildDeck();

        System.out.println("Dealer: Would you like to play? Yes or No?");
        playerResponse = userInput.next();

        if(playerResponse.equals("Yes"))
        {
            System.out.println("Here are your first two cards");
            Dealer twoCards = new Dealer();
            twoCards.shuffleDeck();
            twoCards.deal();
            cardCounter = twoCards.totalValue;
            if (cardCounter < 21) {
                System.out.println("Dealer: Would you like to Stay or Hit?");
                playerResponseHit = userInput.next();
                if (playerResponseHit.equals("Hit")) {
                    twoCards.hit();
                    newTotalValue = cardCounter + twoCards.hitValue;
                    System.out.println("You new total is " + (newTotalValue));

                }
                else {
                    System.out.println("No more cards for you. Your total is " + cardCounter);
                }
            }//end if cardCounter
            else if(cardCounter == 21)
                System.out.println("You're a winner!");
            else
                System.out.println("You busted! Better luck next time!");
        }
        else
            System.out.println("Please leave the table NOW!");












    }//end main
}//end Main
