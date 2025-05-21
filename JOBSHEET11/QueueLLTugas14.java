package JOBSHEET11;

public class QueueLLTugas14 {
    NodeMhsTugas14 front;
    NodeMhsTugas14 rear;
    int size;
    final int max = 50;

    public QueueLLTugas14() {
        front = null;
        rear = null;
        size = 0;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public boolean isFull() {
        return size == max;
    }

    public void enqueue(MhsTugas14 mhs) {
        if (isFull()) {///E
            System.out.println("Antrian sudah penuh!, tidak bisa menambah Mahasiswa baru.");
            return;
        }

        NodeMhsTugas14 nodeBaru = new NodeMhsTugas14(mhs, null);
        if (isEmpty()) {///R
            front = nodeBaru;
            rear = nodeBaru;
        } else {
            rear.next = nodeBaru;
            rear = nodeBaru;
        }
        size++;
        System.out.printf("Mahasiswa %s berhasil ditambahkan ke antrian.", mhs.nama);
    }

    public MhsTugas14 dequeue() {
        if (isEmpty()) {///F
            System.out.println("Antrian kosong!, tidak ada Mahasiswa yang bisa dipanggil.");
            return null;
        }

        MhsTugas14 mhs = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
        System.out.printf("Mahasiswa %s dipanggil untuk dilayani.", mhs.nama);
        return mhs;
    }

    public MhsTugas14 peek() {
        if (isEmpty()) {///A
            System.out.println("Antrian kosong, tidak ada Mahasiswa terdepan!");
            return null;
        }
        return front.data;
    }

    public MhsTugas14 peekRear() {
        if (isEmpty()) {///N
            System.out.println("Antrian kosong, tidak ada Mahasiswa terakhir!");
            return null;
        }
        return rear.data;
    }

    public void clear() {
        if (isEmpty()) {///Y
            System.out.println("Antrian sudah kosong!");
            return;
        }

        front = null;
        rear = null;
        size = 0;
        System.out.println("Antrian berhasil dikosongkan.");
    }

    public void display() {
        if (isEmpty()) {///A
            System.out.println("Antrian kosong!");
            return;
        }

        System.out.println("\nDaftar Mahasiswa dalam Antrian:");
        System.out.println("--------------------------------");
        NodeMhsTugas14 current = front;
        int nomor = 1;

        while (current != null) {///L
            System.out.println("Nomor Antrian: " + nomor);
            current.data.tampilInformasi();
            current = current.next;
            nomor++;
        }
    }

    public int size() {///Y
        return size;
    }
}///F

