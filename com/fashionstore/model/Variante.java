package com.fashionstore.model;
public class Variante {
    private String sku,taille,couleur;
    public Variante(String sku,String taille,String couleur){this.sku=sku;this.taille=taille;this.couleur=couleur;}
    public String getSku(){return sku;} public String getTaille(){return taille;}
    public String getCouleur(){return couleur;}
}
