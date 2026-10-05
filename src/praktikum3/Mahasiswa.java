package praktikum3;

public class Mahasiswa {
    String nama;
    String nim;

    Mahasiswa(String nama, String nim){
        this.nama = nama;
        this.nim = nim;
    }

    void tampilkanData(){
        System.out.println("Nama : " + nama);
        System.out.println("NIM  : " + nim);
    }
}
