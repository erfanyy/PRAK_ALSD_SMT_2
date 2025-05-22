package JOBSHEET12;

public class DoubleLL14 {
    Node14 head;
    Node14 tail;
    
    public void add(int index, Mahasiswa14 data) { //baru14
    if (index < 0) {
        System.out.println("Indeks tidak valid.");//baru14
        return;//baru
    }
    if (index == 0) {
        addFirst(data);//baru
        return;//baru14
    }

    Node14 current = head;//baru14
    int count = 0;//baru1414
    while (current != null && count < index - 1) {
        current = current.next;//baru14
        count++;//baru14
    }

    if (current == null) {//baru//baru14
        System.out.println("Indeks melebihi ukuran list.");//baru
    } else if (current == tail) {//baru14
        addLast(data);
    } else {//baru14
        Node14 newNode = new Node14(data);//baru14
        newNode.next = current.next;
        newNode.prev = current;//baru14
        current.next.prev = newNode;//baru14
        current.next = newNode;//baru14
    }
}
    public void removeAfter(String keyNim) {//baru14
    Node14 current = search(keyNim);
    if (current == null || current.next == null) {
        System.out.println("Node tidak ditemukan atau tidak ada node setelahnya.");
        return;//baru14
    }
    Node14 nodeToRemove = current.next;//baru14
    current.next = nodeToRemove.next;
    if (nodeToRemove.next != null) {
        nodeToRemove.next.prev = current;//baru14
    } else {
        tail = current; //baru14
    }
    System.out.println("Node setelah NIM " + keyNim + " berhasil dihapus.");//baru14
}
    public void remove(int index) {//baru14
    if (index < 0 || isEmpty()) {
        System.out.println("Indeks tidak valid.");
        return;
    }
    if (index == 0) {//baru14
        removeFirst();
        return;
    }

    Node14 current = head;//baru14
    int count = 0;
    while (current != null && count < index) {
        current = current.next;
        count++;//baru14
    }

    if (current == null) {
        System.out.println("Indeks melebihi ukuran list.");
    } else if (current == tail) {
        removeLast();//baru14
    } else {
        current.prev.next = current.next;
        current.next.prev = current.prev;
        System.out.println("Node pada indeks " + index + " berhasil dihapus.");
    }
}//baru
    public int size() {
    int count = 0;
    Node14 current = head;//baru14
    while (current != null) {
        count++;
        current = current.next;//baru14
    }
    return count;
    }
    public void getFirst() {//baru14
    if (isEmpty()) {
        System.out.println("List kosong.");
    } else {
        head.data.tampilInformasi();
    }
    }
//baru14
    public void getLast() {
    if (isEmpty()) {
        System.out.println("List kosong.");
    } else {//baru14
        tail.data.tampilInformasi();
    }
    }

    public void getIndex(int index) {
    if (index < 0) {//baru14
        System.out.println("Indeks tidak valid.");
        return;
    }
    Node14 current = head;
    int count = 0;//baru14
    while (current != null && count < index) {
        current = current.next;
        count++;
    }
    if (current != null) {
        current.data.tampilInformasi();//baru14
    } else {
        System.out.println("Indeks melebihi ukuran list.");
    }
    }
    public DoubleLL14() {
        head = null;
        tail = null;
    }
    public boolean isEmpty() {
        return head == null;
    }
    public void addFirst(Mahasiswa14 data) {
        Node14 nodeBaru = new Node14(data);
        if(isEmpty()) {
            head = tail = nodeBaru;
        }else{
            nodeBaru.next = head;
            head.prev = nodeBaru;
            head = nodeBaru;
        }
    }
    public void addLast(Mahasiswa14 data) {
        Node14 nodeBaru = new Node14(data);
        if (isEmpty()) {
            head = tail = nodeBaru;
        }else{
            tail.next = nodeBaru;
            nodeBaru.prev = tail;
            tail = nodeBaru;
        }
    }
    public void insertAfter(String keyNim, Mahasiswa14 data) {
        Node14 current = head;
    while (current != null && !current.data.nim.equals(keyNim)) {
        current = current.next;
    }
    if (current == null) {
        System.out.println("Node dengan NIM " + keyNim + " tidak ditemukan.");
        return;
    }

    Node14 newNode = new Node14(data);
    if (current == tail) {
        addLast(data);
    } else {
        newNode.next = current.next;
        newNode.prev = current;
        current.next.prev = newNode;
        current.next = newNode;
    }

    System.out.println("Data berhasil disisipkan setelah NIM " + keyNim);
    }
    public void print() {
        if(isEmpty()){
            System.out.println("Data Masih Kosong");
        }else{
            Node14 current = head;
            while (current != null) {
            current.data.tampilInformasi();
            current = current.next;
        }
        }
    }
    public void removeFirst() {
        if(isEmpty()) {
            System.out.println("List Kosong. tidak bisa dihapus");
            return;
        } 
        if(head == tail){
            head = tail = null;
        }else{
            head = head.next;
            head.prev = null;
        }
    }
    public void removeLast() {
       if (isEmpty()) {
            System.out.println("Linked List masih Kosong, tidak bisa dihapus!");
            return;
        }
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        } 
        System.out.println("Data berhasil dihapus");
    }
    public Node14 search(String nim){
        Node14 current = head;
        while (current != null) {
            if (current.data.nim.equalsIgnoreCase(nim)) {
                return current;
            }
            current = current.next;
            
        }
        return null;
        
    }
}

       
    
