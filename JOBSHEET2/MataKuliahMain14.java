package JOBSHEET2;

public class MataKuliahMain14 {
    public static void main(String[] args) {
        MataKuliah14 mk1 = new MataKuliah14();
        mk1.kodeMK = "ALSD";
        mk1.nama = "Algoritma dan Struktur Data";
        mk1.sks = 3;
        mk1.jumlahJam = 4;
        mk1.tampilInformasi14();

        mk1.ubahSKS14(4);
        mk1.tambahJam14(2);
        mk1.kurangiJam14(3);
        mk1.tampilInformasi14();

        MataKuliah14 mk2 = new MataKuliah14("BD", "Basis Data", 3, 4);
        mk2.tampilInformasi14();

        mk2.tambahJam14(1);
        mk2.kurangiJam14(6);
        mk2.tampilInformasi14();
    }
}
