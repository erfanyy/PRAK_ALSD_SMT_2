package JOBSHEET2;

public class DosenMain14 {
    public static void main(String[] args) {
        Dosen14 dsn1 = new Dosen14();
        dsn1.idDosen = "D001";
        dsn1.nama = "Wilda Imama Sabilla, S.Kom., M.Kom.";
        dsn1.statusAktif = true;
        dsn1.tahunBergabung = 2005;
        dsn1.bidangKeahlian = "Basis Data";
        dsn1.tampilInformasi14();

        dsn1.setStatusAktif14(false);
        dsn1.ubahKeahlian14("Praktikum Basis Data");
        dsn1.tampilInformasi14();

        Dosen14 dsn2 = new Dosen14("D002", "Rokhimatul Wakhidah, S.Pd., M.T.", true, 2015, "Praktikum Algoritma");
        dsn2.tampilInformasi14();

        dsn2.setStatusAktif14(true);
        dsn2.ubahKeahlian14("Struktur Data");
        dsn2.tampilInformasi14();
    }
}
