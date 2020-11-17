package L_1;

public class Main {

    public static void main(String[] args) {

        PC nonamePC=new PC(2000,16,"d");
        nonamePC.getCpu();
        nonamePC.setCpu(3500);
nonamePC.setMemory(16);
nonamePC.setModel("Dell");
nonamePC.getCpu();
        int q= nonamePC.getModel().length();
        System.out.println(q);



    }
}
