package JOBSHEET8;

public class Penilaian14 {
    Mahasiswa14 mahasiswa;
    MataKuliah14 mataKuliah;
    double nilaiTugas; 
    double nilaiUTS;
    double nilaiUAS;
    double nilaiAkhir;

    Penilaian14(){ 
    } 

    Penilaian14 (Mahasiswa14 mahasiswa, MataKuliah14 mataKuliah, double nilaiTugas, double nilaiUts, double nilaiUas){ //kons. berparameter
        this.mahasiswa = mahasiswa;
        this.mataKuliah = mataKuliah;
        this.nilaiTugas = nilaiTugas;
        this.nilaiUTS = nilaiUts;
        this.nilaiUAS = nilaiUas;
    }

    public double hitungNilaiAkhir14() {
        return (0.3 * nilaiTugas) + (0.3 * nilaiUTS) + (0.4 * nilaiUAS);
    }
}
