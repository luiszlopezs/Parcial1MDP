package Punto2.FrequencyBehavior;

public class DailyFrequency implements FrequencyBehavior {
    @Override
    public void send(String message) {
        System.out.println("Notificación diaria: " + message);
    }
}