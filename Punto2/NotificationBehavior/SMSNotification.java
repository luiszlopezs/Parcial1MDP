package Punto2.NotificationBehavior;

public class SMSNotification implements NotificationBehavior {
    @Override
    public void notifyUser(String message) {
        System.out.println(" Enviando el SMS: " + message);
    }
}