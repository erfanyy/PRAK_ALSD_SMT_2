package JOBSHEET6;

public class SortingMain14 {
    public static void main(String[] args) {
        int a[] = {20, 10, 2, 7, 12};
    
        Sorting14 dataurut1 = new Sorting14(a, a.length);
        System.out.println("Data awal 1");
        dataurut1.tampil14();
        dataurut1.bubbleSort14();
        System.out.println("Data sudah diurutkan dengan BUBBLE SORT (ASC)");
        dataurut1.tampil14();
    
        int b[] = {30, 20, 2, 8, 14};
    
        Sorting14 dataurut2 = new Sorting14(b, b.length);
        System.out.println("Data awal 2");
        dataurut2.tampil14();
        dataurut2.SelectionSort14();
        System.out.println("Data sudah diurutkan dengan SELECTION SORT (ASC)");
        dataurut2.tampil14();
    
        int c[] = {40, 10, 4, 9, 3};
    
        Sorting14 dataurut3 = new Sorting14(c, c.length);
        System.out.println("Data awal 3");
        dataurut3.tampil14();
        dataurut3.insertionSort14();
        System.out.println("Data sudah diurutkan dengan INSERTION SORT (ASC)");
        dataurut3.tampil14();
        }
}
