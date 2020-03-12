package service.Impl;

import service.Cpu;

import javax.naming.Name;

public class Intel implements Cpu {
    private String Name = "Intel";
    private String coreNum = "i5";
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
