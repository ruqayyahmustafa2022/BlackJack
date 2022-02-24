package com.company;
import java.util.*;

public class Dealer{
    /*Create a new class called Dealer
           -- Dealer should have a method named “deal”, that returns two random Cards and removes them from the deck
           --Dealer should have a method named “hit”, that returns a random single card and removes it from the deck

     */

    private List<Card> deckOfCards;
    Deck deckBuilder = new Deck();  //new instance of the deck class w/ deck of cards and
    public int totalValue;
    public int hitValue;



    public void shuffleDeck(){
        deckOfCards = deckBuilder.buildDeck();
        Collections.shuffle(deckOfCards);

    }//end shuffle


    public int deal(){

        System.out.print("Your first card is a ");
        deckOfCards.get(0).Print();
        System.out.print("Your second card is a ");
        deckOfCards.get(1).Print();

        totalValue = deckOfCards.get(0).getValue() + deckOfCards.get(1).getValue();
        System.out.println("Your total is " + totalValue + ".");

        deckOfCards.remove(0);
        deckOfCards.remove(1);

        return totalValue;


      }//end method deal

    public int hit(){
        System.out.print("Your card is a ");
        deckOfCards.get(0).Print();

        hitValue = deckOfCards.get(0).getValue();
        System.out.print("Hit value: " + hitValue + '\n');

        deckOfCards.remove(0);


        return hitValue;

    }//end hit

}//end class Dealer
