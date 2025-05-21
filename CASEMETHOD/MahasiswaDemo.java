import java.util.Scanner; 
public class MahasiswaDemo { 
public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in); 
    Mahasiswa[] mahasiswaList = { 
    new Mahasiswa ("22001", "Ali Rahman", "Informatika"), 
    new Mahasiswa ("22002", "Budi Santoso", "Informatika"), 
    new Mahasiswa ("22003", "Citra Dewi", "Sistem Informasi Bisnis") 
}; 
MataKuliah[] mkList = { 
    new MataKuliah ( "MK001", "Struktur Data", 3), 
    new MataKuliah ("MK002", "Basis Data", 3), 
    new MataKuliah ("MK003", "Design Web", 2) 
}; 
Penilaian[] nilaiList = { 
    new Penilaian(mahasiswaList[0], mkList[0], 80, 85, 90),
    new Penilaian(mahasiswaList[0], mkList[1], 60, 75, 70),
    new Penilaian(mahasiswaList[1], mkList[0], 75, 70, 80),
    new Penilaian(mahasiswaList[2], mkList[1], 85, 90, 95),
    new Penilaian(mahasiswaList[2], mkList[2], 80, 90, 65)
    
}; 
int menu; 
do {
    System.out.println("=== MENU SISTEM AKADEMIK ==="); 
    System.out.println("1. TAMPILKAN DAFTAR MAHASISWA"); 
    System.out.println("2. TAMPILKAN DAFTAR MATA KULIAH"); 
    System.out.println("3. TAMPILKAN DATA PENILAIAAN"); 
    System.out.println("4. URUTKAN MAHASISWA BERDASARKAN NILAI AKHIR"); 
    System.out.println("5. CARI MAHASISWA BERASARKAN NIM"); 
    System.out.println("0. KELUAR"); 
    System.out.print("PILIH MENU: ");
    menu = sc.nextInt(); 
    sc.nextLine();

    switch (menu) { 
    case 1: 
    System.out.println("Daftar Mahasiswa: "); 
    for (Mahasiswa m: mahasiswaList) { 
    m.tampilMahasiswa(); 
    } 
    break;

    case 2: 
    System.out.println("Daftar Mata Kuliah: "); 
    for (MataKuliah mk : mkList) { 
    mk.tampilMataKuliah(); 
    } 
    break;

    case 3: 
    System.out.println("Daftar Penilaiaan: "); 
    for (Penilaian p : nilaiList) { 
    System.out.println(p.mahasiswa.nama + " | " + p.matakuliah.namaMK + " | Nilai Akhir: " +p.nilaiAkhir); 
    } 
    break; 

    case 4: 
    System.out.println("Urutan Mahasiswa Berdasarkan Nilai Akhir: "); 
    for (int i = 0; i < nilaiList.length - 1; i++) { 
        for (int j = 0; j < nilaiList.length -i -1; j++) { 
            if (nilaiList[j].nilaiAkhir < nilaiList[j + 1].nilaiAkhir) { 
    Penilaian temp = nilaiList[j]; 
    nilaiList[j] = nilaiList[j + 1]; 
    nilaiList[j + 1] = temp; 
    } 
    } 
    } 
    for (Penilaian p : nilaiList) { 
    System.out.println(p.mahasiswa.nama +  " | " + p.matakuliah.namaMK + "| Nilai Akhir: "+ p.nilaiAkhir); 
    } 
    break;

    case 5: 
    System.out.print("Masukkan NIM Mahasiswa: "); 
    String cariNIM = sc.nextLine(); 
    boolean ditemukan = false; 
    System.out.println("Hasil Pencarian: "); 
    for (Penilaian p : nilaiList) { 
        if(p.mahasiswa.NIM.equals(cariNIM)) { 
            System.out.println(p.mahasiswa.nama + " | " + p.matakuliah.namaMK + "| Nilai Akhir: "+ p.nilaiAkhir); 
            ditemukan = true; 
} 
} 
if (!ditemukan) { 
    System.out.println("Data Tidak Ditemukan."); 
} 
break;

case 0: 
    System.out.println("Terima Kasih"); 
    break; 
    default: 
    System.out.println("Menu Tidak Valid"); 
}
    }while (menu !=0); 
sc.close(); 
} 
}
