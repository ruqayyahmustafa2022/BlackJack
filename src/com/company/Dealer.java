package com.company;
import java.util.*;

public class Dealer{
    /*Create a new class called Dealer
           -- Dealer should have a method named “deal”, that returns two random Cards and removes them from the deck
           --Dealer should have a method named “hit”, that returns a random single card and removes it from the deck

     */

    private List<Card> deckOfCards;
    Deck deckBuilder = new Deck();  //new instance of the deck class w/ deck of cards and



    public void shuffleDeck(){
        deckOfCards = deckBuilder.buildDeck();
        Collections.shuffle(deckOfCards);

    }//end shuffle


    public void deal(){
        List<Card> card = new ArrayList<Card>();
        card.add(deckOfCards.get(0));
        card.add(deckOfCards.get(1));

        deckOfCards.remove(0);
        deckOfCards.remove(1);



      }//end method deal

    public void hit(){
        deckOfCards.get(0);
        deckOfCards.remove(0);

    }//end hit

}//end class Dealer
