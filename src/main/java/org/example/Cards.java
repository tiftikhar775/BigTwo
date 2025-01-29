package org.example;

import java.util.Random;

public class Cards {

    public static void generateCardHand(int numOfCards) {

        // initialize card deck array of suit arrays and card ranks [4]x[13]
        String[][] cardDeck = {
                { "2◆", "3◆", "4◆", "5◆", "6◆", "7◆", "8◆", "9◆", "10◆", "J◆", "Q◆", "K◆", "A◆"},
                { "2♧", "3♧", "4♧", "5♧", "6♧", "7♧", "8♧", "9♧", "10♧", "J♧", "Q♧", "K♧", "A♧"},
                { "2♥", "3♥", "4♥", "5♥", "6♥", "7♥", "8♥", "9♥", "10♥", "J♥", "Q♥", "K♥", "A♥"},
                { "2♠", "3♠", "4♠", "5♠", "6♠", "7♠", "8♠", "9♠", "10♠", "J♠", "Q♠", "K♠", "A♠"}
        };

        Random random = new Random();

        // do this for the number of cards specified
        for (int i = 0; i < numOfCards; i++) {
            int cardSuit;
            int cardRank;
            // only generate card suit and card rank that has not been marked
            do {
                cardSuit = random.nextInt(cardDeck.length); // select a suit array randomly from cardDeck array
                cardRank = random.nextInt(cardDeck[cardSuit].length); // select a random element from the randomly selected suit array
            } while (cardDeck[cardSuit][cardRank] == null);

            String randomCard = cardDeck[cardSuit][cardRank]; // store the card suit and card rank combination
            System.out.print(randomCard + " ");

            cardDeck[cardSuit][cardRank] = null; // mark this cardSuit and cardRank combination so that it won't get selected again
        }

    }


}
