package JOBSHEET14;

public class Mahasiswa14 {
    String nim;
    String nama;
    String kelas;
    Double ipk;

    public Mahasiswa14() {

    }
    
    public Mahasiswa14(String nama, String nim, String kelas, Double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public void tampilInformasi() {
        System.out.println("NIM: "+this.nim+" "+
        "Nama: " +this.nama+" " +
        "Kelas: " +this.kelas+" " +
        "IPK: " +this.ipk);
    }
}
