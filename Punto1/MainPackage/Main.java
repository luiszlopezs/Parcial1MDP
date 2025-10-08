package Punto1.MainPackage;

import Punto1.DisplayPackage.CommunityManagerDisplay;
import Punto1.DisplayPackage.PeriodistaDisplay;
import Punto1.DisplayPackage.WebMasterDisplay;
import Punto1.SubjectPackage.OfertaCursos;

public class Main {
    public static void main(String[] args) {
        OfertaCursos oferta = new OfertaCursos();

        WebMasterDisplay andrea = new WebMasterDisplay(oferta);
        PeriodistaDisplay luzDary = new PeriodistaDisplay(oferta);
        CommunityManagerDisplay laura = new CommunityManagerDisplay(oferta);

        System.out.println("---- Sistema de Notificaciones de cursos----\n");
        oferta.agregarCurso("cursos de programación en Java");
        oferta.agregarCurso("curso de python");
        oferta.agregarCurso("curso de c++");
        oferta.actualizarCurso("curso de c++", "curso de c++ avanzado");
        oferta.eliminarCurso("curso de python");
    }
}
