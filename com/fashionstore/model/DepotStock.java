package com.fashionstore.model;
import java.util.HashMap;
import java.util.Map;
public class DepotStock {
    private String nom; private Map<String,Integer> quantites=new HashMap<>();
    public DepotStock(String nom){this.nom=nom;}
    public String getNom(){return nom;}
    public int consulterStock(String sku){return quantites.getOrDefault(sku,0);}
    public void ajouterStock(Variante v,int q){
        if(q<=0)throw new IllegalArgumentException("Quantité invalide");
        quantites.merge(v.getSku(),q,Integer::sum);
    }
    public boolean retirerStock(Variante v,int q){
        if(q<=0 || consulterStock(v.getSku())<q)return false;
        quantites.put(v.getSku(),consulterStock(v.getSku())-q); return true;
    }
}
