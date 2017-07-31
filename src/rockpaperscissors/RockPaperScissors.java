/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rockpaperscissors;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author matth
 */
public class RockPaperScissors {

    public enum Type {

        ROCK, PAPER, SCISSORS;

        /**
         *
         * @param value
         * @return
         */
        public static Type parseType(String value) {
            if (value == "ROCK") {
                return ROCK;
            } else if (value == "PAPER") {
                return PAPER;
            } else {
                return SCISSORS;
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        while (true) {
            System.out.println("Starting game of rock, paper and scissors...");
            System.out.println("Please choose either rock, paper or scissors: ");
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            int min = 0;
            int max = 2;

            int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
            String randomFeature = "";

            switch (randomNum) {
                case 0:
                    randomFeature = "rock";
                    break;
                case 1:
                    randomFeature = "paper";
                    break;
                case 2:
                    randomFeature = "scissors";
                    break;
            }

            System.out.printf("You appear to be battling against %s%n", randomFeature);

            switch (input) {
                case "rock":
                    switch (randomFeature) {
                        case "rock":
                            System.out.println("No winner");
                            break;
                        case "paper":
                            System.out.println("You lose!");
                            break;
                        case "scissors":
                            System.out.println("You win!");
                            break;
                    }
                    break;
                case "paper":
                    switch (randomFeature) {
                        case "rock":
                            System.out.println("You win!");
                            break;

                        case "paper":
                            System.out.println("No winner");
                            break;

                        case "scissors":
                            System.out.println("You lose!");
                            break;
                    }
                    break;
                case "scissors": {
                    switch (randomFeature) {
                        case "rock":
                            System.out.println("You lose!");
                            break;
                        case "paper":
                            System.out.println("You win!");
                            break;
                        case "scissors":
                            System.out.println("No winner");
                            break;
                    }
                    break;
                }
                default:
                    System.out.println("You input the wrong info!");
                    continue;
            }
            break;
        }
    }
}
