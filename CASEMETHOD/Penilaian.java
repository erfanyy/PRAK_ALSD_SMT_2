public class Penilaian {
    Mahasiswa mahasiswa; 
    MataKuliah matakuliah; 
    double nilaiTugas; 
    double nilaiUTS; 
    double nilaiUAS; 
    double nilaiAkhir; 
public Penilaian (Mahasiswa mahasiswa, MataKuliah matakuliah, double tugas, double uts, double uas) { 
    this.mahasiswa = mahasiswa; 
    this.matakuliah = matakuliah; 
    this.nilaiTugas = tugas; 
    this.nilaiUAS = uas; 
    this.nilaiUTS = uts; 
    hitungNilaiAkhir(); 
} 
    public void hitungNilaiAkhir() { 
    nilaiAkhir = (nilaiTugas * 0.3) + (nilaiUTS * 0.3) + (nilaiUAS * 0.4); 
    }
    public void tampilDataPenilaiaan() { 
        System.out.println("Mahasiswa:" + mahasiswa.nama); 
        System.out.println("Mata Kuliah: " + matakuliah.namaMK); 
        System.out.println("Tugas: " +nilaiTugas+ "| UTS: " +nilaiUTS+ "| UAS: " +nilaiUAS+ "| Nilai Akhir: " +nilaiAkhir);
}
    }