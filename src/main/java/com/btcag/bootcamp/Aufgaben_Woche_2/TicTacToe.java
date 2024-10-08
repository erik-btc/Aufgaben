package com.btcag.bootcamp.Aufgaben_Woche_2;

import java.util.Objects;
import java.util.Scanner;

public class TicTacToe {
    public static Scanner scanner = new Scanner(System.in);
    public static boolean playersTurnStatus = true; // true(1) for player 1 and false(0) for player 2
    public static String usernameOne;
    public static String usernameTwo;
    public static String[][] field = new String[3][3];

    private static void PlayerNames() {
        System.out.println("Name of Player 1: ");
        usernameOne = scanner.nextLine();
        System.out.println("Name of Player 2: ");
        usernameTwo = scanner.nextLine();
    }

    public static void DrawField(){
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                if (Objects.equals(field[x][y], "X")) {
                    System.out.print("[X]");
                }
                else if (Objects.equals(field[x][y], "0")) {
                    System.out.print("[O]");
                }
                else{
                    System.out.print("[ ]");
                }
            }
            System.out.println();
        }
        CheckWin();
    }

    public static void PlayersTurn(){
        if (playersTurnStatus) {
            int turnRow;
            int turnCol;
            while (true) {
                System.out.println("Which row do you want to place your X " + usernameOne + " ?");
                turnRow = scanner.nextInt();
                System.out.println("Which column do you want to place your X " + usernameOne + " ?");
                turnCol = scanner.nextInt();
                if(turnRow < 1 || turnRow > 3 || turnCol < 1 || turnCol > 3){
                    System.out.println("Please enter a number between 1 and 3!");
                }
                else {
                    if (field[turnRow - 1][turnCol - 1] == null) {
                        break;
                    }
                }
            }
            field[turnRow - 1][turnCol - 1] = "X";
            playersTurnStatus = false;
            DrawField();
        }
        else{
            int turnRow;
            int turnCol;
            while (true) {
                System.out.println("Which row do you want to place your 0 " + usernameTwo + " ?");
                turnRow = scanner.nextInt();
                System.out.println("Which column do you want to place your 0 " + usernameTwo + " ?");
                turnCol = scanner.nextInt();
                if(turnRow < 1 || turnRow > 3 || turnCol < 1 || turnCol > 3){
                    System.out.println("Please enter a number between 1 and 3!");
                }
                else {
                    if (field[turnRow - 1][turnCol - 1] == null) {
                        break;
                    }
                }
            }
            field[turnRow - 1][turnCol - 1] = "0";
            playersTurnStatus = true;
            DrawField();
        }
    }

    public static void CheckWin(){
        if (Objects.equals(field[0][0], "X") && Objects.equals(field[0][1], "X") && Objects.equals(field[0][2], "X")) {
            System.out.println(usernameOne + " Wins!");
        }
        else if (Objects.equals(field[1][0], "X") && Objects.equals(field[1][1], "X") && Objects.equals(field[1][2], "X")) {
            System.out.println( usernameOne + " Wins!");
        }
        else if (Objects.equals(field[2][0], "X") && Objects.equals(field[2][1], "X") && Objects.equals(field[2][2], "X")) {
            System.out.println(usernameOne + " Wins!");
        }
        else if (Objects.equals(field[0][0], "X") && Objects.equals(field[1][0], "X") && Objects.equals(field[2][0], "X")) {
            System.out.println(usernameOne + " Wins!");
        }
        else if (Objects.equals(field[0][1], "X") && Objects.equals(field[1][1], "X") && Objects.equals(field[2][1], "X")) {
            System.out.println(usernameOne + " Wins!");
        }
        else if (Objects.equals(field[0][2], "X") && Objects.equals(field[1][2], "X") && Objects.equals(field[2][2], "X")) {
            System.out.println(usernameOne + " Wins!");
        }
        else if (Objects.equals(field[0][0], "X") && Objects.equals(field[1][1], "X") && Objects.equals(field[2][2], "X")){
            System.out.println(usernameOne + " Wins!");
            /*
            X O O
            O X O
            O O X
             */
        }
        else if (Objects.equals(field[0][2], "X") && Objects.equals(field[1][1], "X") && Objects.equals(field[2][0], "X")){
            System.out.println(usernameOne + " Wins!");
            /*
            O O X
            O X O
            X O O
             */
        }

        else if (Objects.equals(field[0][0], "0") && Objects.equals(field[0][1], "0") && Objects.equals(field[0][2], "0")) {
            System.out.println(usernameTwo + " Wins!");
        }
        else if (Objects.equals(field[1][0], "0") && Objects.equals(field[1][1], "0") && Objects.equals(field[1][2], "0")) {
            System.out.println(usernameTwo + " Wins!");
        }
        else if (Objects.equals(field[2][0], "0") && Objects.equals(field[2][1], "0") && Objects.equals(field[2][2], "0")) {
            System.out.println(usernameTwo + " Wins!");
        }
        else if (Objects.equals(field[0][0], "0") && Objects.equals(field[1][0], "0") && Objects.equals(field[2][0], "0")) {
            System.out.println(usernameTwo + " Wins!");
        }
        else if (Objects.equals(field[0][1], "0") && Objects.equals(field[1][1], "0") && Objects.equals(field[2][1], "0")) {
            System.out.println(usernameTwo + " Wins!");
        }
        else if (Objects.equals(field[0][2], "0") && Objects.equals(field[1][2], "0") && Objects.equals(field[2][2], "0")) {
            System.out.println(usernameTwo + " Wins!");
        }
        else if (Objects.equals(field[0][0], "0") && Objects.equals(field[1][1], "0") && Objects.equals(field[2][2], "0")){
            System.out.println(usernameTwo + " Wins!");
            /*
            0 O O
            O 0 O
            O O 0
             */
        }
        else if (Objects.equals(field[0][2], "0") && Objects.equals(field[1][1], "0") && Objects.equals(field[2][0], "0")){
            System.out.println(usernameTwo + " Wins!");
            /*
            O O 0
            O 0 O
            0 O O
             */
        }
        else if (field[0][0] != null && field[0][1] != null && field[0][2] != null && field[1][0] != null && field[1][1] != null && field[1][2] != null && field[2][0] != null && field[2][1] != null && field[2][2] != null) {
            System.out.println("No remaining space, nobody wins.");
        }
        else {
            PlayersTurn();
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to TicTacToe");
        PlayerNames();
        System.out.println("Here's the playing field");
        DrawField();
    }
}
