public class TransaksiLayanan {
    Pasien pasien;
    Dokter dokter;
    int durasiLayanan;
    int biaya;

    public TransaksiLayanan(Pasien pasien, Dokter dokter, int durasiLayanan) {
        this.pasien = pasien;
        this.dokter = dokter;
        this.durasiLayanan = durasiLayanan;
        this.biaya = hitungBiaya();
    }

    public int hitungBiaya() {
        return durasiLayanan * 50000;
    }

    public void tampilkan() {
        System.out.println("Pasien: " + pasien.nama + " | Dokter: " + dokter.nama + " | Durasi: " + durasiLayanan + " jam | Biaya: Rp" + biaya);
    }
}

