package service;

public interface Cpu {
    default public void work(){
        System.out.println("cpu work");
    }
}
