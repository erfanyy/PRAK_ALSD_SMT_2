package JOBSHEET3;

import java.util.Scanner;

public class DosenDemo14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah dosen: ");
        int jumlahDosen = sc.nextInt();
        sc.nextLine();
        Dosen14[] arrayOfDosen14 = new Dosen14[jumlahDosen];

        for (int i = 0; i < jumlahDosen; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode         : ");
            String kode = sc.nextLine();
            System.out.print("Nama         : ");
            String nama = sc.nextLine();
            System.out.print("Jenis Kelamin (Pria/Wanita): ");
            String jk = sc.nextLine();
            boolean jenisKelamin = jk.equalsIgnoreCase("Pria");
            System.out.print("Usia         : ");
            int usia = sc.nextInt();
            sc.nextLine(); 
            System.out.println("---------------------------------");

            arrayOfDosen14[i] = new Dosen14(kode, nama, jenisKelamin, usia);
        }

        System.out.println("\nData Dosen yang telah dimasukkan:");
        int index = 0;
        for (Dosen14 dosen : arrayOfDosen14) {
            dosen.cetakInfo14(index);
            index++;
        }

        DataDosen14.dataSemuaDosen(arrayOfDosen14);
        DataDosen14.jumlahDosenPerJenisKelamin(arrayOfDosen14);
        DataDosen14.rerataUsiaDosenPerJenisKelamin(arrayOfDosen14);
        DataDosen14.infoDosenPalingTua(arrayOfDosen14);
        DataDosen14.infoDosenPalingMuda(arrayOfDosen14);

        sc.close();
    }
}
