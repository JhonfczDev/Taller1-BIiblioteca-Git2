package com.mycompany.taller1.biblioteca.git2;

import java.time.LocalDate;

public class Loan {
    private String LoanId; 
    Client client;
    Book book;
    LocalDate Date;
    String Stado;

    public Loan() {
    }

    public Loan(String LoanId, Client client, Book book, LocalDate Date, String Stado) {
        this.LoanId = LoanId;
        this.client = client;
        this.book = book;
        this.Date = Date;
        this.Stado = Stado;
    }

    public String getLoanId() {
        return LoanId;
    }

    public Client getClient() {
        return client;
    }

    public Book getBook() {
        return book;
    }

    public LocalDate getDate() {
        return Date;
    }

    public String getStado() {
        return Stado;
    }

    public void setLoanId(String LoanId) {
        this.LoanId = LoanId;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public void setDate(LocalDate Date) {
        this.Date = Date;
    }

    public void setStado(String Stado) {
        this.Stado = Stado;
    }
    
     
    
}
