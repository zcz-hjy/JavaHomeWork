package service;



public class Computer {
    private String Name;
    private double price;
    private Cpu cpu;
    private HardDisk hardDisk;
    private Memory memory;
    private MotherBoard motherBoard;

    private Computer(String name, double price,String cpu, String hardDisk,String memory,String motherBoard){
        this.cpu = (Cpu) BeanFactory.getBean(cpu);
        this.hardDisk = (HardDisk) BeanFactory.getBean(hardDisk);
        this.memory = (Memory) BeanFactory.getBean(memory);
        this.motherBoard = (MotherBoard) BeanFactory.getBean(motherBoard);
        this.Name = name;
        this.price = price;
    }

    public String getName() {
        return Name;
    }

    public double getPrice() {
        return price;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public HardDisk getHardDisk() {
        return hardDisk;
    }

    public Memory getMemory() {
        return memory;
    }

    public MotherBoard getMotherBoard() {
        return motherBoard;
    }

    public static Computer getComputer(String name, double price, String cpu, String hardDisk, String memory, String motherBoard){
        return new Computer(name,price,cpu,hardDisk,memory,motherBoard);
    }

    public String toString() {
        return "Computer{" +
                "Name='" + Name + '\'' +
                ", price=" + price +
                ", cpu=" + cpu +
                ", hardDisk=" + hardDisk +
                ", memory=" + memory +
                ", motherBoard=" + motherBoard +
                '}';
    }
}
