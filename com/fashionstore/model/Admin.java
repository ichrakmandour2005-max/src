package com.fashionstore.model;
public class Admin extends Utilisateur {
    public Admin(int id,String nom,String email,String mdp){super(id,nom,email,mdp);}
    public String getRole(){return "Administrateur";}
    public void ajouterProduit(Produit p){System.out.println("Produit ajouté : "+p.getLibelle());}
    public void modifierProduit(Produit p){System.out.println("Produit modifié : "+p.getLibelle());}
    public void supprimerProduit(Produit p){System.out.println("Produit supprimé : "+p.getLibelle());}
}
