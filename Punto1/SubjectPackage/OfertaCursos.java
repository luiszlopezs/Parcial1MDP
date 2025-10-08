package Punto1.SubjectPackage;

import java.util.ArrayList;
import java.util.List;

import Punto1.ObserverPackage.Observer;

public class OfertaCursos implements Subject {

    private List<Observer> listaObservadores;
    private List<String> listaCursos;

    public OfertaCursos() {
        this.listaObservadores = new ArrayList<>();
        this.listaCursos  = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observ) {
        listaObservadores.add(observ);
    }

    @Override
    public void removeObserver(Observer observ) {
        listaObservadores.remove(observ);
    }

    @Override
    public void notifyObservers(String mensaje) {
        for (Observer o : listaObservadores) {
            o.update(mensaje);
        }
    }

    public void agregarCurso(String curso) {
        listaCursos.add(curso);
        notifyObservers("Nuevo curso agregado: " + curso);
    }

    public void eliminarCurso(String curso){
        listaCursos.remove(curso);
        notifyObservers("El curso " + curso + " ha sido eliminado");
    }

    public void actualizarCurso(String cursoViejo, String cursoNuevo){
       for (int i = 0; i < listaCursos.size(); i++) {
           if(listaCursos.get(i) == cursoViejo){
               listaCursos.set(i, cursoNuevo);
               notifyObservers("El curso " + cursoViejo + " ha sido actualizado a: " + cursoNuevo);
           }
       }
    }

    public List<String> obtenerTodosLosCursos(){
        return listaCursos;
    }



}