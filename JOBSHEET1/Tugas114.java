package JOBSHEET1;

import java.util.Scanner;

public class Tugas114 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char Kode14[] = { 'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T' };
        char Kota14[][] = {
                { 'B', 'A', 'N', 'T', 'E', 'N' }, { 'J', 'A', 'K', 'A', 'R', 'T', 'A' },
                { 'B', 'A', 'N', 'D', 'U', 'N', 'G' }, { 'C', 'I', 'R', 'E', 'B', 'O', 'N' },
                { 'B', 'O', 'G', 'O', 'R' }, { 'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N' },
                { 'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G' }, { 'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A' },
                { 'M', 'A', 'L', 'A', 'N', 'G' }, { 'T', 'E', 'G', 'A', 'L' }
        };

        System.out.print("Masukkan kode plat nomor : ");
        char kode14 = sc.next().toUpperCase().charAt(0);
        boolean kodeDitemukan14 = false;
        int index14 = 0;
        for (int i = 0; i < Kode14.length; i++) {
            if (Kode14[i] == kode14) {
                kodeDitemukan14 = true;
                index14 = i;
                break;
            }
        }

        if (kodeDitemukan14) {
            System.out.print("Kota pencarian kode plat " + kode14 + " adalah : ");
            for (int i = 0; i < Kota14[index14].length; i++) {
                System.out.print(Kota14[index14][i] + "");
            }
        } else {
            System.out.println("Kode plat tidak ditemukan!");
        }
    }
}

