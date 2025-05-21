package JOBSHEET8;

import java.util.Scanner;

public class SiakadDemo14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataSiakad14 siakad = new DataSiakad14 (); 
        int pilihan;
        do {
            System.out.println("\n=== MENU SISTEM AKADEMIK ===");
            System.out.println("1. Tampilkan Data Mahasiswa              ");
            System.out.println("2. Tampilkan Data Mata Kuliah            ");
            System.out.println("3. Tampilkan Data Nilai                  ");
            System.out.println("4. Urutkan Data Berdasarkan Nilai Akhir  ");
            System.out.println("5. Cari Data Mahasiswa Berdasarkan NIM   ");
            System.out.println("0. Keluar                                ");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    siakad.tampilMahasiswa14();
                    break;
                case 2:
                    siakad.tampilMataKuliah14();
                    break;
                case 3:
                    siakad.tampilNilai14();
                    break;
                case 4:
                    siakad.urutkanNilai14();
                    System.out.println("\nData telah diurutkan berdasarkan nilai akhir (tertinggi ke terendah)");
                    siakad.tampilNilai14();
                    break;
                case 5:
                    System.out.print("\nMasukkan NIM mahasiswa yang dicari: ");
                    String nim = sc.nextLine();
                    siakad.cariMahasiswaNIM(nim);
                    break;
                case 0:
                    System.out.println("\nTerima kasih telah menggunakan program Sistem Akademik Nilai!");
                    break;
                default:
                    System.out.println("\nPilihan tidak valid. Silakan pilih menu yang tersedia!");
            }
        } while (pilihan != 0);
        sc.close();
    }
}
