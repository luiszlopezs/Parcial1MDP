package Punto1.DisplayPackage;

import Punto1.ObserverPackage.Observer;
import Punto1.SubjectPackage.Subject;

public class PeriodistaDisplay implements Observer, DisplayElement {

    private String mensaje;
    private Subject ofertaCursos;

    public PeriodistaDisplay(Subject ofertaCursos) {
        this.ofertaCursos = ofertaCursos;
        this.ofertaCursos.registerObserver(this);

    }

    @Override
    public void update(String mensaje) {
        this.mensaje = mensaje;
        display();
    }

    @Override
    public void display() {
        System.out.println("Spot Publicitario Radial, by Luz Dary Valera");
        System.out.println(mensaje);

    }

    public void dejarDeRecibirNotificaciones() {
        ofertaCursos.removeObserver(this);
        System.out.println("El periodista ha dejado de recibir notificaciones.");
    }
}
