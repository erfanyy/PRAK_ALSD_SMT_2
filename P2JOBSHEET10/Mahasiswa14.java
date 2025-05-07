package JOBSHEET10.P2JOBSHEET10;

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
    public void tampilkanData() {
        System.out.println(nim+ " - " +nama+ " - " +prodi+ " - "+kelas);
    }
    

}

