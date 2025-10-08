package Punto2.FrequencyBehavior;

public class InstantFrequency implements FrequencyBehavior {
    @Override
    public void send(String message) {
        System.out.println("Notificación instantánea: " + message);
    }
}

