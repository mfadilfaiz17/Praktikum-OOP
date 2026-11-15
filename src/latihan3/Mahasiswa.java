package latihan3;

public class Mahasiswa {
    protected String nama;
    protected String nim;
    protected double ipk;

    public Mahasiswa(String nama, String nim, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.ipk = ipk;
    }

    public void tampilkanData() {
        System.out.println("Nama : " + nama);
        System.out.println("NIM  : " + nim);
        System.out.println("IPK  : " + ipk);
    }
}
