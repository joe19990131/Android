package com.echoless.poker;

import java.util.Random;

public class Poker {
    Random random = new Random();
    Card[] cards = new Card[52];
    public Poker() {
        for(int i = 0;i<52;i++){
            cards[i] = new Card(i);
        }
    }
    public void shuffle(){
        for(int i = 0;i<52;i++){
            int r = random.nextInt(51);
            Card tmp = cards[i];
            cards[i] = cards[r];
            cards[r] = tmp;
        }
    }
}
