package org.example;

import java.util.Random;

public class Cards {

    public static void generateCardHand(int numOfCards) {

        // init 2d array [4]x[13]
        String[][] cardDeck = {
                { "2◆", "3◆", "4◆", "5◆", "6◆", "7◆", "8◆", "9◆", "10◆", "J◆", "Q◆", "K◆", "A◆"},
                { "2♧", "3♧", "4♧", "5♧", "6♧", "7♧", "8♧", "9♧", "10♧", "J♧", "Q♧", "K♧", "A♧"},
                { "2♥", "3♥", "4♥", "5♥", "6♥", "7♥", "8♥", "9♥", "10♥", "J♥", "Q♥", "K♥", "A♥"},
                { "2♠", "3♠", "4♠", "5♠", "6♠", "7♠", "8♠", "9♠", "10♠", "J♠", "Q♠", "K♠", "A♠"}
        };

        Random random = new Random();

        // do this for the number of cards specified
        for (int i = 0; i < numOfCards; i++) {
            int randomSuit;
            int randomRank;
            // only generate card suit and rank that has not been used before
            do {
                randomSuit = random.nextInt(cardDeck.length); // get random element from 2d array row
                randomRank = random.nextInt(cardDeck[randomSuit].length); // get random element from randomly selected row
            } while (cardDeck[randomSuit][randomRank] == null);

            String randomCard = cardDeck[randomSuit][randomRank]; // store random 2d array index
            System.out.print(randomCard + " ");
            cardDeck[randomSuit][randomRank] = null; // mark this card so it won't get selected again
        }

    }


}
