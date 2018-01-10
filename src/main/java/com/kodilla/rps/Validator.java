package com.kodilla.rps;

import java.util.Random;

public class Validator {

    private String paper = "1";
    private String rock = "2";
    private String scissors = "3";
    private String endGame = "x";
    private String restartGame = "n";
    private String computersMove;


    public String getComputersMove() {

        Random random = new Random();
        int select = random.nextInt(99);

        if (select >= 0 && select < 33) {
            computersMove = paper;
        } else if (select >= 33 && select < 66) {
            computersMove = rock;
        } else if (select >= 66 && select < 100) {
            computersMove = scissors;
        }
        return computersMove;
    }

    public void validateInput(String key) {

        /*if () {
            x
        } else if () {
            n */

        if (key.equals(getComputersMove())) {
            System.out.println("DRAW");
        } else if ((key.equals(paper) && getComputersMove().equals(rock)) ||
                (key.equals(rock) && getComputersMove().equals(scissors))) {
            System.out.println("You won");
        } else if ((key.equals(rock) && getComputersMove().equals(paper)) ||
                (key.equals(scissors) && getComputersMove().equals(rock))) {
            System.out.println("You lost");
        }

        System.out.println(key);
        System.out.println(computersMove);

    }
}
