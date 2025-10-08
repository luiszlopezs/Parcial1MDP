package Punto1.SubjectPackage;

import Punto1.ObserverPackage.Observer;

public interface Subject {
    void registerObserver(Observer observ);

    void removeObserver(Observer observ);

    void notifyObservers(String mensaje);
}