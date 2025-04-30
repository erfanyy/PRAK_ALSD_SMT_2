package QUIZ;
public class TransaksiBarang14 {
    Barang14[] barangs = new Barang14[100];
    Barang14[] pembelians = new Barang14[100];
    int jumlahBarang = 0;
    int jumlahPembelian = 0;

    public void tambahBarang14(Barang14 barang) {
        if (jumlahBarang < barangs.length) {
            barangs[jumlahBarang] = barang;
            jumlahBarang++;
        }
    }

    public void tampikanBarang14() {
        System.out.println("Kode\tNama\tHarga\tStok");
        for (int i = 0; i < jumlahBarang; i++) {
            barangs[i].tampilkan14();
        }
    }

    public void tampilkanPembelian14() {
        System.out.println("Daftar Pembelian:");
        System.out.println("Kode\tNama\tHarga\tJumlah");
        for (int i = 0; i < jumlahPembelian; i++) {
            Barang14 p = pembelians[i];
            System.out.println(p.kode + "\t" + p.nama + "\t" + p.harga + "\t" + p.stok);
        }
    }

    public void beliBarang14(String kode) {
        for (int i = 0; i < jumlahBarang; i++) {
            if (barangs[i].kode.equalsIgnoreCase(kode)) {
                if (barangs[i].stok > 0) {
                    barangs[i].stok--;
                    pembelians[jumlahPembelian] = new Barang14(barangs[i].kode, barangs[i].nama, barangs[i].harga, 1);
                    jumlahPembelian++;
                    System.out.println("Barang " + barangs[i].nama + " berhasil dibeli.");
                } else {
                    System.out.println("Stok barang habis.");
                }
                return;
            }
        }
        System.out.println("Kode barang tidak ditemukan.");
    }
    
}

