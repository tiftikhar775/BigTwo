package org.example;

import java.util.Scanner;

class MenuDisplays {

    public static void mainMenuDisplay() {
        int option;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Big Two!");
            System.out.println("Select Number of Players");
            System.out.println("1. Two Players");
            System.out.println("2. Four Players");
            option = scanner.nextInt();
        } while (option < 1 || option > 2);
    }




}
