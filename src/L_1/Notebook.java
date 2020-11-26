package L_1;

public class Notebook extends PC {
    int displSize;
    boolean m2YeasNo;


    public Notebook(int cpu, String model, int displSize, boolean m2YeasNo) {
        super(cpu, model);
        this.displSize = displSize;
        this.m2YeasNo = m2YeasNo;
    }

    @Override
    public void printPCttx() {
        super.printPCttx();
    }
}

