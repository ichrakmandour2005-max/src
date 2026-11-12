package com.fashionstore.service;
import com.fashionstore.model.Notification; import java.util.ArrayList; import java.util.List;
public class ServiceNotification {
    private List<Notification> notifications=new ArrayList<>();
    public void envoyer(String destinataire,String message){
        Notification n=new Notification(destinataire,message);notifications.add(n);
        System.out.println("Notification pour "+destinataire+" : "+message);
    }
    public List<Notification> getNotifications(){return notifications;}
}
