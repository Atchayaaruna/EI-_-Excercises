package Creational.Prototype;

public class Warrior implements GameCharacter{
    private String weapon;
    public Warrior(String weapon){
       this.weapon=weapon;
    }
    public GameCharacter clone(){
        return new Warrior(this.weapon);
    }
    public void display(){
        System.out.println("Warrior with " + weapon);
    }
}
