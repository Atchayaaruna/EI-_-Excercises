package Behavioral.Memento;

import java.util.Stack;

// Caretaker — keeps track of mementos
public class History {
    private final Stack<TextMemento> history = new Stack<>();

    public void push(TextMemento m) {
        history.push(m);
    }

    public TextMemento pop() {
        return history.pop();
    }
}

