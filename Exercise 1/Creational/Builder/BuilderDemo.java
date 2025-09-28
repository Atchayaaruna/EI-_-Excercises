package Creational.Builder;

public class BuilderDemo {
    public static void main(String[] args){
        Computer gamingpc=new ComputerBuilder()
                        .setCPU("Intel i6")
                        .setRAM("32 GB")
                        .setStorage("1TB SSD")
                        .build();
        System.out.println("Built "+ gamingpc );
    }
}
