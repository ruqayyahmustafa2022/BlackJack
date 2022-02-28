package com.company;

public class CheckForAce {
    public int aceValue;
    private String rank;


    public int switchValue(String rank)
    {
        //nothing yet
        if(rank.equals("Ace"))
            aceValue = 1;
        else
            aceValue = 0;

        return aceValue;
    }//end switchValue
}//end switchAceValue class
