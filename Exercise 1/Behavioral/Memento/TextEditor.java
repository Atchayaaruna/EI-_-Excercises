package Behavioral.Memento;

// Originator — creates and restores state
public class TextEditor {
    private String text = "";

    public void type(String words) {
        text += words;
    }

    public String getText() {
        return text;
    }

    public TextMemento save() {
        return new TextMemento(text);
    }

    public void restore(TextMemento m) {
        text = m.getState();
    }
}

