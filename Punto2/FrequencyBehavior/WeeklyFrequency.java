package Punto2.FrequencyBehavior;

public class WeeklyFrequency implements FrequencyBehavior {
    @Override
    public void send(String message) {
        System.out.println("Notificación semanal: " + message);
    }
}
