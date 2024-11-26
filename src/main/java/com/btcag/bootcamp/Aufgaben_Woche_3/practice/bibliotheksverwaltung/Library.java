package com.btcag.bootcamp.Aufgaben_Woche_3.practice.bibliotheksverwaltung;

public class Library {
    private Book[] books;
    private int numberOfBooks;

    public Library() {
        books = new Book[10];
        numberOfBooks = 0;
    }


    public void addBook(Book book){
        if(numberOfBooks < books.length){
            books[numberOfBooks] = book;
            numberOfBooks++;
        }
        else{
            System.out.println("Library is full.");
        }
    }

    public void removeBook(int bookId){
        books[bookId - 1] = null;
    }

    public void showAllBooks(){
        for (int i = 0; i < numberOfBooks; i++) {
            System.out.println(i + 1 +". " +books[i].getTitle() + " from " + books[i].getAuthor());
        }
    }

    public void rentBook(){

    }

    public void giveBookBack(){

    }

}
