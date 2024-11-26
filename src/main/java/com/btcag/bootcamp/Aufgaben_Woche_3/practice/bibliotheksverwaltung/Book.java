package com.btcag.bootcamp.Aufgaben_Woche_3.practice.bibliotheksverwaltung;

public class Book {
    private String title;
    private String author;
    private String publisher;
    private String isbn;
    private int pages;
    private String genre;
    private boolean available;

    public Book(String title, String author, String publisher, String isbn, int pages, String genre, boolean available) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.isbn = isbn;
        this.pages = pages;
        this.genre = genre;
        this.available = available;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getPages() {
        return pages;
    }

    public String getGenre() {
        return genre;
    }

    public boolean isAvailable() {
        return available;
    }





}
