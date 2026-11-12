package com.fashionstore.service;
import com.fashionstore.model.*; import java.time.LocalDate;
public class ServiceCommande {
    private int prochainNumero=1; private ServiceNotification notifications;
    public ServiceCommande(ServiceNotification n){notifications=n;}
    public Commande creerCommande(Client c){
        Commande commande=new Commande(prochainNumero++,c);
        notifications.envoyer(c.getEmail(),"Commande "+commande.getNumero()+" créée");
        return commande;
    }
    public void notifierDateArrivee(Commande c,LocalDate date){
        c.setDateArriveeEstimee(date);
        notifications.envoyer(c.getClient().getEmail(),"Arrivée estimée : "+date);
    }
}
