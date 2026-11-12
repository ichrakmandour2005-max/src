package com.fashionstore.model;
public abstract class Utilisateur {
    private int id;
    private String nom, email, motDePasse;
    public Utilisateur(int id, String nom, String email, String motDePasse) {
        this.id=id; this.nom=nom; this.email=email; this.motDePasse=motDePasse;
    }
    public int getId(){return id;} public String getNom(){return nom;}
    public String getEmail(){return email;}
    public void setNom(String nom){this.nom=nom;}
    public void setEmail(String email){this.email=email;}
    public void setMotDePasse(String motDePasse){this.motDePasse=motDePasse;}
    public abstract String getRole();
}
