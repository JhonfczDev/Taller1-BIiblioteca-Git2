package com.mycompany.taller1.biblioteca.git2;

public class Client extends Person{
    
    private String email;

    public Client() {
    }

    public Client(String dni, String name, String num, String email) {
        super(dni, name, num);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
    
    
}
