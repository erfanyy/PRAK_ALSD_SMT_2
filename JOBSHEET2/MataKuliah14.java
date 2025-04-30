package JOBSHEET2;

public class MataKuliah14 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    public MataKuliah14() {
    }

    public MataKuliah14(String kodeMK, String nama, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    void tampilInformasi14() {
        System.out.println("Kode MK: " + kodeMK);
        System.out.println("Nama: " + nama);
        System.out.println("SKS: " + sks);
        System.out.println("Jumlah Jam: " + jumlahJam);
        System.out.println();
    }

    void ubahSKS14(int sksBaru) {
        sks = sksBaru;
        System.out.println("SKS telah diubah menjadi: " + sks);
    }

    void tambahJam14(int jam) {
        jumlahJam += jam;
        System.out.println("Jumlah jam bertambah. Sekarang: " + jumlahJam);
    }

    void kurangiJam14(int jam) {
        if (jam > jumlahJam) {
            System.out.println("Pengurangan jam tidak dapat dilakukan. Jumlah jam tidak cukup.");
        } else {
            jumlahJam -= jam;
            System.out.println("Jumlah jam telah dikurangi. Sekarang: " + jumlahJam + " jam.");
        }
    }
}
