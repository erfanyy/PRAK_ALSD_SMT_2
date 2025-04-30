package QUIZ;
import java.util.Scanner;
public class MainBarang14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TransaksiBarang14 transaksi = new TransaksiBarang14();

        transaksi.tambahBarang14(new Barang14("KO1", "SABUN", 5000, 5));
        transaksi.tambahBarang14(new Barang14("KO2", "SAMPO", 2000, 5));
        transaksi.tambahBarang14(new Barang14("KO3", "PASTA GIGI", 2000, 3));
        transaksi.tambahBarang14(new Barang14("KO4", "SIKAT GIGI", 1000, 3));
        transaksi.tambahBarang14(new Barang14("KO5", "SABUN MUKA", 10000, 2));
        
        int pilihan;

        do {
            System.out.println("+++++ MENU +++++");
            System.out.println("1. Tampilkan Barang");
            System.out.println("2. Beli");
            System.out.println("3. Tampilkan Pembelian");
            System.out.println("4. Keluar");
            System.out.print("Pilih 1 - 4: ");
            pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    transaksi.tampikanBarang14();
                    break;
                case 2:
                    System.out.println("Masukkan Kode Barang: ");
                    String kode = sc.next();
                    transaksi.beliBarang14(kode);
                    break;
                case 3:
                    transaksi.tampilkanPembelian14();
                    break;
                case 4:
                    System.out.println("Terima Kasih Sudah Berbelanja");
                    break;
                default:
                System.out.println("Pilihan Tidak Valid");
            }
        }while (pilihan !=4);
        sc.close();
    }
}
