package JOBSHEET10.P2JOBSHEET10;

public class AntrianLayanan14 {
    Mahasiswa14[] data;
    int front;
    int rear;
    int size;
    int max;

    public AntrianLayanan14(int max) {
        this.max = max;
        this.data = new Mahasiswa14[max];
        this.front = 0;
        this.rear = -1;
        size = 0;
    }
    public boolean isEmpty() {
        if(size == 0) {
            return true;
        }else{
            return false;
        }
    }
    public boolean isFull() {
        if(size == max) {
            return true;
        }else {
            return false;
        }
    }
    public void peek() {
        if(!isEmpty()) {
            System.out.println("Elemen Terdepan: " + data[front]);
        }else{
            System.out.println("Queue Masih Kosong");
        }
    }
    public void print() {
        if(isEmpty()) {
            System.out.println("Queue Masih Kosong");
        }else{
            int i = front;
            while (i != rear) {
                System.out.print(data[i] + " ");
                i = (i+1) % max;
            }
            System.out.println(data[i] + " ");
            System.out.println("Jumlah Elemen = " + size);
        }
    }
    public void clear() {
        if(!isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue Berhasil Dikosongkan");
        }else{
            System.out.println("Queue Masih Kosong");
        }
    }
    public void Enqueue(Mahasiswa14 dt) {
        if(isFull()) {
            System.out.println("Queue Sudah Penuh");
        }else{
            if(isEmpty()) {
                front = rear = 0;
            }else{
                if (rear == max -1) {
                    rear = 0;
                }else{
                    rear++;
                }
            }
            data[rear] = dt;
            size++;
        }
    } 
    public void tambahAntrian(Mahasiswa14 mhs) {
        if(isFull()) {
            System.out.println("Antrian penuh, tidak dapat menambah mahasiswa");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama+" Berhasil masuk ke antrian");
    }
    public Mahasiswa14 layaniMahasiswa() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return null;
        }
        Mahasiswa14 mhs = data[front];
        front = (front + 1) % max;
        size--;
        return mhs;
    }
    public void lihatTerdepan() {
        if(isEmpty()) {
            System.out.println("Antrian Kosong");
        }else {
            System.out.println("Mahasiswa Terdepan: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[front].tampilkanData();
        }
    }
    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian Kosong");
            return;
        }
        System.out.println("Daftar Mahasiswa dalam Antrian: ");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        for(int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.println((i+1) + " . ");
            data[index].tampilkanData();
        }
    }
    public int getJumlahAntrian(){
        return size;
    }
    public void lihatAkhir(){
        if(isEmpty()) {
            System.out.println("Antrian Kosong");
        }else{
            System.out.println("Mahasiswa Belakang: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[rear].tampilkanData();
        }
    }
}