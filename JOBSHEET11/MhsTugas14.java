package JOBSHEET11;

public class MhsTugas14 {
    String nim;
    String nama;
    String jurusan;
    String kepentingan;

    public MhsTugas14(String nim, String nama, String jurusan, String kepentingan) {
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
        this.kepentingan = kepentingan;
    }
    public void tampilInformasi() {
        System.out.printf("%s \t %s \t %s \t %.1f \n", nama, nim, jurusan, kepentingan);
    }
}
