package com.echoless.poker;

public class Card {
    char[] flower = {'\u2663', '\u2666', '\u2665', '\u2660'};
    int number;
    public Card(int number) {
        this.number = number;
    }

    public String getCard(){
        return number%13+1 + " " + flower[number/13];
    }
}

