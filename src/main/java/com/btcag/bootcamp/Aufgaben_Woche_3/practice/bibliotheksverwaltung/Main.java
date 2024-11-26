package com.btcag.bootcamp.Aufgaben_Woche_3.practice.bibliotheksverwaltung;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", "J.B. Lippincott & Co.", "978-0-06-112008-4", 281, "Fiction", true);
        Book book2 = new Book("1984", "George Orwell", "Secker & Warbung", "978-0-452-28423-4", 328, "Dystopian", false);
        Book book3 = new Book("Pride and Prejudice", "Jane Austen", "T. Egerton, Whitehall", "978-0-19-953556-9", 279, "Romance", true);
        Book book4 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "Charles Scibner's Sons", "978-0-7432-7356-5", 180, "Tragedy", true);
        Book book5 = new Book("Moby Dick", "Herman Melville", "Harper & Brothers", "978-0-14-243724-7", 585, "Adventure", false);
        Book book6 = new Book("The Hobbit", "J.R.R. Tolkien", "George Allen & Unwin", "978-0-618-00221-3", 310, "Fantasy", true);

        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        library.addBook(book6);
        library.showAllBooks();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("[1] Remove a book\n[2] Show all books\n[3] End the programm");
            int userInput = scanner.nextInt();
            if (userInput == 1) {
                System.out.println("Which book would you like to remove?");
                int bookId = scanner.nextInt();
                library.removeBook(bookId);
            }
            else if (userInput == 2) {
                library.showAllBooks();
            }
            else if (userInput == 3) {
                break;
            }
        }


    }
}
