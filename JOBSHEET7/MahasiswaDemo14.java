package JOBSHEET7;

import java.util.Scanner;

public class MahasiswaDemo14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = sc.nextInt();
        sc.nextLine();
        MahasiswaBerprestasi14 list = new MahasiswaBerprestasi14(n);

        for (int i = 0; i < n; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1) + ": ");
            System.out.print("NIM: ");
            String nim = sc.nextLine();
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("Kelas: ");
            String kelas = sc.nextLine();
            System.out.print("IPK: ");
            double ipk = sc.nextDouble();
            sc.nextLine();
            System.out.println("----------------------------------");
            Mahasiswa14 m = new Mahasiswa14(nim, nama, kelas, ipk);
            list.tambah(m);
        }
        
        list.tampil14();
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Pencarian data");
        System.out.println("-----------------------------------------------------------------");
        System.out.println("masukkan ipk mahasiswa yang dicari: ");
        System.out.print("IPK: ");
        double cari = sc.nextDouble();

        System.out.println("menggunakan sequential searching");
        double posisi = list.sequentialSearching(cari);
        int pss = (int) posisi;
        list.tampilPosisi14(cari, pss);
        list.tampilDataSearch14(cari, pss);

        System.out.println("-----------------------------------------------------------------");
        System.out.println("Pencarian data");
        System.out.println("-----------------------------------------------------------------");
        System.out.println("masukkan ipk mahasiswa yang dicari: ");
        System.out.print("IPK: ");
        cari = sc.nextDouble();

        System.out.println("--------------------------------");
        System.out.println("menggunakan binary search");
        System.out.println("--------------------------------");
        double posisi2 = list.findBinarySearch14(cari, 0, n-1);
        int pss2 = (int) posisi2;
        list.tampilPosisi14(cari, pss2);
        list.tampilDataSearch14(cari, pss2);
    }
}
