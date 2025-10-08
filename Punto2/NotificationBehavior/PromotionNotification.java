package Punto2.NotificationBehavior;

public class PromotionNotification implements NotificationBehavior {
    @Override
    public void notifyUser(String message) {
        System.out.println("Enviando notificación push: " + message);
    }
}
