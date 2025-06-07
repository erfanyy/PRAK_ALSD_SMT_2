package JOBSHEET14;

public class BinaryTreeArrayMain14 {
    public static void main(String[] args) {
        BinaryTreeArray14 bta = new BinaryTreeArray14();
        bta.add14(new Mahasiswa14("244160121","Ali","A",3.57));
        bta.add14(new Mahasiswa14("244160185","Candra","C",3.41));
        bta.add14(new Mahasiswa14("244160221","Badar","B",3.75));
        bta.add14(new Mahasiswa14("244160220","Dewi","B",3.35));
        bta.add14(new Mahasiswa14("244160131","Devi","A",3.48));
        bta.add14(new Mahasiswa14("244160205","Ehsan","D",3.61));
        bta.add14(new Mahasiswa14("244160170","Fizi","B",3.86));

        System.out.println("\nPreOrder Traversal Mahasiswa (array-based): ");
        bta.traversePreOrder14(0);
    }
}
