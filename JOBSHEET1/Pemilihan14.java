package JOBSHEET1;

import java.util.Scanner;

public class Pemilihan14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double tugas14, kuis14, uts14, uas14; 

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==============================");

        System.out.print("Masukkan nilai tugas : ");
        tugas14 = sc.nextDouble();
        System.out.print("Masukkan nilai kuis : ");
        kuis14 = sc.nextDouble();
        System.out.print("Masukkan nilai uts : ");
        uts14 = sc.nextDouble();
        System.out.print("Masukkan nilai uas : ");
        uas14 = sc.nextDouble();
        System.out.println("==============================");

        if (!isValid(tugas14) || !isValid(kuis14) || !isValid(uts14) || !isValid(uas14)) {
            System.out.println("============================");
            System.out.println("Nilai tidak valid");
            System.out.println("============================");
        } else {
            double nilaiAkhir14 = 0.2 * tugas14 + 0.2 * kuis14 + 0.3 * uts14 + 0.4 * uas14;

            String nilaiHuruf;
            if (nilaiAkhir14 >= 80) {
                nilaiHuruf = "A";
            } else if (nilaiAkhir14 >= 73) {
                nilaiHuruf = "B+";
            } else if (nilaiAkhir14 >= 65) {
                nilaiHuruf = "B";
            } else if (nilaiAkhir14 >= 60) {
                nilaiHuruf = "C+";
            } else if (nilaiAkhir14 >= 50) {
                nilaiHuruf = "C";
            } else if (nilaiAkhir14 >= 39) {
                nilaiHuruf = "D";
            } else {
                nilaiHuruf = "E";
            }

            String keterangan = nilaiHuruf.equals("D") || nilaiHuruf.equals("E") ? "ANDA TIDAK LULUS" : "SELAMAT ANDA LULUS";

            System.out.println("============================");
            System.out.println("Nilai Akhir: " + nilaiAkhir14);
            System.out.println("Nilai Huruf: " + nilaiHuruf);
            System.out.println("============================");
            System.out.println("============================");
            System.out.println(keterangan);
        }
        sc.close();
    }

    public static boolean isValid(double nilai) {
        return nilai >= 0 && nilai <= 100;
    }
}
