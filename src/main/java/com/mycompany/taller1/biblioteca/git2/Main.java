package com.mycompany.taller1.biblioteca.git2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    static ArrayList<Client> clients = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    
    public static void createClient(){
        
        String id;
        String name;
        String phone;
        String email;
        
        System.out.println("\n__________AGREGAR CLIENTE__________\n -Ingrese a continuacion los datos del cliente a agregar: \n" );
        
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
            }else{
                return null;
            }
            
        }
        
    }
    
    public static void main(String[] args) {
        createClient();
        readClient();
                
        
    }
}
