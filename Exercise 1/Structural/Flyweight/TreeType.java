package Structural.Flyweight;
class TreeType {
    private String name, color;
    public TreeType(String name, String color) { 
        this.name = name; 
        this.color = color; 
    }
    public void draw(int x, int y) {
        System.out.println("Drawing " + name + " tree in " + color + " at (" + x + "," + y + ")");
    }
}
