package JOBSHEET8;

public class DataSiakad14 {
    Mahasiswa14[] daftarMahasiswa;
    MataKuliah14[] daftarMataKuliah;
    Penilaian14[] daftarNilai;
    
    public DataSiakad14() {
        Mahasiswa14 m1 = new Mahasiswa14("22001", "Ali Rahman", "Informatika");
        Mahasiswa14 m2 = new Mahasiswa14("22002", "Budi Santoso", "Informatika");
        Mahasiswa14 m3 = new Mahasiswa14("22003", "Citra Dewi", "Sistem Informasi Bisnis");
        daftarMahasiswa = new Mahasiswa14[] { m1, m2, m3 };
        
        MataKuliah14 mk1 = new MataKuliah14("MK001", "Struktur Data", 3);
        MataKuliah14 mk2 = new MataKuliah14("MK002", "Basis Data", 3);
        MataKuliah14 mk3 = new MataKuliah14("MK003", "Desain Web", 3);
        daftarMataKuliah = new MataKuliah14[] { mk1, mk2, mk3 };
        
        daftarNilai = new Penilaian14[] {
            new Penilaian14(m1, mk1, 80, 85, 90),
            new Penilaian14(m1, mk2, 60, 75, 70),
            new Penilaian14(m2, mk1, 75, 70, 80),
            new Penilaian14(m3, mk2, 85, 90, 95),
            new Penilaian14(m3, mk3, 80, 90, 65)
        };
    }

    public void tampilMahasiswa14() { 
        System.out.println("\nDaftar Mahasiswa:");
        
        for (int i = 0; i < daftarMahasiswa.length; i++) {
            System.out.println("NIM: " + daftarMahasiswa[i].nim + " | Nama: " + daftarMahasiswa[i].nama + " | Prodi: " + daftarMahasiswa[i].prodi);
        }
    }
    
    public void tampilMataKuliah14() {
        System.out.println("\nDaftar Mata Kuliah:");
        
        for (int i = 0; i < daftarMataKuliah.length; i++) {
            System.out.println("Kode MK: " + daftarMataKuliah[i].kodeMK + " | Nama: " + daftarMataKuliah[i].namaMK + " | SKS: " + daftarMataKuliah[i].sks);
        }
    }
  
    public void tampilNilai14() {
        System.out.println("\nData Penilaian:");
        
        for (int i = 0; i < daftarNilai.length; i++) {
            Penilaian14 nilai = daftarNilai[i]; 
            System.out.println(nilai.mahasiswa.nama + " | " + nilai.mataKuliah.namaMK + " | " + "Nilai Akhir: " + nilai.hitungNilaiAkhir14()); 
        }
    }

    public void urutkanNilai14() {
        for (int i = 0; i < daftarNilai.length - 1; i++) {
            for (int j = 0; j < daftarNilai.length - i - 1; j++) {
                if (daftarNilai[j].hitungNilaiAkhir14() < daftarNilai[j + 1].hitungNilaiAkhir14()) {
                    Penilaian14 temp = daftarNilai[j];
                    daftarNilai[j] = daftarNilai[j + 1];
                    daftarNilai[j + 1] = temp;
                }
            }
        }
    }
    

    public void cariMahasiswaNIM(String nim) {
        boolean ditemukan = false;
        
        for (int i = 0; i < daftarMahasiswa.length; i++) {
            if (daftarMahasiswa[i].nim.equals(nim)) {
                System.out.println("Mahasiswa Ditemukan: NIM: " + daftarMahasiswa[i].nim + " | Nama: " + daftarMahasiswa[i].nama + " | Prodi: " + daftarMahasiswa[i].prodi);
                ditemukan = true;
                break;
            }
        }
        
        if (!ditemukan) {
            System.out.println("Mahasiswa dengan NIM " + nim + " tidak ditemukan!");
        }
    }
}
