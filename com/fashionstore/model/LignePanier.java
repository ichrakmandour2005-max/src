package com.fashionstore.model;
public class LignePanier {
    private Produit produit; private Variante variante; private int quantite;
    public LignePanier(Produit p,Variante v,int q){if(q<=0)throw new IllegalArgumentException("Quantité invalide");produit=p;variante=v;quantite=q;}
    public Variante getVariante(){return variante;} public int getQuantite(){return quantite;}
    public double getSousTotal(){return produit.getPrixBase()*quantite;}
}
