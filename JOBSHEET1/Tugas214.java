package JOBSHEET1;

import java.util.Scanner;

public class Tugas214 {
    public static void Menu() {
        System.out.println("===================================");
        System.out.println("Program untuk Menghitung Kubus");
        System.out.println("===================================");
        System.out.println("1. Hitung Volume Kubus");
        System.out.println("2. Hitung Luas Permukaan Kubus");
        System.out.println("3. Hitung Keliling Kubus");
        System.out.println("4. Keluar");
        System.out.print("Pilih menu (1-4): ");
    }
    public static double VolumeKubus14(double sisi14) {
        return Math.pow(sisi14, 3);
    }
    public static double LuasPermukaanKubus14(double sisi14) {
        return 6 * Math.pow(sisi14, 2);
    }
    public static double KelilingKubus14(double sisi14) {
        return 12 * sisi14;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilih;
        double sisi14;

        do {
            Menu();
            pilih = sc.nextInt();

            if (pilih >= 1 && pilih <= 3) {
                System.out.print("Masukkan panjang sisi kubus: ");
                sisi14 = sc.nextDouble();
            } else if (pilih == 4) {
                System.out.println("Terima kasih! Program selesai.");
                break;
            } else {
                System.out.println("Pilihan angka tidak valid. Silakan coba lagi.");
                continue;
            }

            switch (pilih) {
                case 1:
                    double volume = VolumeKubus14(sisi14);
                    System.out.printf("Volume kubus: %.2f\n", volume);
                    break;
                case 2:
                    double luasPermukaan = LuasPermukaanKubus14(sisi14);
                    System.out.printf("Luas permukaan kubus: %.2f\n", luasPermukaan);
                    break;
                case 3:
                    double keliling = KelilingKubus14(sisi14);
                    System.out.printf("Keliling kubus: %.2f\n", keliling);
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }

            System.out.println(); 
        } while (true);

        sc.close();
    }
}
