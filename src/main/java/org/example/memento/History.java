package org.example.memento;

import java.util.Stack;

public class History {

    private final Stack<Memento> history = new Stack<>();

    public void save(Editor editor) {
        history.push(editor.save());
    }

    public void undo(Editor editor) {
        if (!history.isEmpty()) {
            editor.restore(history.pop());
        } else {
            System.out.println("No states to undo.");
        }
    }

    @Override
    public String toString() {
        return "History{" +
                "history=" + history +
                '}';
    }
}
