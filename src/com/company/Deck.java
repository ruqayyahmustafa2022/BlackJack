package com.company;

import java.util.*;

public class Deck {
    /*Create a new class called Deck
      Deck should have a public method that “builds” an arraylist of Card objects
Assign each Card a Suit (Spades, Clubs, Diamond, and Heart)
Assigning each card a Rank (2-10, Jack, Queen, King, Ace)
Assigning each card a value to 2-11
This should be done to recreate the 52 unique cards in a deck

     */

    private List deck = new ArrayList();
    final int MAX_SUITS = 4;
    final int MAX_RANK = 13;
    final int MAX_CARDS = 52;
    Card[] newCard = new Card[MAX_CARDS];

    String[] suit = {"Diamonds", "Spades", "Clubs","Hearts"};
    String[] rank = {"2", "3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
    int[] value = {2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11};
    int cardCount = 0;

    public void buildDeck() {
        for (int j = 0; j < MAX_SUITS; j++) {
            for (int i = 0; i < MAX_RANK; i++) {
                newCard[cardCount] = new Card(suit[j], rank[i], value[i]);
                deck.add(cardCount, newCard[cardCount]);
                cardCount++;
            }//end for i to MAX_CARDS
        }//end for j to MAX_SUITS

        }//end buildDeck Method



}//end Class Deck
