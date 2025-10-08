package Punto2.NotificationBehavior;


public class EmailNotification implements NotificationBehavior {
    @Override
    public void notifyUser(String message) {
        System.out.println("eEnviando el correo: " + message);
    }
}
