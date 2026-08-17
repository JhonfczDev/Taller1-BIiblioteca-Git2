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
    
    
    
    
    
}
