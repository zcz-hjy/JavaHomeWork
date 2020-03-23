package service.Impl;

import service.Cpu;

public class Amd implements Cpu{
    private String Name = "Amd";
    private String coreNum = "Ryzend";
    private double price = 1000.0;



    public String getName() {
        return Name;
    }

    public String getCoreNum() {
        return coreNum;
    }

    public double getPrice() {
        return price;
    }
}
