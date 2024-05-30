package org.example.observer;

public interface Observer {
    void update(String subjectName, Object newState);
}
