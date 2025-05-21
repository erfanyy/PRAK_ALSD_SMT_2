package JOBSHEET11;

import java.util.Scanner;

public class Main14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueLLTugas14 queue = new QueueLLTugas14();
        int pilihan = 0;
        
        do {
            System.out.println("=== Antrian Layanan Mahasiswa ===");///M
            System.out.println("1. Pendaftaran Mahasiswa");///U
            System.out.println("2. Panggil Mahasiswa dari Antrian");///C
            System.out.println("3. Lihat Mahasiswa Terdepan");///H
            System.out.println("4. Lihat Mahasiswa Terakhir");///A
            System.out.println("5. Lihat Semua Mahasiswa dalam Antrian");///M
            System.out.println("6. Cek Antrian Kosong");///M
            System.out.println("7. Cek Antrian Penuh");///A
            System.out.println("8. Jumlah Mahasiswa dalam Antrian");///D
            System.out.println("9. Kosongkan Antrian");///A
            System.out.println("0. Keluar");///L
            System.out.print("Pilih menu : ");///YF
            
            pilihan = sc.nextInt();
            sc.nextLine();
            
            switch (pilihan) {
                case 1:
                    System.out.println("\nData Mahasiswa yang ingin ditambahkan:");
                    System.out.print("NIM: "); ///E
                    String nim = sc.nextLine(); ///R
                    System.out.print("Nama: "); ///F
                    String nama = sc.nextLine(); ///A
                    System.out.print("Jurusan: "); ///N
                    String jurusan = sc.nextLine(); ///Y
                    System.out.print("Keperluan: "); ///1
                    String keperluan = sc.nextLine();///4
                    
                    MhsTugas14 mhs = new MhsTugas14(nim, nama, jurusan, keperluan);
                    queue.enqueue(mhs);
                    break;
                    
                case 2:
                    MhsTugas14 dipanggil = queue.dequeue();
                    if (dipanggil != null) { ///2
                        System.out.println("\nData Mahasiswa yang Dipanggil:");
                        dipanggil.tampilInformasi();
                    }
                    break;
                    
                case 3:
                    MhsTugas14 depan = queue.peek();
                    if (depan != null) { ///4
                        System.out.println("\nMahasiswa Antrian Paling Depan:");
                        depan.tampilInformasi();
                    }
                    break;
                    
                case 4:
                    MhsTugas14 akhir = queue.peekRear();
                    if (akhir != null) {///4
                        System.out.println("\nMahasiswa Antrian Paling Belakang:");
                        akhir.tampilInformasi();
                    }
                    break;
                    
                case 5:///1
                    System.out.println("\nDaftar Mahasiswa dalam Antrian:");
                    queue.display();
                    break;
                    
                case 6:
                    if (queue.isEmpty()) {///0
                        System.out.println("Antrian Kosong");
                    } else {
                        System.out.println("Antrian tidak kosong");
                    }
                    break;
                    
                case 7:
                    if (queue.isFull()) {///7
                        System.out.println("Antrian Penuh");
                    } else {
                        System.out.println("Antrian tidak penuh");
                    }
                    break;
                    
                case 8:///0
                    System.out.printf("Jumlah mahasiswa dalam antrian: %d orang", queue.size());
                    break;
                    
                case 9:///6
                    queue.clear();
                    break;
                    
                case 0:///0
                    System.out.println("Terima kasih.");
                    break;
                    
                default:///1
                    System.out.println("Pilihan tidak valid. Silakan pilih 0-9.");
            }
            
        } while (pilihan != 0);///4
        
        sc.close();///3
    }
}    
    
    

