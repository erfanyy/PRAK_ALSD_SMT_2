package JOBSHEET11;
import java.util.Scanner;
public class SllMain14 {

    public static void main(String[] args) {
        Scanner empatBelas = new Scanner(System.in);
        SingleLingkedList14 sll = new SingleLingkedList14();
        
        Mahasiswa14 mhs1 = new Mahasiswa14("24212200", "Alvaro", "1A", 4.0);
        Mahasiswa14 mhs2 = new Mahasiswa14("21212203", "Bimon", "2B", 3.8);
        Mahasiswa14 mhs3 = new Mahasiswa14("22212202", "Cintia", "3C", 3.5);
        Mahasiswa14 mhs4 = new Mahasiswa14("23212201", "Dirga", "4D", 3.6);
        
        sll.print();                              
        sll.addFirst(mhs4);                       
        sll.print();                              
        sll.addLast(mhs1);                        
        sll.print();                              
        sll.insertAfter("Dirga", mhs3);           
        sll.insertAt(2, mhs2);                    
        sll.print(); 
        System.out.println("data index 1 : ");
        sll.getData(1);
        System.out.println("data mahasiswa an Bimon berapa pada index : " +sll.indexOf("bimon"));
        System.out.println();
        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();

    }      
}



    
