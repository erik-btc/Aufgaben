package com.btcag.bootcamp.Aufgaben_Woche_2;

import java.util.Scanner;

public class W02FourWins {

    public static String[][] field = new String[6][7];
    public static Scanner scanner = new Scanner(System.in);
    public static String username1;
    public static String username2;
    public static boolean playersTurnStatus = true; // true for player 1 and false for player 2

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

    public static void initializeField() {
        for (int row = 0; row < 6; row++) {
            for (int col = 0; col < 7; col++) {
                field[row][col] = " ";
            }
        }
    }

    public static void DrawField() {
        int maxRow = 6;
        int maxColumn = 7;
        for (int row = 0; row < maxRow; row++) {
            for (int col = 0; col < maxColumn; col++) {
                System.out.print("[" + field[row][col] + "]");
            }
            System.out.println();
        }
    }

    public static void PlayersTurn() {
        int symbolColumn;
        int rowNumber = -1;

        if (playersTurnStatus) {
            System.out.println("In welche Spalte möchtest du dein Zeichen setzen, " + username1 + "?");
        } else {
            System.out.println("In welche Spalte möchtest du dein Zeichen setzen, " + username2 + "?");
        }

        while (true) {
            symbolColumn = scanner.nextInt();

            if (symbolColumn < 1 || symbolColumn > 7) {
                System.out.println("Ungültige Spalte. Bitte eine Zahl zwischen 1 und 7 eingeben.");
                continue;
            }

            symbolColumn -= 1;

            rowNumber = -1;
            for (int row = 5; row >= 0; row--) {
                if (field[row][symbolColumn].equals(" ")) {
                    rowNumber = row;
                    break;
                }
            }

            if (rowNumber == -1) {
                System.out.println("Diese Spalte ist voll. Bitte eine andere Spalte wählen.");
            } else {
                break;
            }
        }

        if (playersTurnStatus) {
            field[rowNumber][symbolColumn] = "X";
        } else {
            field[rowNumber][symbolColumn] = "0";
        }

        if (checkWin()) {
            DrawField();
            System.out.println((playersTurnStatus ? username1 : username2) + " hat gewonnen!");
            System.exit(0);
        }

        playersTurnStatus = !playersTurnStatus;
    }

    public static boolean checkWin() {
        // Horizontal überprüfen
        for (int row = 0; row < 6; row++) {
            for (int col = 0; col <= 3; col++) {
                String chip = field[row][col];
                if (!chip.equals(" ") && chip.equals(field[row][col + 1]) && chip.equals(field[row][col + 2]) && chip.equals(field[row][col + 3])) {
                    return true;
                }
            }
        }

        // Vertikal überprüfen
        for (int col = 0; col < 7; col++) {
            for (int row = 0; row <= 2; row++) {
                String chip = field[row][col];
                if (!chip.equals(" ") && chip.equals(field[row + 1][col]) && chip.equals(field[row + 2][col]) && chip.equals(field[row + 3][col])) {
                    return true;
                }
            }
        }

        // Diagonale (von links oben nach rechts unten) überprüfen
        for (int row = 0; row <= 2; row++) {
            for (int col = 0; col <= 3; col++) {
                String chip = field[row][col];
                if (!chip.equals(" ") && chip.equals(field[row + 1][col + 1]) && chip.equals(field[row + 2][col + 2]) && chip.equals(field[row + 3][col + 3])) {
                    return true;
                }
            }
        }

        // Diagonale (von rechts oben nach links unten) überprüfen
        for (int row = 0; row <= 2; row++) {
            for (int col = 3; col < 7; col++) {
                String chip = field[row][col];
                if (!chip.equals(" ") && chip.equals(field[row + 1][col - 1]) && chip.equals(field[row + 2][col - 2]) && chip.equals(field[row + 3][col - 3])) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println("Willkommen bei Vier Gewinnt!");
        String[] spieler = PlayerRegister();
        username1 = spieler[0];
        username2 = spieler[1];
        System.out.println("Spieler 1: " + username1);
        System.out.println("Spieler 2: " + username2);

        initializeField();
        System.out.println("Hier ist das Spielfeld:\n");

        while (true) {
            DrawField();
            PlayersTurn();
        }
    }
}
