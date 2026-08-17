package com.mycompany.taller1.biblioteca.git2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    static ArrayList<Client> clients = new ArrayList<>();
    static ArrayList<Book> books = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    
    public static void createClient(){
        
        String id;
        String name;
        String phone;
        String email;
        
        System.out.println("\n__________AGREGAR CLIENTES__________\n -Ingrese a continuacion los datos del cliente a agregar: \n" );
        
        System.out.print("-ID: "); id = sc.nextLine();
        System.out.print("-NOMBRE: "); name = sc.nextLine();
        System.out.print("-TELEFONO: "); phone = sc.nextLine();
        System.out.print("-EMAIL: "); email = sc.nextLine();
        
        Client client = new Client(id, name, phone, email);
        
        clients.add(client);
        
        System.out.println("\nMENSAJE: Cliente agregado exitosamente");
    }
    
    public static void readClient(){
        
        int ind = 1;
        
        System.out.println("\n__________LISTAR CLIENTES__________\n -A continuacion se listan los clientes registrados: " );
        
        for (Client client : clients) {
            System.out.println("\nCliente "+ind+":\n");
            System.out.println("-ID: "+client.getId()); 
            System.out.println("-NOMBRE: "+client.getName()); 
            System.out.println("-TELEFONO: "+client.getPhoneNumber()); 
            System.out.print("-EMAIL: "+client.getEmail()); 
            
            
            
        }
    }
    
    public static Client searchClient(String id){
        
        for (Client client : clients) {
            if(id.equals(client.getId())){
                return client;
            }
            }
        
        return null;
        }
    
    public static void updateClient(){
        
        String id;
        
        System.out.print("\n\n__________MODIFICAR CLIENTE__________\n -Ingrese a continuacion el id del cliente a modificar: " ); id = sc.nextLine();
        
        Client client = searchClient(id);
        
        if(client != null){
            
            String newId, name, phone, email;
            
            System.out.println("\n-Cliente registrado a continuacion ingrese los datos: ");
            
            System.out.print("-ID: "); newId = sc.nextLine();
            System.out.print("-NOMBRE: "); name = sc.nextLine();
            System.out.print("-TELEFONO: "); phone = sc.nextLine();
            System.out.print("-EMAIL: "); email = sc.nextLine();
        
            client.setEmail(email)
                    .setId(newId)
                    .setName(name)
                    .setPhoneNumber(phone);
        
            System.out.println("\nMENSAJE: Cliente modificado exitosamente");
        }else{
            
            System.out.println("\nMENSAJE: El cliente ingresado no se encuentra registrado");
            
        }
        
    }
    
    public static void deleteClient(){
        
        String id;
        
        System.out.print("\n\n__________ELIMINAR CLIENTES__________\n -Ingrese a continuacion el id del cliente a eliminar: " ); id = sc.nextLine();
        
        Client client = searchClient(id);
        
        if(client != null){
            
            String opt;
            System.out.println("\n-MENSAJE: Cliente registrado, esta seguro que desea confirmar la operacion?: ");
            
            System.out.println("1. Si ");
            System.out.println("2. No"); 
            System.out.print("*"); opt = sc.nextLine();
        
            if(opt.equals("1")){
                clients.remove(client);
                System.out.println("\nMENSAJE: Cliente eliminado con exito");
            }else if(opt.equals("2")){
                System.out.println("\nMENSAJE: Operacion cancelada");
            }else{
                System.out.println("\nMENSAJE: Se ingreso una opcion invalida");
            }
        }else{
            System.out.println("\nMENSAJE: El cliente ingresado no se encuentra registrado");
        }
    }
    
    public static void createBook(){
        
        String cod, titl, year, auth;
        boolean avail;
        
       
        
        System.out.println("\n__________AGREGAR LIBROS__________\n -Ingrese a continuacion los datos del libro a agregar: \n" );
        
        System.out.print("-Codigo: "); cod = sc.nextLine();
        System.out.print("-Titulo: "); titl = sc.nextLine();
        System.out.print("-Ano de publicacion: "); year = sc.nextLine();
        System.out.print("-Autor: "); auth = sc.nextLine();
        System.out.print("-Disponible: "); avail = Boolean.parseBoolean(sc.nextLine());
        
        
        
        Book book = new Book(cod, titl, year, auth, avail);
        
        books.add(book);
        
        System.out.println("\nMENSAJE: Libro agregado exitosamente");
    }
    
    public static Book searchBook(String cod){

     for (Book book : books) {
         if(cod.equals(book.getCode())){
             return book;
         }
         }

     return null;
     }
    
    public static void updateBook(){
        
         String cod;
        
        System.out.print("\n\n__________MODIFICAR LIBRO__________\n -Ingrese a continuacion el codigo del libro a modificar: " ); cod = sc.nextLine();
        
        Book book = searchBook(cod);
        
                if(book != null){

                    String code, titl, year, auth;
                    boolean avail;

                    System.out.println("\n-Cliente registrado a continuacion ingrese los datos: ");

                    System.out.print("-Codigo: "); code = sc.nextLine();
                    System.out.print("-Titulo: "); titl = sc.nextLine();
                    System.out.print("-Ano de publicacion: "); year = sc.nextLine();
                    System.out.print("-Autor: "); auth = sc.nextLine();
                    System.out.print("-Disponible: "); avail = sc.nextBoolean();

                    book.setAuthor(auth)
                            .setAvailable(avail)
                            .setCode(cod)
                            .setCode(cod)
                            .setTitle(titl)
                            .setPublicationYear(year);
                    
                    System.out.println("\nMENSAJE: Libro modificado exitosamente");
                }else{
            
            System.out.println("\nMENSAJE: El libro ingresado no se encuentra registrado");
        }
        
    }
    
    
    
   
    
    
    
    public static void main(String[] args) {
        createBook();
        updateBook();
        
                
        
    }
}
