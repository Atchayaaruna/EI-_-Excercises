package Structural.Composite;

public class CompositeDemo {
    public static void main(String[] args) {
        Developer d1 = new Developer("Alice");
        Developer d2 = new Developer("Bob");

        Manager m1 = new Manager("Charlie");
        m1.add(d1);
        m1.add(d2);

        m1.showDetails();
    }
}
