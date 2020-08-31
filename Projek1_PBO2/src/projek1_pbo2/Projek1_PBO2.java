package projek1_pbo2;

import java.util.Scanner;

public class Projek1_PBO2 {

    public static void main(String[] args) {
        Scanner kal = new Scanner(System.in);
        double bil1, bil2, hasil;
        System.out.print("Bilangan ke-1 : ");
        bil1 = kal.nextDouble();
        System.out.print("Bilangan ke-2 : ");
        bil2 = kal.nextDouble();
        System.out.println("");
        hasil = bil1 + bil2;
        System.out.println(bil1+" + "+bil2);
        System.out.println("    =    ");
        System.out.println("   "+hasil);
    }

}
