package L_1;

 public class PC {
    private int cpu=1;
    private int memory;
    private String model;

    public PC(int cpu, int memory, String model) {
        this.cpu = cpu;
        this.memory = memory;
        this.model = model;
    }

    public int getCpu() {
        System.out.println(cpu);
        return cpu;
    }

    public void setCpu(int cpu) {
        this.cpu = cpu;
         }

    public int getMemory() {
        System.out.println(memory);
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public String getModel() {
        System.out.println(model);
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }



}
