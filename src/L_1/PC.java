package L_1;

import java.util.Scanner;

public class PC {
    public int getCpu() {
        return cpu;
    }

    public void setCpu(int cpu) {
        this.cpu = cpu;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    private int cpu;
    private int memory;
    private String model;

    public PC(int cpu, int memory) {
        this.cpu = cpu;
        this.memory = memory;
    }

    public PC(int cpu, int memory, String model) {
        this.cpu = cpu;
        this.memory = memory;
        this.model = model;
    }
//   void cpuINTO(){
//
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Введи ПРОЦ");
//        int scCpu=sc.nextInt();
//    }

}
