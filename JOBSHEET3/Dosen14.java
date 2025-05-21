package JOBSHEET3;

public class Dosen14 {
    public String kode;
    public String nama;
    public boolean jenisKelamin;
    public int usia;

    public Dosen14(String kode, String nama, boolean jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }

    public Dosen14() {
    }

    public void cetakInfo14(int index) {
        System.out.println("Data Dosen ke-" + (index + 1));
        System.out.println("Kode           : " + kode);
        System.out.println("Nama           : " + nama);
        System.out.println("Jenis Kelamin  : " + (jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Usia           : " + usia);
        System.out.println("---------------------------------");
    }

    public void cetakInfo14() {
        System.out.println("Kode           : " + kode);
        System.out.println("Nama           : " + nama);
        System.out.println("Jenis Kelamin  : " + (jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Usia           : " + usia);
    }
}
