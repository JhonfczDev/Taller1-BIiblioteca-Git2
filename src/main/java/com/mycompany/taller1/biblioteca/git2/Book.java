package com.mycompany.taller1.biblioteca.git2;

public class Book extends Material{
    private String author;
    private boolean available;

    public Book() {
    }

    public Book(String cod, String titl, String year, String author, boolean available) {
        super(cod, titl, year);
        
        this.author = author;
        this.available = available;
    }

    public Book(String author, boolean available) {
        this.author = author;
        this.available = available;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return available;
        
    }

    public Book setAuthor(String author) {
        this.author = author;
        
        return this;
    }

    public Book setAvailable(boolean available) {
        this.available = available;
        
        return this;
    }
    
    
    
    
    
    
}
