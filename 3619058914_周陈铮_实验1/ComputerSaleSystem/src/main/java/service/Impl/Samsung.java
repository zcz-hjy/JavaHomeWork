package service.Impl;

import service.Memory;

import java.util.Map;

public class Samsung implements Memory {
    private String Name = "Samsung";
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
