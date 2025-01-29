package org.example;

import java.util.Scanner;

class MenuDisplays {

    public static void mainMenuDisplay() {
        Scanner scanner = new Scanner(System.in);
        int option;
        System.out.println("Welcome to Talha's Big 2!");
        do {
            System.out.println("1. Play a round");
            System.out.println("2. How to play");
            option = scanner.nextInt();
        } while (option < 1 || option > 2);

        if (option == 1) {
            gameMenuDisplay();
        } else {
            instructionsMenu();
        }

    }

    public static void instructionsMenu() {



    }




    public static void gameMenuDisplay() {
        System.out.println("\nGame Menu");
        System.out.println("1. Play Singles");
        System.out.println("2. Play Doubles");
        System.out.println("3. Play Triples");
        System.out.println("4. Play 5-Card");
    }




}
