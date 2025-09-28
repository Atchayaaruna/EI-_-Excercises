package Creational.Builder;

public class ComputerBuilder {
    private String CPU;
    private String RAM;
    private String Storage;

    public ComputerBuilder setCPU(String CPU){
         this.CPU=CPU;
         return this;
    }
    public ComputerBuilder setRAM(String RAM){
         this.RAM=RAM;
         return this;
    }
    public ComputerBuilder setStorage(String Storage){
         this.Storage=Storage;
         return this;
    }
    public Computer build(){
        return new Computer(CPU,RAM,Storage);
    }
}
