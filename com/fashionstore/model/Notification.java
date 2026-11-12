package com.fashionstore.model;
import java.time.LocalDateTime;
public class Notification {
    private String destinataire,message; private LocalDateTime date=LocalDateTime.now();
    public Notification(String destinataire,String message){this.destinataire=destinataire;this.message=message;}
    public String getDestinataire(){return destinataire;} public String getMessage(){return message;}
    public LocalDateTime getDate(){return date;}
}
