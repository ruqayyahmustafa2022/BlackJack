package com.company;
import java.util.*;

public class Dealer {
    /*Create a new class called Dealer
                Dealer should have a method named “deal”, that returns two random Cards and removes them from the deck
        Dealer should have a method named “hit”, that returns a random single card and removes it from the deck

     */
    private List pickCards;
    Random rnd = new Random(52);
    Deck pickCard = new Deck();

    public void deal(){
        int index1 = rnd.nextInt();
        int index2 = rnd.nextInt();

        if(index1 == index2)
        {
            //get a new index2, print out the card 1 and remove it from the deck
            index2 = rnd.nextInt();
            //System.out.println(pickCards.get(index1));
            pickCards.remove(index1);


            //System.out.println(pickCards.get(index2));
            pickCards.remove(index2);
        }
        else
        {
            //keep index2, print out the card and remove it from the deck

            //System.out.println(pickCards.get(index1));
            pickCards.remove(index1);

            //System.out.println(pickCards.get(index2));
            pickCards.remove(index2);
        }



    }//end deal Method

    public void hit(){
        int index3 = rnd.nextInt();
        //System.out.println(pickCards.get(index3));
        pickCards.remove(index3);

    }//end hit method

}//end class Dealer
