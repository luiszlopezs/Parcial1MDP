package Punto2.Main;

import Punto2.FrequencyBehavior.DailyFrequency;
import Punto2.FrequencyBehavior.InstantFrequency;
import Punto2.FrequencyBehavior.WeeklyFrequency;
import Punto2.NotificationBehavior.EmailNotification;
import Punto2.NotificationBehavior.PromotionNotification;
import Punto2.NotificationBehavior.SMSNotification;

import Punto2.User.User;

public class Main {
    public static void main(String[] args) {

        //usuario 1 con sus asignaciones
        User usuario1 = new User("Laura", new EmailNotification(), new WeeklyFrequency());
        usuario1.display();
        usuario1.performNotification("Tu saldo esta  por debajo de $10.000");
        usuario1.performFrequency("Resumen semanal disponible.");
        //usuario 2 con sus asignaciones
        User usuario2 = new User("Andrés", new SMSNotification(), new DailyFrequency());
        usuario2.display();
        usuario2.performNotification("Transaccion de $50.000 completada.");
        usuario2.performFrequency("tu resumen de transacciones");       
        System.out.println("\n---- Cambio de estrategia para Laura ----");
        //cambio de noticifaciones y de frequeciia de envio
        usuario1.setNotificationBehavior(new PromotionNotification());
        usuario1.setFrequencyBehavior(new InstantFrequency());
        usuario1.performNotification("te han hackeado XD");
        usuario1.performFrequency("Promoción enviada instantaneamente.");
    }
}
