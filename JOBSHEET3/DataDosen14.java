package JOBSHEET3;

public class DataDosen14 {
    public static void dataSemuaDosen(Dosen14[] arrayOfDosen14) {
        System.out.println("\nData Semua Dosen:");
        System.out.println("============================================================");
        System.out.printf("| %-10s | %-20s | %-13s | %-4s |\n", "Kode", "Nama", "Jenis Kelamin", "Usia");
        System.out.println("============================================================");
        for (Dosen14 dosen : arrayOfDosen14) {
            System.out.printf("| %-10s | %-20s | %-13s | %-4d |\n",
                dosen.kode, dosen.nama, dosen.jenisKelamin ? "Pria" : "Wanita", dosen.usia);
        }
        System.out.println("============================================================");
    }

    public static void jumlahDosenPerJenisKelamin(Dosen14[] arrayOfDosen14) {
        int pria = 0, wanita = 0;
        for (Dosen14 dosen : arrayOfDosen14) {
            if (dosen.jenisKelamin) {
                pria++;
            } else {
                wanita++;
            }
        }
        System.out.println("\nJumlah Dosen Per Jenis Kelamin:");
        System.out.println("Pria  : " + pria);
        System.out.println("Wanita: " + wanita);
    }

    public static void rerataUsiaDosenPerJenisKelamin(Dosen14[] arrayOfDosen14) {
        int totalUsiaPria = 0, totalUsiaWanita = 0;
        int jumlahPria = 0, jumlahWanita = 0;

        for (Dosen14 dosen : arrayOfDosen14) {
            if (dosen.jenisKelamin) {
                totalUsiaPria += dosen.usia;
                jumlahPria++;
            } else {
                totalUsiaWanita += dosen.usia;
                jumlahWanita++;
            }
        }

        System.out.println("\nRata-rata Usia Dosen Per Jenis Kelamin:");
        double rerataUsiaPria = (double) totalUsiaPria / jumlahPria;
        double rerataUsiaWanita = (double) totalUsiaWanita / jumlahWanita;
        System.out.println("Pria: " + rerataUsiaPria);
        System.out.println("Wanita: " + rerataUsiaWanita);
    }

    public static void infoDosenPalingTua(Dosen14[] arrayOfDosen14) {
        if (arrayOfDosen14.length == 0) return;

        Dosen14 dosenTertua = arrayOfDosen14[0];
        for (Dosen14 dosen : arrayOfDosen14) {
            if (dosen.usia > dosenTertua.usia) {
                dosenTertua = dosen;
            }
        }

        System.out.println("\nDosen Paling Tua: ");
        dosenTertua.cetakInfo14();
    }

    public static void infoDosenPalingMuda(Dosen14[] arrayOfDosen14) {
        if (arrayOfDosen14.length == 0) return;

        Dosen14 dosenTermuda = arrayOfDosen14[0];
        for (Dosen14 dosen : arrayOfDosen14) {
            if (dosen.usia < dosenTermuda.usia) {
                dosenTermuda = dosen;
            }
        }

        System.out.println("\nDosen Paling Muda: ");
        dosenTermuda.cetakInfo14();
    }
}
