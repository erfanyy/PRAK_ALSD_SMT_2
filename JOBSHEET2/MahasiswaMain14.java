package JOBSHEET2;

public class MahasiswaMain14 {
    public static void main(String[] args) {
        Mahasiswa14 mhs1 = new Mahasiswa14();
        mhs1.nama = "Muchammad Alyf Erfany";
        mhs1.nim = "244107060143";
        mhs1.kelas = "SIB 1B";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi14();
        mhs1.ubahKelas14("SIB 1A");
        mhs1.updateIpk14(3.60);
        mhs1.tampilkanInformasi14();

        Mahasiswa14 mhs2 = new Mahasiswa14("Alyf","2441234567810", 3.25,"SIB 1B");
        mhs2.updateIpk14(3.30);
        mhs2.tampilkanInformasi14();

        Mahasiswa14 mhs = new Mahasiswa14("Erfany", "24410987654321", 3.90, "SIB 1A");
        mhs.tampilkanInformasi14();
    }
}
