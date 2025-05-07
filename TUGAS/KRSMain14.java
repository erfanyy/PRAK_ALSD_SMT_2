package JOBSHEET10.TUGAS;

import java.util.Scanner;

public class KRSMain14 {
    public static void main(String[] args) {
        Scanner erpan = new Scanner(System.in);
        AntrianKRS14 antrian = new AntrianKRS14(10);
        int pilih;
        do {
            System.out.println("\n===== MENU ANTRIAN KRS =====");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggil Antrian (2 mahasiswa)");
            System.out.println("3. Tampilkan Semua Antrian");
            System.out.println("4. Tampilkan 2 Antrian Terdepan");
            System.out.println("5. Tampilkan Antrian Paling Akhir");
            System.out.println("6. Kosongkan Antrian");
            System.out.println("7. Cetak Jumlah Antrian");
            System.out.println("8. Cetak Jumlah Sudah Proses KRS");
            System.out.println("9. Cetak Jumlah Belum Proses KRS");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = erpan.nextInt();
            erpan.nextLine(); 

            switch (pilih) {
                case 1:
                    System.out.print("NIM: ");
                    String nim = erpan.nextLine();
                    System.out.print("Nama: ");
                    String nama = erpan.nextLine();
                    System.out.print("Prodi: ");
                    String prodi = erpan.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = erpan.nextLine();
                    antrian.enqueue(new Mahasiswa14(nim, nama, prodi, kelas));
                    break;
                case 2:
                    antrian.dequeue();
                    break;
                case 3:
                    antrian.print();
                    break;
                case 4:
                    antrian.printDuaTerdepan();
                    break;
                case 5:
                    antrian.printAkhir();;
                    break;
                case 6:
                    antrian.clear();
                    break;
                case 7:
                    System.out.println("Jumlah antrian saat ini: " + antrian.getTotal());
                    break;
                case 8:
                    System.out.println("Jumlah mahasiswa yang sudah proses KRS: " + antrian.getProcessed());
                    break;
                case 9:
                    System.out.println("Sisa kuota proses KRS: " + antrian.getRemaining());
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia.");
            }

        } while (pilih != 0);
    }
}

    

