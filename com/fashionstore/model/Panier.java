package com.fashionstore.model;
import java.util.ArrayList; import java.util.List;
public class Panier {
    private List<LignePanier> lignes=new ArrayList<>();
    public void ajouterProduit(Produit p,Variante v,int q){lignes.add(new LignePanier(p,v,q));}
    public void supprimerProduit(String sku){lignes.removeIf(l->l.getVariante().getSku().equals(sku));}
    public List<LignePanier> getLignes(){return lignes;}
    public double calculerTotal(){return lignes.stream().mapToDouble(LignePanier::getSousTotal).sum();}
}
