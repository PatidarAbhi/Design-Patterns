package org.example.memento;

public class Memento {

    private String state;


    public String getState() {
        return state;
    }

    public Memento(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Memento{" +
                "state='" + state + '\'' +
                '}';
    }
}

