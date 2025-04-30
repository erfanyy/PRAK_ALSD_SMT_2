package JOBSHEET1;

import java.util.Scanner;

public class Tugas314 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mata kuliah: ");
        int n14 = sc.nextInt();
        sc.nextLine(); 

        String[] namaMatkul14 = new String[n14];
        int[] sks14 = new int[n14];
        int[] semester14 = new int[n14];
        String[] hariKuliah14 = new String[n14];

        for (int i = 0; i < n14; i++) {
            System.out.println("Mata Kuliah ke-" + (i + 1) + ":");
            System.out.print("Nama Mata Kuliah: ");
            namaMatkul14[i] = sc.nextLine();
            System.out.print("SKS: ");
            sks14[i] = sc.nextInt();
            System.out.print("Semester: ");
            semester14[i] = sc.nextInt();
            sc.nextLine(); 
            System.out.print("Hari Kuliah: ");
            hariKuliah14[i] = sc.nextLine();
        }

        int pilih;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tampilkan seluruh jadwal kuliah");
            System.out.println("2. Tampilkan jadwal kuliah berdasarkan hari tertentu");
            System.out.println("3. Tampilkan jadwal kuliah berdasarkan semester tertentu");
            System.out.println("4. Mencari mata kuliah berdasarkan nama");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    tampilkanJadwal14(namaMatkul14, sks14, semester14, hariKuliah14);
                    break;
                case 2:
                    System.out.print("Masukkan hari kuliah yang ingin ditampilkan: ");
                    String hari14 = sc.nextLine();
                    tampilkanJadwalBerdasarkanHari14(namaMatkul14, sks14, semester14, hariKuliah14, hari14);
                    break;
                case 3:
                    System.out.print("Masukkan semester yang ingin ditampilkan: ");
                    int sem14 = sc.nextInt();
                    tampilkanJadwalBerdasarkansemester14(namaMatkul14, sks14, semester14, hariKuliah14, sem14);
                    break;
                case 4:
                    System.out.print("Masukkan nama mata kuliah yang dicari: ");
                    String namaDicari14 = sc.nextLine();
                    cariMataKuliah14(namaMatkul14, sks14, semester14, hariKuliah14, namaDicari14);
                    break;
                case 5:
                    System.out.println("Terima kasih! Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilih != 5);

        sc.close();
    }

    public static void tampilkanJadwal14(String[] namaMatkul14, int[] sks14, int[] semester14, String[] hariKuliah14) {
        System.out.println("\nJadwal Kuliah:");
        System.out.printf("%-30s %-5s %-10s %-10s\n", "Nama Mata Kuliah", "sks", "semester", "Hari");
        for (int i = 0; i < namaMatkul14.length; i++) {
            System.out.printf("%-30s %-5d %-10d %-10s\n", namaMatkul14[i], sks14[i], semester14[i], hariKuliah14[i]);
        }
    }

    public static void tampilkanJadwalBerdasarkanHari14(String[] namaMatkul14, int[] sks14, int[] semester14, String[] hariKuliah14, String hari) {
        System.out.println("\nJadwal Kuliah Hari " + hari + ":");
        System.out.printf("%-30s %-5s %-10s %-10s\n", "Nama Mata Kuliah", "sks", "semester", "Hari");
        boolean found = false;
        for (int i = 0; i < hariKuliah14.length; i++) {
            if (hariKuliah14[i].equalsIgnoreCase(hari)) {
                System.out.printf("%-30s %-5d %-10d %-10s\n", namaMatkul14[i], sks14[i], semester14[i], hariKuliah14[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Tidak ada jadwal kuliah pada hari " + hari + ".");
        }
    }

    public static void tampilkanJadwalBerdasarkansemester14(String[] namaMatkul14, int[] sks14, int[] semester14, String[] hariKuliah14, int sem) {
        System.out.println("\nJadwal Kuliah semester " + sem + ":");
        System.out.printf("%-30s %-5s %-10s %-10s\n", "Nama Mata Kuliah", "sks", "semester", "Hari");
        boolean found = false;
        for (int i = 0; i < semester14.length; i++) {
            if (semester14[i] == sem) {
                System.out.printf("%-30s %-5d %-10d %-10s\n", namaMatkul14[i], sks14[i], semester14[i], hariKuliah14[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Tidak ada jadwal kuliah untuk semester " + sem + ".");
        }
    }

    public static void cariMataKuliah14(String[] namaMatkul14, int[] sks14, int[] semester14, String[] hariKuliah14, String namaDicari) {
        boolean found = false;
        for (int i = 0; i < namaMatkul14.length; i++) {
            if (namaMatkul14[i].equalsIgnoreCase(namaDicari)) {
                System.out.printf("Mata Kuliah Ditemukan: %s, sks: %d, semester: %d, Hari: %s\n", 
                                  namaMatkul14[i], sks14[i], semester14[i], hariKuliah14[i]);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Mata kuliah dengan nama " + namaDicari + " tidak ditemukan.");
        }
    }
}
