package service;

public interface MotherBoard {
    default  public void work(){
        System.out.println("motherboard work");
    }
}
