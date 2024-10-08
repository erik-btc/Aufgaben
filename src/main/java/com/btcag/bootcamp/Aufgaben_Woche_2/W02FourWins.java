package com.btcag.bootcamp.Aufgaben_Woche_2;

import java.util.Scanner;

public class W02FourWins {

    public static String[][] field = new String[6][7];
    public static Scanner scanner = new Scanner(System.in);
    public static String username1;
    public static String username2;
    public static boolean playersTurnStatus = true;// true for player 1 and false for player 2
    public static int turnCounter = 0;

    public static String[] PlayerRegister() {

        String username1;
        String username2;
        boolean isValid = false;

        do {
            System.out.println("Name von Spieler 1:");
            username1 = scanner.nextLine();
            System.out.println("Name von Spieler 2:");
            username2 = scanner.nextLine();

            if (username1.length() >= 3 && username1.length() <= 15 && username2.length() >= 3 && username2.length() <= 15) {
                isValid = true;
                System.out.println("Beide Spielernamen sind gültig.");
            } else {
                System.out.println("Die Spielernamen müssen zwischen 3 und 15 Zeichen lang sein. Bitte erneut eingeben.");
            }
        } while (!isValid);

        return new String[]{username1, username2};
    }




    public static void DrawField() {
        int rowCount = 0;
        int maxRow = 6;
        int maxColumn = 7;
        while (rowCount < maxRow) {
            int columnCount = 0;
            while (columnCount < maxColumn) {
                if (field[rowCount][columnCount] == "X") {
                    System.out.print("[X]");
                } else if (field[rowCount][columnCount] == "0") {
                    System.out.print("[0]");
                } else {
                    System.out.print("[ ]");
                }
                columnCount++;
            }
            System.out.println();
            rowCount++;
        }
        PlayersTurn();
    }


    public static void PlayersTurn(){
        int symbolColumn;

        int rowNumber = -1;
        if (playersTurnStatus) {
            boolean columnFree;
            do {
                do{
                    System.out.println("In welche Reihe möchtest du dein Zeichen machen " + username1 + "?");
                    symbolColumn = scanner.nextInt();
                    columnFree = true;

                }while(symbolColumn < 1 || symbolColumn > 7);

                for (int i = 0; i < 6; i++){
                    if (field[i][(symbolColumn - 1)] != "X" && field[i][(symbolColumn - 1)] != "0") {
                        rowNumber = i;
                    }
                }
                if (rowNumber < 0){
                    columnFree = false;
                }
            }while(!columnFree);
            field[rowNumber][symbolColumn - 1] = "X";
        }
        else {
            boolean columnFree;
            do{
                do{
                    System.out.println("In welche Reihe möchtest du dein Zeichen machen " + username2 + "?");
                    symbolColumn = scanner.nextInt();
                    columnFree = true;
                }while(symbolColumn < 1 || symbolColumn > 7);
                for (int i = 0; i < 6; i++){
                    if (field[i][(symbolColumn - 1)] != "X" && field[i][(symbolColumn - 1)] != "0") {
                        rowNumber = i;
                    }
                }
                if (rowNumber < 0){
                    columnFree = false;
                }
            }while(!columnFree);
        field[rowNumber][symbolColumn - 1] = "0";
        }
        playersTurnStatus = !playersTurnStatus;
        DrawField();
    }




    public static void main(String[] args) {
        System.out.println("Willkommen bei \n");
        System.out.println("""
                 __      ___              _____               _             _  \s
                 \\ \\    / (_)            / ____|             (_)           | | \s
                  \\ \\  / / _  ___ _ __  | |  __  _____      ___ _ __  _ __ | |_\s
                   \\ \\/ / | |/ _ \\ '__| | | |_ |/ _ \\ \\ /\\ / / | '_ \\| '_ \\| __|
                    \\  /  | |  __/ |    | |__| |  __/\\ V  V /| | | | | | | | |_\s
                     \\/   |_|\\___|_|     \\_____|\\___| \\_/\\_/ |_|_| |_|_| |_|\\__|
                                                                               \s
                                                                               \
                """);
        String[] spieler = PlayerRegister();
        username1 = spieler[0];
        username2 = spieler[1];
        System.out.println("Spieler 1: " + username1);
        System.out.println("Spieler 2: " + username2);
        System.out.println("Hier ist das Spielfeld:\n");
        DrawField();
        PlayersTurn();
    }
}
