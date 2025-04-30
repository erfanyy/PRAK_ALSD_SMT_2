package JOBSHEET2;

public class Dosen14 {
        String idDosen;
        String nama;
        boolean statusAktif;
        int tahunBergabung;
        String bidangKeahlian;
    
        public Dosen14() {
        } 
    
        public Dosen14(String idDosen, String nama, boolean statusAktif, int tahunBergabung, String bidangKeahlian) {
            this.idDosen = idDosen;
            this.nama = nama;
            this.statusAktif = statusAktif;
            this.tahunBergabung = tahunBergabung;
            this.bidangKeahlian = bidangKeahlian;
        }
    
        void tampilInformasi14() {
            System.out.println("ID Dosen: " + idDosen);
            System.out.println("Nama: " + nama);
            System.out.println("Status Aktif: " + statusAktif);
            System.out.println("Tahun Bergabung: " + tahunBergabung);
            System.out.println("Masa Kerja: " + hitungMasaKerja14(2025) + " tahun");
            System.out.println("Bidang Keahlian: " + bidangKeahlian);
            System.out.println();
        }
    
        void setStatusAktif14(boolean status) {
            statusAktif = status;
            System.out.println("Status dosen telah diubah menjadi: " + (statusAktif ? "Aktif" : "Tidak Aktif"));
        }
    
        int hitungMasaKerja14(int thnSkrg) {
            return thnSkrg - tahunBergabung;
        }
    
        void ubahKeahlian14(String bidang) {
            bidangKeahlian = bidang;
            System.out.println("Bidang keahlian telah diubah menjadi: " + bidangKeahlian);
        }
}
