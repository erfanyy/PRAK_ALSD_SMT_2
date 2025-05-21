package JOBSHEET1;

import java.util.Scanner;

public class Perulangan14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nim14;
        int n14;

        System.out.print("Masukkan NIM: ");
        nim14 = sc.nextLine();

        n14= Integer.parseInt(nim14.substring(nim14.length()-2));

        if (n14 < 10) {
            n14 += 10;
        }

        System.out.println("========================");
        System.out.println("N : " + n14);
        System.out.print("");

        for (int i = 1; i <= n14; i++) {
            if (i % 2 != 0) {
                System.out.print("* ");
            } else if (i == 6 || i == 10) {
                continue;
            } else {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}

