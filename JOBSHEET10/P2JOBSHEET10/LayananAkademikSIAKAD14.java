package JOBSHEET10.P2JOBSHEET10;
import java.util.Scanner;
public class LayananAkademikSIAKAD14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianLayanan14 antrian = new AntrianLayanan14(5);
        int pilihan;
        do{
            System.out.println("\n=== Menu Antrian Layanan Akademik ===");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Layani Mahasiswa");
            System.out.println("3. Lihat Mahasiswa Terdepan");
            System.out.println("4. Lihat Semua Antrian");
            System.out.println("5. Jumlah Mahasiswa dalam Antrian");
            System.out.println("6. Lihat Mahasiswa Belakang");
            System.out.println("0. Keluar");
            System.out.print("Pilih Menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();
            switch (pilihan){
                case 1:
                System.out.print("NIM   : ");
                String nim = sc.nextLine();
                System.out.print("Nama  : ");
                String nama = sc.nextLine();
                System.out.print("Prodi : ");
                String prodi = sc.nextLine();
                System.out.print("Kelas : ");
                String kelas = sc.nextLine();
                Mahasiswa14 mhs = new Mahasiswa14(nim, nama, prodi, kelas);
                antrian.tambahAntrian(mhs);
                break;
                case 2:
                Mahasiswa14 dilayani = antrian.layaniMahasiswa();
                if(dilayani != null) {
                    System.out.print("Melayani Mahasiswa: ");
                    dilayani.tampilkanData();
                }
                break;
                case 3:
                antrian.lihatTerdepan();
                break;
                case 4:
                antrian.tampilkanSemua();
                break;
                case 5:
                System.out.println("Jumlah dalam antrian: " + antrian.getJumlahAntrian());
                break;
                case 6:
                antrian.lihatAkhir();
                case 0:
                System.out.println("Terima Kasih.");
                break;
                default:
                System.out.println("Pilihan tidak Valid");

            }
        }while (pilihan !=0);
        sc.close();
    }
}
