package JOBSHEET5;

import java.util.Scanner;

public class FaktorialMain14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai: ");
        int nilai = sc.nextInt();

        Faktorial14 fk = new Faktorial14();
        System.out.println("Nilai faktorial " + nilai + " menggunakan BF: " + fk.faktorialBF(nilai));
        System.out.println("Nilai faktorial " + nilai + " menngunakan DC: " + fk.faktorialDC(nilai));
    }
}
