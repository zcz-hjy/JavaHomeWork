package service.Impl;

import service.MotherBoard;

public class Asus implements MotherBoard {
    private String Name = "Asus";
    private String speed = "Asus_speed";
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
