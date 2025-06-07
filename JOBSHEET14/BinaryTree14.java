package JOBSHEET14;

public class BinaryTree14 {
    Node14 root;

    public BinaryTree14() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

     public Node14 addRekursif14(Node14 current, Mahasiswa14 data) {
        if (current == null) {
            return new Node14(data);
        }

        if (data.ipk < current.erpan.ipk) {
            current.kiri = addRekursif14(current.kiri, data);
        } else if (data.ipk > current.erpan.ipk) {
            current.kanan = addRekursif14(current.kanan, data);
        } else {
            System.out.println("Duplikat IPK, data tidak ditambahkan: " + data.ipk);
        }

        return current;
    }

    public void cariMinIPK14() {
        if (isEmpty()) {
        System.out.println("Tree kosong.");
        return;
    }
    Node14 current = root;
    while (current.kiri != null) {
        current = current.kiri;
    }
    System.out.println("Mahasiswa dengan IPK terkecil:");
    current.erpan.tampilInformasi();
    }

    public void cariMaxIPK14() {
        if (isEmpty()) {
        System.out.println("Tree kosong.");
        return;
    }
    Node14 current = root;
    while (current.kanan != null) {
        current = current.kanan;
    }
    System.out.println("Mahasiswa dengan IPK terbesar:");
    current.erpan.tampilInformasi();
    }

    public void tampilMahasiswaIPKdiAtas14(double ipkBatas) {
        System.out.println("Mahasiswa dengan IPK di atas " + ipkBatas + ":");
        tampilMahasiswaIPKdiAtasRekursif14(root, ipkBatas);
    }

    private void tampilMahasiswaIPKdiAtasRekursif14(Node14 node, double ipkBatas) {
        if (node != null) {
            tampilMahasiswaIPKdiAtasRekursif14(node.kiri, ipkBatas);
        if (node.erpan.ipk > ipkBatas) {
            node.erpan.tampilInformasi();
        }
        tampilMahasiswaIPKdiAtasRekursif14(node.kanan, ipkBatas);
        }
    }

    public void add(Mahasiswa14 erpan) {
        Node14 newNode = new Node14(erpan);
        if(isEmpty()) {
            root = newNode;
        }else{
            Node14 current = root;
            Node14 parent = null;
            while (true) {
                parent = current;
                if(erpan.ipk < current.erpan.ipk) {
                    current = current.kiri;
                    if(current == null) {
                        parent.kiri = newNode;
                        return;
                    }
                }else{
                    current = current.kanan;
                    if(current == null) {
                        parent.kanan = newNode;
                        return;
                    }
                }
            }
        }
    }

    boolean find(double ipk) {
        boolean result = false;
        Node14 current = root;
        while (current != null) {
            if(current.erpan.ipk == ipk) {
                result = true;
                break;
            }else if(ipk > current.erpan.ipk){
                current = current.kanan;
            }else{
                current = current.kiri;
            }

        }
        return result;
    }

    public void traversePreOrder(Node14 node) {
        if(node != null) {
            node.erpan.tampilInformasi();
            traversePreOrder(node.kiri);
            traversePreOrder(node.kanan);
        }
    }

    public void traverseInOrder(Node14 node) {
        if(node != null) {
            traverseInOrder(node.kiri);
            node.erpan.tampilInformasi();
            traverseInOrder(node.kanan);
        }
    }

    public void traversePostOrder(Node14 node) {
        if(node != null) {
            traversePostOrder(node.kiri);
            traversePostOrder(node.kanan);
            node.erpan.tampilInformasi();
        }
    }

    Node14 getSuccessor(Node14 del) {
        Node14 successor = del.kanan;
        Node14 successorParent = del;
        while(successor.kiri != null) {
            successorParent = successor;
            successor = successor.kiri;
        }
        if(successor != del.kanan) {
            successorParent.kiri = successor.kanan;
            successor.kanan = del.kanan;
        }
        return successor;
    }

    public void delete(double ipk) {
        if(isEmpty()) {
            System.out.println("Binary Tree kosong");
            return;
        }
        Node14 parent = root;
        Node14 current = root;
        boolean isKiriAnak = false;
        while (current != null) {
            if(current.erpan.ipk == ipk) {
                break;
            }else if(ipk < current.erpan.ipk){
                parent = current;
                current = current.kiri;
                isKiriAnak = true;
            }else if(ipk > current.erpan.ipk) {
                parent = current;
                current = current.kanan;
                isKiriAnak = false;
            }
            if(current == null) {
                System.out.println("Data tidak ditemukan");
                return;
            }else{
                if(current.kiri == null && current.kanan == null) {
                    if(current == root) {
                        root = null;
                    }else{
                        if(isKiriAnak) {
                            parent.kiri = null;
                        }else{
                            parent.kanan = null;
                        }
                    }
                }else if(current.kiri == null) {
                    if(current == root) {
                        root = current.kanan;
                    }else{
                        if(isKiriAnak) {
                            parent.kiri = current.kanan;
                        }else{
                            parent.kanan = current.kanan;
                        }
                    }
                }else if(current.kanan == null) {
                    if(current == root) {
                        root = current.kiri;
                    }else{
                        if(isKiriAnak) {
                            parent.kiri = current.kiri;
                        }else{
                            parent.kanan = current.kiri;
                        }
                    }
                }else{
                    Node14 successor = getSuccessor(current);
                    System.out.println("Jika 2 anak, Current = ");
                    successor.erpan.tampilInformasi();
                    if(current == root) {
                        root = successor;
                    }else{
                        if(isKiriAnak) {
                            parent.kiri = successor;
                        }else{
                            parent.kanan = successor;
                        }
                    }
                    successor.kiri = current.kiri;
                }
            }
        }
    }
}
