package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Rock, Paper, Scissors!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many rounds would you like to play?");
        int rounds = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < rounds; i++) {
            playGame(scanner);
        }
    }

    static void playGame(Scanner scanner) {
        System.out.println("What move will you make?");
        System.out.println("Rock");
        System.out.println("Paper");
        System.out.println("Scissors");
        String playerMove = scanner.nextLine();

        Random random = new Random();
        int randomNumber = random.nextInt(3);

        String computerMove;
        if (randomNumber == 0) {
            computerMove = "Rock";
        } else if (randomNumber == 1) {
            computerMove = "Paper";
        } else {
            computerMove = "Scissors";
        }
        System.out.println("Computer chose " + computerMove + "!");

        if (playerMove.equals(computerMove)) {
            System.out.println("There is a draw!");
        } else if (playerWins(playerMove, computerMove)) {
            System.out.println("Player wins!");
        } else {
            System.out.println("Computer wins!");
        }
    }

    static boolean playerWins(String playerMove, String computerMove) {
        if (playerMove.equals("Rock")) {
            return computerMove.equals("Scissors");
        } else if (playerMove.equals("Paper")) {
            return computerMove.equals("Rock");
        } else {
            return computerMove.equals("Paper");
        }
    }

}