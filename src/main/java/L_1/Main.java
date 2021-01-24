package L_1;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        PC firstPC = new PC();

        Scanner sc=new Scanner(System.in);
        int z=sc.nextInt();
        firstPC.setCpu(z);
        firstPC.printPCttx();
        Notebook firstNote = new Notebook(3500, "Lenovo", 15);
        firstNote.printPCttx();
        //PC.battery =6200;
        int a = firstPC.getCpu();
        int b = firstNote.getCpu();
        System.out.println(a);
        System.out.println(b);
        System.out.println("Проц  ПК " + firstPC.getCpu());


        //   PC.battery=1000;
        //  System.out.println(PC.battery);
        //  System.out.println(PC.BoostBatt());

        }
    }
