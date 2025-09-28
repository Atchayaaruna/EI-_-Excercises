package Creational.Prototype;

public class PrototypeDemo {
    public static void main(String[] args){
        Warrior w1=new Warrior("Sword");
        Warrior w2=(Warrior) w1.clone();
        w2.display();
    }
}
