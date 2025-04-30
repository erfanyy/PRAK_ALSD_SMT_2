package JOBSHEET1;
public class Fungsi14 {
    public static int stokBunga14[][] = {
        { 10, 5, 15, 7 },
        { 6, 11, 9, 12 },
        { 2, 10, 10, 5 },
        { 5, 7, 12, 9 }
    };
    
    static int hargaBunga14[] = { 75000, 50000, 60000, 10000 };
    
    static void pendapatanCabang() {
    System.out.println("=================================================");
    System.out.println("Pendapatan cabang RoyalGarden jika semua terjual");
    System.out.println("=================================================");
    for (int i = 0; i < stokBunga14.length; i++) {
        int totalPendapatan14 = 0;
        for (int j = 0; j < stokBunga14[i].length; j++) {
            totalPendapatan14 += stokBunga14[i][j] * hargaBunga14[j];
        }
        System.out.println("Pendapatan cabang RoyalGarden " + (i + 1) + ": Rp " + totalPendapatan14);
    }
    }
    
    static String NamaBunga10(int index) {
    switch (index) {
        case 0:
            return "Aglonema";
        case 1:
            return "Keladi";
        case 2:
            return "Alocasia";
        case 3:
            return "Mawar";
        default:
            return "Bunga Tidak Ada";
    }
    }
    public static void main(String[] args) {
    pendapatanCabang();
    } 
    
}

    

