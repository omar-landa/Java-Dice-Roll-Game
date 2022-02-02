package chapter4;

import java.util.Random;
import java.util.Scanner;

public class DiceRollGame {

    public static void main(String args[]){


        //Initialize known values
        int currentSpace = 0;
        int lastSpace = 20;
        int maxRolls = 5;
        Random random = new Random();

        System.out.println("Welcome to Roll the Die! Let's begin...");
        System.out.println();

        for(int i=1; i<=maxRolls; i++){

            int die = random.nextInt(6) + 1;
            currentSpace = currentSpace + die;

            System.out.println("You rolled a " + die + "! Your current position on the board is " + currentSpace + "!");

            if(currentSpace == lastSpace){
                System.out.println("You've reached spot 20! You win!");
                break;
            }
            else if(currentSpace > lastSpace){
                System.out.println("You've gone past spot 20! You lose!");
                break;
            }

            else if(i==maxRolls && currentSpace < lastSpace){
                System.out.println("You're on space "+ currentSpace + ". Sorry, you've ran out of rolls! You lose!");

            }

            else{
                int spacesToGo = lastSpace - currentSpace;
                System.out.println("You have "+ spacesToGo + " spaces to go!");
            }

            System.out.println();
        }


    }
}
