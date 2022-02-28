package com.company;
import java.util.*;

public class Dealer{
    /*Create a new class called Dealer
           -- Dealer should have a method named “deal”, that returns two random Cards and removes them from the deck
           --Dealer should have a method named “hit”, that returns a random single card and removes it from the deck

     */

    public List<Card> deckOfCards;
    Deck deckBuilder = new Deck();  //new instance of the deck class w/ deck of cards and
    public int totalValue;
    public int dealerTotalValue;
    public int hitValue;
    public int dealerHitValue;
    private String cardRank;
    Scanner playerChoice = new Scanner(System.in);
    CheckForAce aceCheck1 = new CheckForAce();
    CheckForAce aceCheck2 = new CheckForAce();





    public void shuffleDeck(){
        deckOfCards = deckBuilder.buildDeck();
        Collections.shuffle(deckOfCards);

        //this is test code... delete when bug is fixed
        System.out.println("*********************************DELETE 10 CARD OUTPUTS*********************************");
        for(int i = 0; i< 10; i++) {
            System.out.print((i+1) + ": ");
            deckOfCards.get(i).Print();
        }
        System.out.println("*********************************DELETE 10 CARD OUTPUTS*********************************" + '\n');


    }//end shuffle


    public int deal(String player){

        if(player.equals("Player"))
        {
            System.out.print(player + "'s first card is a ");
            deckOfCards.get(0).Print();
           // cardRank.equals(deckOfCards.get(0).getRank());
           // aceCheck1.switchValue(cardRank);

            System.out.print(player + "'s second card is a ");
            deckOfCards.get(1).Print();
          //  cardRank.equals(deckOfCards.get(1).getRank());
           // aceCheck2.switchValue(cardRank);

            totalValue = deckOfCards.get(0).getValue() + deckOfCards.get(1).getValue() + aceCheck1.aceValue + aceCheck2.aceValue;
            /*
            for(int i= 0; i < 2; i++){
                CheckForAce[] aceCheck = new CheckForAce();
                aceCheck(i).switchValue(cardRank);

            }//end switch Ace value

             */
            System.out.println(player + ",your total is " + totalValue + ".");
            System.out.println("********************************************" + '\n');
            deckOfCards.remove(0);
            deckOfCards.remove(0);

        }
        else if(player.equals("Dealer"))
        {
            System.out.print(player + " has a ");
            deckOfCards.get(0).Print();
            totalValue = deckOfCards.get(0).getValue();
            System.out.println(player + "'s total is " + totalValue + ".");
            System.out.println("********************************************" + '\n');
            deckOfCards.remove(0);
            System.out.print("**HIDDEN DEALER CARD: ");
            deckOfCards.get(0).Print();
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
        System.out.println("playerCount = " + playerCount + "    dealerCount = " + dealerCount);
        if(playerCount == 21 && dealerCount == 21)
            System.out.println("Blackjack for both Player and Dealer. It's a Push. No winners. No losers.");
        else if(playerCount < 21 && dealerCount < 21 && playerCount == dealerCount)
            System.out.println("It's a Push. No winners. No losers.");
        else if(playerCount > 21 && dealerCount > 21)
            System.out.println("Bust. Everyone loses!");
        else if(dealerCount == 21 && dealerCount > playerCount )
            System.out.println("Dealer has Blackjack. The house wins!");
        else if(playerCount < 21 && dealerCount > 21)
            System.out.println("Dealer Busts! Player wins!");
        else if(playerCount > dealerCount && dealerCount == 21)
            System.out.println("Player Busts! The house wins!");
        else if(playerCount > dealerCount)
            System.out.println("Player Wins");
        else if(playerCount < dealerCount)
            System.out.println("Dealer Wins");
        else
            System.out.println("It's a Push. No winners. No losers.");
    }//end determine winner

    public int revealDealer(String player)
    {

        do{
            System.out.print("Dealer has a ");
            deckOfCards.get(0).Print();

            totalValue = deckOfCards.get(0).getValue() + totalValue;
            System.out.println(player + ",your total is " + totalValue + ".");
            System.out.println("********************************************" + '\n');
            deckOfCards.remove(0);


        }while(totalValue < 17); //end while less than 17

        return totalValue;

    }//end reveal dealer card

}//end class Dealer
