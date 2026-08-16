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

    public Person setId(String id) {
        this.id = id;
        return this;
    }

    public Person setName(String nombre) {
        this.name = nombre;
        return this;
    }

    public Person setPhoneNumber(String telefono) {
        this.phoneNumber = telefono;
        return this;
    }
    
    
    
    
}
