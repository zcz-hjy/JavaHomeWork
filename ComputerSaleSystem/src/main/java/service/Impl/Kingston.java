package service.Impl;

import service.Cpu;
import service.Memory;

public class Kingston implements Memory {
    private String Name = "Kingston";
    private  String volume ="256MB";
    private double price = 800.0;

    public String getName() {
        return Name;
    }

    public String getVolume() {
        return volume;
    }

    public double getPrice() {
        return price;
    }


}
