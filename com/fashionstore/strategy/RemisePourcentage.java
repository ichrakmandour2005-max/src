package com.fashionstore.strategy;
public class RemisePourcentage implements StrategiePrix {
    private double pourcentage;
    public RemisePourcentage(double p){if(p<0||p>100)throw new IllegalArgumentException();pourcentage=p;}
    public double calculerPrix(double montant){return montant-(montant*pourcentage/100);}
}
