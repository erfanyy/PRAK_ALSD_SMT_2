package JOBSHEET7;

public class MahasiswaBerprestasi14 {
    Mahasiswa14 [] listMhs;
    int idx = 0;

    MahasiswaBerprestasi14(int jumlahMahasiswa) {
        listMhs = new Mahasiswa14[jumlahMahasiswa];
    }

    void tambah (Mahasiswa14 m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampil14() {
        for (int i = 0; i < idx; i++) {
            listMhs[i].tampilInformasi14();
            System.out.println("--------------------------");
        }
    }

    int sequentialSearching(double cari) {
        int posisi = -1;
        for (int j = 0; j < listMhs.length; j++) {
            if (listMhs[j].ipk == cari) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }
    
    void tampilPosisi14(double x, int pos) {
        if (pos != -1) {
            System.out.println("data mahasiswa dengan IPK: " + x + " ditemukan pada indeks " + pos);
        }
        else {
            System.out.println("data " + x + " tidak ditemukan");
        }
    }

    void tampilDataSearch14(double x, int pos) {
        if (pos != -1) {
            System.out.println("nim\t : " + listMhs[pos].nim);
            System.out.println("nama\t : " + listMhs[pos].nama);
            System.out.println("kelas\t : " + listMhs[pos].kelas);
            System.out.println("ipk\t : " + x);
        }
        else {
            System.out.println("Data mahasiswa dengan IPK " + x + " tidak ditemukan");
        }
    }

    int findBinarySearch14(double cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (cari == listMhs[mid].ipk) {
                return (mid);
            }
            else if (listMhs[mid].ipk < cari) {
                return findBinarySearch14(cari, left, mid - 1);
            }
            else {
                return findBinarySearch14(cari, mid + 1, right);
            }
        }
        return -1;
    }
}
