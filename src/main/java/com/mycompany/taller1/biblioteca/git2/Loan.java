package com.mycompany.taller1.biblioteca.git2;

import java.time.LocalDate;

public class Loan {
    private String loanId; 
    private Client client;
    Book book;
    private LocalDate Date;
    private String status;

    public Loan() {
    }

    public Loan(String LoanId, Client client, Book book, LocalDate Date, String Stado) {
        this.loanId = LoanId;
        this.client = client;
        this.book = book;
        this.Date = Date;
        this.status = Stado;
    }

    public String getLoanId() {
        return loanId;
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
        return status;
    }

    public void setLoanId(String LoanId) {
        this.loanId = LoanId;
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
        this.status = Stado;
    }
    
     
    
}
