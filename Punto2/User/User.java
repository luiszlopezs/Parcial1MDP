package Punto2.User;

import Punto2.FrequencyBehavior.FrequencyBehavior;
import Punto2.NotificationBehavior.NotificationBehavior;



public class User {
    private String nombre;
    private NotificationBehavior notificationBehavior;
    private FrequencyBehavior frequencyBehavior;

    public User(String nombre, NotificationBehavior nb, FrequencyBehavior fb) {
        this.nombre = nombre;
        this.notificationBehavior = nb;
        this.frequencyBehavior = fb;
    }

    public void setNotificationBehavior(NotificationBehavior nb) {
        this.notificationBehavior = nb;
    }

    public void setFrequencyBehavior(FrequencyBehavior fb) {
        this.frequencyBehavior = fb;
    }

    public void performNotification(String mensaje) {
        notificationBehavior.notifyUser(mensaje);
    }

    public void performFrequency(String mensaje) {
        frequencyBehavior.send(mensaje);
    }

    public void display() {
        System.out.println("\n Usuario: " + nombre);
    }
}