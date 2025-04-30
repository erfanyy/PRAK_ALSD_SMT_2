package QUIZ;
public class Barang14 {
    String kode;
    String nama;
    int harga;
    int stok;

    public Barang14(String kode, String nama, int harga, int stok) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public void tampilkan14() {
        System.out.println(kode + "\t" + nama + "\t" + harga + "\t" + stok);
    }
}