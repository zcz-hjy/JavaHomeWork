package service.Impl;

import service.HardDisk;

public class WestDigital implements HardDisk {
    private String Name = " WestDigital";
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
