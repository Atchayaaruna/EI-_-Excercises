package Structural.Flyweight;
public class FlyweightDemo {
    public static void main(String[] args) {
        TreeType oak = TreeFactory.getTreeType("Oak", "Green");
        oak.draw(10, 20);

        TreeType oak2 = TreeFactory.getTreeType("Oak", "Green");
        oak2.draw(30, 40); // reused
    }
}

