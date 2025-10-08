package Punto1.DisplayPackage;
import Punto1.SubjectPackage.Subject;
import Punto1.ObserverPackage.Observer;

public class CommunityManagerDisplay implements Observer, DisplayElement {
    private String mensaje;
    private Subject ofertaCursos;

    public CommunityManagerDisplay(Subject ofertaCursos) {
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
        System.out.println("Nuevo post en redes sociales - by Laura Molano:");
        System.out.println(mensaje + "\n");
    }
}