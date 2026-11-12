package com.fashionstore.service;
import com.fashionstore.model.*;
public class ServiceStock {
    private DepotStock depot; private ServiceNotification notifications;
    public ServiceStock(DepotStock d,ServiceNotification n){depot=d;notifications=n;}
    public void entree(Variante v,int q){depot.ajouterStock(v,q);notifications.envoyer("Admin","Entrée stock : "+v.getSku());}
    public void sortie(Variante v,int q){
        if(!depot.retirerStock(v,q))throw new IllegalStateException("Stock insuffisant");
        notifications.envoyer("Admin","Sortie stock : "+v.getSku());
        if(depot.consulterStock(v.getSku())==0)notifications.envoyer("Admin","Rupture : "+v.getSku());
    }
}
