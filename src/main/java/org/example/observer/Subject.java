package org.example.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private final List<Observer> observerList = new ArrayList<>();

    public void attach(Observer observer) {
        observerList.add(observer);
    }

    public void detach(Observer observer) {
        observerList.remove(observer);
    }

    protected void notifyAllObserver(String subjectName, Object newState) {
        observerList.forEach(observer -> observer.update(subjectName, newState));
    }
}
