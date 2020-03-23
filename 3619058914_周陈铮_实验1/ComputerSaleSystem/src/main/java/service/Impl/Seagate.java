package service.Impl;

import service.HardDisk;
import service.Memory;

public class Seagate implements HardDisk {
    private String Name = "Seagate";
    private  String volume ="100Gb";
    private double price = 500.0;

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
