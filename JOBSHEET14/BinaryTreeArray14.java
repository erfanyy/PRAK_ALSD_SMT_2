package JOBSHEET14;

public class BinaryTreeArray14 {
    Mahasiswa14[] dataErpan;
    int idxLast;

    public BinaryTreeArray14() {
        this.dataErpan = new Mahasiswa14[10];
    }

    public void populateData (Mahasiswa14 dataMhs[], int idxLast) {
        this.dataErpan = dataMhs;
        this.idxLast = idxLast;
    }

    public void add14(Mahasiswa14 data) {
        if (idxLast < dataErpan.length - 1) {
            idxLast++;
            dataErpan[idxLast] = data;
        } else {
            System.out.println("Tree penuh. Tidak bisa menambahkan data.");
        }
    }

    public void traversePreOrder14(int idxStart) {
        if (idxStart <= idxLast) {
            if(dataErpan[idxStart] != null) {
                dataErpan[idxStart].tampilInformasi();
                traversePreOrder14(2 * idxStart + 1);
                traversePreOrder14(2 * idxStart + 2);
            }
        }
    }

    public void traverseInOrder(int idxStart) {
        if(idxStart <= idxLast) {
            if(dataErpan[idxStart] != null) {
                traverseInOrder(2*idxStart+1);
                dataErpan[idxStart].tampilInformasi();
                traverseInOrder(2*idxStart+2);
            }
        }
    }
}
