package com.fashionstore.model;
import java.util.ArrayList; import java.util.List;
public class Produit {
    private int id; private String libelle,description,categorie,image;
    private double prixBase; private List<Variante> variantes=new ArrayList<>();
    public Produit(int id,String libelle,String description,String categorie,double prixBase,String image){
        this.id=id;this.libelle=libelle;this.description=description;this.categorie=categorie;
        setPrixBase(prixBase);this.image=image;
    }
    public int getId(){return id;} public String getLibelle(){return libelle;}
    public String getDescription(){return description;} public String getCategorie(){return categorie;}
    public double getPrixBase(){return prixBase;} public String getImage(){return image;}
    public List<Variante> getVariantes(){return variantes;}
    public void setLibelle(String v){libelle=v;} public void setDescription(String v){description=v;}
    public void setCategorie(String v){categorie=v;} public void setImage(String v){image=v;}
    public void setPrixBase(double v){if(v<0)throw new IllegalArgumentException("Prix invalide");prixBase=v;}
    public void ajouterVariante(Variante v){variantes.add(v);}
}
