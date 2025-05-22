package JOBSHEET12;
import java.util.Scanner;

public class DLLMain14 {
    public static void main(String[] args) {
        DoubleLL14 list = new DoubleLL14();
        Scanner erpan = new Scanner(System.in);
        int pilih;
        do{
            System.out.println("\n Menu Double Linked List Mahasiswa");
            System.out.println("1. Tambah di Awal");
            System.out.println("2. Tambah di Akhir");
            System.out.println("3. Hapus di Awal");
            System.out.println("4. Hapus di Akhir");
            System.out.println("5. Tampilkan Data");
            System.out.println("6. Cari Mahasiswa berdasarkan NIM");
            System.out.println("7. Sisipkan Data");
            System.out.println("8. Tambah data di indeks tertentu");
            System.out.println("9. Hapus data di indeks tertentu");
            System.out.println("10. Hapus data setelah NIM tertentu");
            System.out.println("11. Tampilkan data pertama");
            System.out.println("12. Tampilkan data terakhir");
            System.out.println("13. Tampilkan data berdasarkan indeks");
            System.out.println("14. Tampilkan jumlah data");
            System.out.println("0. Keluar");
            System.out.print("Pilih Menu: ");
            pilih = erpan.nextInt();
            erpan.nextLine();
            switch (pilih) {
                case 1:  
                    Mahasiswa14 mhs = inputMahasiswa(erpan);
                    list.addFirst(mhs);
                    break;
                case 2: 
                    Mahasiswa14 mhs2 = inputMahasiswa(erpan);
                    list.addLast(mhs2);
                    break;
                case 3: 
                    list.removeFirst();
                    break;
                case 4: 
                    list.removeLast();
                    break;
                case 5: 
                    list.print();
                    break;
                case 6:  
                    System.out.print("Masukkan NIM yang dicari: ");
                    String nim = erpan.nextLine();
                    Node14 found = list.search(nim);
                    if(found != null) { 
                        System.out.println("Data ditemukan");
                        found.data.tampilInformasi();
                    }else{
                        System.out.println("Data tidak ditemukan.");   
                    }
                    break;
                case 7:
                    System.out.print("Masukkan NIM setelah data yang ingin disisipkan: ");
                    String keyNim = erpan.nextLine();
                    System.out.println("Masukkan data mahasiswa baru:");
                    Mahasiswa14 mhs3 = inputMahasiswa(erpan);
                    list.insertAfter(keyNim, mhs3); 
                    break;
                case 8:
                    System.out.print("Masukkan indeks: ");
                    int idxAdd = erpan.nextInt();
                    erpan.nextLine();
                    Mahasiswa14 mhsAdd = inputMahasiswa(erpan);
                    list.add(idxAdd, mhsAdd);
                    break;
                case 9:
                    System.out.print("Masukkan indeks yang ingin dihapus: ");
                    int idxRemove = erpan.nextInt();
                    erpan.nextLine();
                    list.remove(idxRemove);
                    break;
                case 10:
                    System.out.print("Masukkan NIM untuk menghapus node setelahnya: ");
                    String nimKey = erpan.nextLine();
                    list.removeAfter(nimKey);
                    break;
                case 11:
                    System.out.println("Data pertama dalam list:");
                    list.getFirst();
                    break;
                case 12:
                    System.out.println("Data terakhir dalam list:");
                    list.getLast();
                    break;
                case 13:
                    System.out.print("Masukkan indeks data yang ingin ditampilkan: ");
                    int idxGet = erpan.nextInt();
                    erpan.nextLine();
                    list.getIndex(idxGet);
                    break;
                case 14:
                    System.out.println("Jumlah data dalam list: " + list.size());
                    break;
                case 0: 
                    System.out.println("Keluar dari program.");
                break;
                default: 
                    System.out.println("Pilihan tidak valid");
                break;
            }
        }while(pilih !=0);
        erpan.close();
    }
    private static Mahasiswa14 inputMahasiswa(Scanner erpan) {
        System.out.print("Masukkan NIM: ");
        String nim = erpan.nextLine();
        System.out.print("Masukkan Nama: ");
        String nama = erpan.nextLine();
        System.out.print("Masukkan Kelas: ");
        String kelas = erpan.nextLine();
        System.out.print("Masukkan IPK: ");
        double ipk = erpan.nextDouble();
        erpan.nextLine();
        return new Mahasiswa14(nim, nama, kelas, ipk);
    }
}
