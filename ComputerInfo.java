package jp.learningdesign.javastudy;

class Computer {
    public String os;
    public int memory;
    public int storage;
}
public class ComputerInfo {
    public static void main(String[] args) {
        Computer desktop = new Computer();
        desktop.os = System.getProperty("os.name");
        desktop.memory = 512;
        desktop.storage = 1028;

        System.out.println("OS:" + desktop.os);
        System.out.println("Memory:" + desktop.memory);
        System.out.println("Storage:" + desktop.storage);

        Computer desktop2 = desktop;

        desktop2.os = "Ubuntu";

        System.out.println("\nOS:" + desktop2.os);
        System.out.println("Memory:" + desktop2.memory);
        System.out.println("Storage:" + desktop2.storage);

        System.out.println("\nOS:" + desktop.os);
        System.out.println("Memory:" + desktop.memory);
        System.out.println("Storage:" + desktop.storage);
    }
}
