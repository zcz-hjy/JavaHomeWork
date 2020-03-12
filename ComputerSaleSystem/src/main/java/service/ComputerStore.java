package service;

import service.Impl.*;

public class ComputerStore {
    private Computer computer1 = Computer.getComputer("computer1", 5000.0,"Intel","Seagate","Samsung","Asus");
    private Computer computer2 = Computer.getComputer("computer2", 6000.0,"Amd","WestDigital","Kingston","Gigabyte");
    private Computer computer3 = Computer.getComputer("computer3", 10000.0,"Intel","Seagate","Kingston","Gigabyte");



    public void printComputer(){
        System.out.println("**********************计算机一览表**********************");
        System.out.println("计算机名称: "+computer1.getName()+" 价格 "+computer1.getPrice());
        Intel intel = (Intel)computer1.getCpu();
        Seagate seagate = (Seagate)computer1.getHardDisk();
        Samsung samsung = (Samsung) computer1.getMemory();
        Asus asus = (Asus)computer1.getMotherBoard();
        System.out.printf("CPU: %s\t\t\t\tcoreNum: %s\t\t\t\tprice: %.2f元%n",intel.getName(),intel.getCoreNum(),intel.getPrice());
        System.out.printf("HardDisk: %s\t\tVolume: %s\t\t\tprice: %.2f元%n",seagate.getName(),seagate.getVolume(),seagate.getPrice());
        System.out.printf("Memory: %s\t\t\tVolume: %s\t\t\tprice: %.2f元%n",samsung.getName(),samsung.getVolume(),samsung.getPrice());
        System.out.printf("MotherBoard: %s\t\tspeed: %s\t\tprice: %.2f元%n",asus.getName(),asus.getSpeed(),asus.getPrice());


        System.out.println("计算机名称: "+computer2.getName()+" 价格 "+computer2.getPrice());
        Amd amd = (Amd)computer2.getCpu();
        WestDigital westDigital= (WestDigital)computer2.getHardDisk();
        Kingston kingston= (Kingston) computer2.getMemory();
        Gigabyte gigabyte = (Gigabyte)computer2.getMotherBoard();
        System.out.printf("CPU: %s\t\t\t\tcoreNum: %s\t\t\t\t\tprice: %.2f元%n",amd.getName(),amd.getCoreNum(),amd.getPrice());
        System.out.printf("HardDisk: %s\t\tVolume: %s\t\t\t\tprice: %.2f元%n",westDigital.getName(),westDigital.getVolume(),westDigital.getPrice());
        System.out.printf("Memory: %s\t\t\tVolume: %s\t\t\t\tprice: %.2f元%n",kingston.getName(),kingston.getVolume(),kingston.getPrice());
        System.out.printf("MotherBoard: %s\t\tspeed: %s\t\tprice: %.2f元%n",gigabyte.getName(),gigabyte.getSpeed(),gigabyte.getPrice());

        System.out.println("计算机名称: "+computer3.getName()+" 价格 "+computer3.getPrice());
        Intel intel1 = (Intel)computer3.getCpu();
        Seagate seagate1= (Seagate)computer3.getHardDisk();
        Kingston kingston1= (Kingston) computer3.getMemory();
        Gigabyte gigabyte1 = (Gigabyte)computer3.getMotherBoard();
        System.out.printf("CPU: %s\t\t\t\t\tcoreNum: %s\t\t\t\t\t\tprice: %.2f元%n",intel1.getName(),intel1.getCoreNum(),intel1.getPrice());
        System.out.printf("HardDisk: %s\t\t\tVolume: %s\t\t\t\t\tprice: %.2f元%n",seagate1.getName(),seagate1.getVolume(),seagate1.getPrice());
        System.out.printf("Memory: %s\t\t\tVolume: %s\t\t\t\t\tprice: %.2f元%n",kingston1.getName(),kingston1.getVolume(),kingston1.getPrice());
        System.out.printf("MotherBoard: %s\t\tspeed: %s\t\t\tprice: %.2f元%n",gigabyte1.getName(),gigabyte1.getSpeed(),gigabyte1.getPrice());


    }

    public static void main(String[] args) {
       /* new ComputerStore().printComputer();*/
      new ComputerStore().printComputer();

    }
}
