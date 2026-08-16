package com.mycompany.taller1.biblioteca.git2;

public abstract class Person {
    
    private String id;
    private String name;
    private String phoneNumber;

    protected Person() {
    }

    protected Person(String id, String name, String phone) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phone;
    }
    
    

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String nombre) {
        this.name = nombre;
    }

    public void setPhoneNumber(String telefono) {
        this.phoneNumber = telefono;
    }
    
    
    
    
}
