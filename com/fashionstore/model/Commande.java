package com.fashionstore.model;
import java.time.LocalDate;
public class Commande {
    private int numero; private Client client; private String statut="CRÉÉE",statutLivraison="NON AFFECTÉE";
    private LocalDate dateArriveeEstimee;
    public Commande(int numero,Client client){this.numero=numero;this.client=client;}
    public int getNumero(){return numero;} public Client getClient(){return client;}
    public String getStatut(){return statut;} public void setStatut(String s){statut=s;}
    public String getStatutLivraison(){return statutLivraison;}
    public void setStatutLivraison(String s){statutLivraison=s;}
    public LocalDate getDateArriveeEstimee(){return dateArriveeEstimee;}
    public void setDateArriveeEstimee(LocalDate d){dateArriveeEstimee=d;}
}
