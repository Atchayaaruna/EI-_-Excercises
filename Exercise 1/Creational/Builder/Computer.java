package Creational.Builder;

public final class Computer {
     private final String CPU;
     private final String RAM;
     private final String Storage;
     public Computer(String CPU,String RAM,String Storage){
        this.CPU=CPU;
        this.RAM=RAM;
        this.Storage=Storage;
     }
     public String toString(){
        return CPU + "," + RAM + "," + Storage;
     }
}
