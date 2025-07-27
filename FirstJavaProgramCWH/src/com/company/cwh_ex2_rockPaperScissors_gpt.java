package com.company;
import java.util.Scanner;
import java.util.Random;

public class cwh_ex2_rockPaperScissors_gpt {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Press E or e to start the game: ");
        String input = sc.next();
        input = input.toUpperCase();

        if (input.equals("E")) {

            int userWins = 0;
            int computerWins = 0;
            String[] choices = {"Rock", "Paper", "Scissors"};

            for (int i = 1; i <= 5; i++) {
                System.out.println("\nRound: " + i);
                System.out.print("Enter your choice (Rock, Paper, Scissors): ");
                String userChoice = sc.next().toLowerCase();

                int compIndex = random.nextInt(3);
                String compChoice = choices[compIndex].toLowerCase();

                System.out.println("Computer chose: " + compChoice);

                if (userChoice.equals(compChoice)) {
                    System.out.println("It's a draw!");
                } else if (
                        (userChoice.equals("rock") && compChoice.equals("scissors")) ||
                                (userChoice.equals("paper") && compChoice.equals("rock")) ||
                                (userChoice.equals("scissors") && compChoice.equals("paper"))
                ) {
                    System.out.println("You win this round!");
                    userWins++;
                } else {
                    System.out.println("Computer wins this round!");
                    computerWins++;
                }
            }

            System.out.println("\nGame Over!");
            if (userWins > computerWins) {
                System.out.println("🎉 You won the game!");
            } else if (computerWins > userWins) {
                System.out.println("😢 Computer won the game.");
            } else {
                System.out.println("It's a tie!");
            }

        } else {
            System.out.println("Please press E or e to start the game.");
        }

        sc.close();
    }
}
