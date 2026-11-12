package com.fashionstore;
import com.fashionstore.model.*;
import com.fashionstore.service.*;
public class Main {
    public static void main(String[] args) {
        Admin admin = new Admin(1,"Admin","admin@fashionstore.ma","1234");
        Client client = new Client(2,"Sara","sara@email.com","1234","Casablanca");
        Produit veste = new Produit(1,"Veste en cuir","Veste noire","Vestes",450,"veste.jpg");
        Variante variante = new Variante("VESTE-NOIR-M","M","Noir");
        veste.ajouterVariante(variante);
        DepotStock depot = new DepotStock("Dépôt principal");
        ServiceNotification notifications = new ServiceNotification();
        ServiceStock stock = new ServiceStock(depot,notifications);
        stock.entree(variante,10);
        client.getPanier().ajouterProduit(veste,variante,2);
        System.out.println("FashionStore - " + admin.getRole());
        System.out.println("Client : " + client.getNom());
        System.out.println("Total panier : " + client.getPanier().calculerTotal() + " DH");
        System.out.println("Stock disponible : " + depot.consulterStock(variante.getSku()));
    }
}
