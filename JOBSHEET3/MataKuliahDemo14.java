package JOBSHEET3;

import java.util.Scanner;
public class MataKuliahDemo14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMatakuliah14 = Integer.parseInt(sc.nextLine());
        MataKuliah14[] arrayOfMatakuliah14 = new MataKuliah14[jumlahMatakuliah14];
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1) + ": ");
            arrayOfMatakuliah14[i] = new MataKuliah14(); 
            arrayOfMatakuliah14[i].tambahData14(); 
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1) + ": ");
            arrayOfMatakuliah14[i].cetakInfo14(); 
        }
    } 
    
}
