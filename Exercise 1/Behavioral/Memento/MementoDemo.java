package Behavioral.Memento;

public class MementoDemo {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        History history = new History();

        editor.type("Hello ");
        history.push(editor.save()); // Save state

        editor.type("World!");
        System.out.println(editor.getText()); // Hello World!

        editor.restore(history.pop()); // Restore previous state
        System.out.println(editor.getText()); // Hello
    }
}
