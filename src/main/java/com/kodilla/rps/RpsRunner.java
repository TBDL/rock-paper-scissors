package com.kodilla.rps;

import java.util.Scanner;

public class RpsRunner {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome in Rock-Paper-Scissors game! \n" +
                            "Please insert your name");
        String name;
        name = scanner.nextLine();

        System.out.println("How many rounds do you want to play?");
        int roundsAmount;
        roundsAmount = scanner.nextInt();

        System.out.println("Hi " + name + ". You will play " + roundsAmount + " rounds \n" +
                "The game uses below keys: \n" +
                "Key 1 - move \"rock\" \n" +
                "Key 2 - move \"paper\" \n" +
                "Key 3 - move \"scissors\" \n" +
                "Key x - end game \n" +
                "Key n - restart game \n" +
                "------Select------");

        String key;
        key = scanner.nextLine();




    }

}
