package service.Impl;

import service.Memory;
import service.MotherBoard;

public class Gigabyte implements MotherBoard {
    private String Name = "Gigabyte";
    private String speed = "Gigabyte_speed";
    private double price = 1200.0;


    public String getName() {
        return Name;
    }

    public String getSpeed() {
        return speed;
    }

    public double getPrice() {
        return price;
    }
}
