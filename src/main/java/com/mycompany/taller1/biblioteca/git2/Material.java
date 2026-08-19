package com.mycompany.taller1.biblioteca.git2;

public abstract class Material {
    private String code;
    private String title;
    private String publicationYear;

    public Material() {
    }

    public Material(String code, String title, String publicationYear) {
        this.code = code;
        this.title = title;
        this.publicationYear = publicationYear;
    }

    public String getCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }

    public String getPublicationYear() {
        return publicationYear;
    }

    public Material setCode(String code) {
        this.code = code;
        
        return this;
    }

    public Material setTitle(String title) {
        this.title = title;
        
        return this;
    }

    public Material setPublicationYear(String publicationYear) {
        this.publicationYear = publicationYear;
        
        return this;
    }
    
    
    
}
