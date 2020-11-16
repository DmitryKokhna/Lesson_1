package L_1;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        PC nonamePC=new PC();
        Scanner sc=new Scanner(System.in);
        System.out.println("Введи ПРОЦ");
         nonamePC.cpu=sc.nextInt();
        System.out.print(" Введенное значение = " + nonamePC.cpu);

    }
}
