package Punto1.DisplayPackage;

import Punto1.ObserverPackage.Observer;
import Punto1.SubjectPackage.Subject;

public class WebMasterDisplay implements Observer, DisplayElement {
    private String mensaje;
    private Subject ofertaCursos;

    public WebMasterDisplay(Subject ofertaCursos) {
        this.ofertaCursos = ofertaCursos;
        ofertaCursos.registerObserver(this);
    }

    @Override
    public void update(String mensaje) {
        this.mensaje = mensaje;
        display();
    }

    @Override
    public void display() {
        System.out.println( "Andrea Mahecha (Webmaster) esta actualizando el sitio web con la siguiente información:");
        System.out.println( mensaje + "\n");
    }
}