package org.example;

import java.util.Random;
import java.util.ArrayList;

public class GameLogic {

    public static ArrayList<String> generateCardHand() {

        // initialize card deck 2d array consisting of suit arrays and card ranks [4]x[13]
        String[][] cardDeck = {
                { "2◆", "3◆", "4◆", "5◆", "6◆", "7◆", "8◆", "9◆", "10◆", "J◆", "Q◆", "K◆", "A◆"},
                { "2♧", "3♧", "4♧", "5♧", "6♧", "7♧", "8♧", "9♧", "10♧", "J♧", "Q♧", "K♧", "A♧"},
                { "2♥", "3♥", "4♥", "5♥", "6♥", "7♥", "8♥", "9♥", "10♥", "J♥", "Q♥", "K♥", "A♥"},
                { "2♠", "3♠", "4♠", "5♠", "6♠", "7♠", "8♠", "9♠", "10♠", "J♠", "Q♠", "K♠", "A♠"}
        };

        Random random = new Random();

        ArrayList<String> cardHand = new ArrayList<>(); // initialize array list card hand

        // do this for half the deck so cards are divided evenly between player and cpu
        for (int i = 0; i < 52/2; i++) {
            int cardSuit;
            int cardRank;
            // only generate card suit and card rank that has not been marked
            do {
                cardSuit = random.nextInt(cardDeck.length); // select a suit array randomly from cardDeck array
                cardRank = random.nextInt(cardDeck[cardSuit].length); // select a random element from the randomly selected suit array
            } while (cardDeck[cardSuit][cardRank] == null);


             cardHand.add(cardDeck[cardSuit][cardRank]);

            //String randomCard = cardDeck[cardSuit][cardRank]; // store the card suit and card rank combination
            //System.out.print(randomCard + " ");

            cardDeck[cardSuit][cardRank] = null; // mark this cardSuit and cardRank combination so that it won't get selected again
        }

        return cardHand;

    }


}
