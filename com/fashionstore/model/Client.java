package com.fashionstore.model;
public class Client extends Utilisateur {
    private String adresse; private Panier panier=new Panier();
    public Client(int id,String nom,String email,String mdp,String adresse){
        super(id,nom,email,mdp); this.adresse=adresse;
    }
    public String getRole(){return "Client";}
    public String getAdresse(){return adresse;}
    public void setAdresse(String adresse){this.adresse=adresse;}
    public Panier getPanier(){return panier;}
}
