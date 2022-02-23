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

    List<Card> deck = new ArrayList<Card>(); //should this be public?
    final int MAX_SUITS = 4;
    final int MAX_RANK = 13;
    final int MAX_CARDS = 52;
    //Card[] newCard = new Card[MAX_CARDS];


    String[] suit = {"Diamonds", "Spades", "Clubs","Hearts"};
    String[] rank = {"2", "3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
    int[] value = {2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11};


    public List<Card> buildDeck() {
        for (int j = 0; j < MAX_SUITS; j++) {
            for (int i = 0; i < MAX_RANK; i++) {
                deck.add(new Card(suit[j], rank[i], value[i]));
                //System.out.println(deck.get(i).getSuit() + deck.get(i).getRank() + deck.get(i).getValue());
                deck.get(i).Print();
                System.out.println(deck.size());
            }//end for i to MAX_CARDS
        }//end for j to MAX_SUITS
        return deck;
        }//end buildDeck Method




}//end Class Deck
