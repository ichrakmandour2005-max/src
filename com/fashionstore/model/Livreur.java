package com.fashionstore.model;
public class Livreur extends Utilisateur {
    private String telephone;
    public Livreur(int id,String nom,String email,String mdp,String telephone){
        super(id,nom,email,mdp); this.telephone=telephone;
    }
    public String getRole(){return "Livreur";}
    public String getTelephone(){return telephone;}
    public void setTelephone(String telephone){this.telephone=telephone;}
    public void mettreAJourStatut(Commande c,String statut){c.setStatutLivraison(statut);}
}
