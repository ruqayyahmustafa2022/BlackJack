package com.company;

import com.sun.xml.internal.fastinfoset.util.StringArray;

import java.util.ArrayList;
import java.util.List;

public class Card {
    /*Create a class called Card
               -- A card should have at least 3 properties: suit, rank, and value

     */
    private String suit;
    private String rank;
    private int value;

    public void setSuit(String suit){
        this.suit = suit;
    }

    public void setRank(String rank){
        this.rank = rank;
    }

    public void setValue(int value)
    {
        this.suit = suit;
    }

    public String getSuit(){
        return suit;
    }

    public String getRank(){
        return rank;
    }

    public int getValue(){
        return value;
    }


    public Card(String cardSuit, String cardRank, int cardValue)
    {
        suit = cardSuit;
        rank = cardRank;
        value = cardValue;
        //System.out.println("Suit: " + suit + '\n' + "Rank: " + rank + '\n' + "Value: " + value + '\n');
    }

    //test
    public void Print(){
        System.out.println("Suit: " + suit + '\n' + "Rank: " + rank + '\n' + "Value: " + value + '\n');
    }

}//end class Card
