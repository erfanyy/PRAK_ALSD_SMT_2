package JOBSHEET10.TUGAS;

public class Mahasiswa14 {
    String nim;
    String nama;
    String prodi;
    String kelas;

    public Mahasiswa14(String nim, String nama, String prodi, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.kelas = kelas;
    }   

    public void tampil() {
        System.out.println("NIM - NAMA - PRODI - KELAS");
        System.out.println(nim + " - " + nama + " - " + prodi + " - " + kelas);
    }
}

