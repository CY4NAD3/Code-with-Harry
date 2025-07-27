package com.company;
import java.util.Scanner;
import java.util.Random;

public class cwh_ex2_rockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Press E or e to start the game: ");
        String input = sc.next();
        input = input.toUpperCase();

        if(input.equals("E")) {

            Random rps = new Random();

            int rockWinCount = 0;
            int paperWinCount = 0;
            int scissorWinCount = 0;

            for (int i=1; i<=5; i++ ) {

                float rock = rps.nextFloat();
                float paper = rps.nextFloat();
                float scissor = rps.nextFloat();

                System.out.println("Round: " + i);
                if (rock > paper && rock > scissor) {
                    System.out.println("Rock wins wins round:" +i);
                    rockWinCount += 1;

                }
                else if (paper > rock && paper > scissor) {
                    System.out.println("Paper wins wins round:" +i);
                    paperWinCount += 1;
                }
                else if (scissor > rock && scissor > paper){
                    System.out.println("Scissor wins round:" +i);
                    scissorWinCount += 1;
                }
                else {
                    System.out.println("Tie");
                }
                System.out.println(rock);
                System.out.println(paper);
                System.out.println(scissor);
            }
           if (rockWinCount>paperWinCount && rockWinCount>scissorWinCount){
               System.out.println("Rock won the full game");
           }
           else if (paperWinCount>rockWinCount && paperWinCount>scissorWinCount){
               System.out.println("Paper won the full game");
           }
           else if (scissorWinCount>rockWinCount && scissorWinCount>paperWinCount) {
               System.out.println("Scissors won the full game");
           }
           else {
               System.out.println("It's a Tie");
           }


        }
        else {
            System.out.println("Press E or e to start the game");
        }
        sc.close();
    }
}
