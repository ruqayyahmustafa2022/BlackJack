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
    public int dealerTotalValue;
    public int hitValue;
    public int dealerHitValue;
    Scanner playerChoice = new Scanner(System.in);



    public void shuffleDeck(){
        deckOfCards = deckBuilder.buildDeck();
        Collections.shuffle(deckOfCards);

    }//end shuffle


    public int deal(String player){



        if(player.equals("Player"))
        {
            System.out.print(player + "'s first card is a ");
            deckOfCards.get(0).Print();

            System.out.print(player + "'s second card is a ");
            deckOfCards.get(1).Print();
            //CheckForAce aceCheck = new CheckForAce(deckOfCards.get(0), deckOfCards.get(1));
            //CheckForAce aceCheck = new CheckForAce();

            totalValue = deckOfCards.get(0).getValue() + deckOfCards.get(1).getValue();
            System.out.println(player + ",your total is " + totalValue + ".");
            System.out.println("********************************************" + '\n');
            deckOfCards.remove(0);
            deckOfCards.remove(1);
        }
        else if(player.equals("Dealer"))
        {
            System.out.print(player + " has a ");
            deckOfCards.get(0).Print();
            totalValue = deckOfCards.get(0).getValue();
            System.out.println(player + "'s total is " + totalValue + ".");
            System.out.println("********************************************" + '\n');
            deckOfCards.remove(0);
            deckOfCards.get(0);
            //deckOfCards.remove(1);

        }

        return totalValue;

      }//end method deal

    public int hit(){
        System.out.print("Your card is a ");
        deckOfCards.get(1).Print();

        hitValue = deckOfCards.get(1).getValue();
        System.out.print("Hit value: " + hitValue + '\n');

        if(hitValue == 11)
        {
            System.out.println("Would you like this to be 1 or 11?");
            hitValue = playerChoice.nextInt();

        }//end if Ace
        deckOfCards.remove(1);
        return hitValue;

    }//end hit

    public void determineWinner(int playerCount, int dealerCount){
        //this code will determine who won the game
        if(playerCount <= 21 && playerCount > dealerCount)
            System.out.println("Player wins!");
        else if(dealerCount <=21 && dealerCount > playerCount)
            System.out.println("The house wins.");
        else if(playerCount == 21 && dealerCount == 21)
            System.out.println("Everyone wins!");
        else
            System.out.println("It's a Push. No winners. No losers.");
    }//end determine winner

    public int revealDealer(String player)
    {

        do{
            System.out.print("Dealer has a ");
            deckOfCards.get(1).Print();

            totalValue = deckOfCards.get(1).getValue() + totalValue;
            System.out.println(player + ",your total is " + totalValue + ".");
            System.out.println("********************************************" + '\n');
            deckOfCards.remove(1);


        }while(totalValue < 17); //end while less than 17
        return totalValue;

    }//end reveal dealer card

}//end class Dealer
