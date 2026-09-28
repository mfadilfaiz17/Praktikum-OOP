package praktikum1;

class Buku {
    String judul;
    String penulis;
    int tahunterbit;

    void tampilkanInfo() {
        System.out.println();
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Tahun Terbit: " + tahunterbit);
    }
}

public class main {
    public static void main(String[] args) {
        Buku buku1 = new Buku();
        Buku buku2 = new Buku();

        buku1.judul = "Belajar Java untuk Pemula";
        buku1.penulis = "Fadil Faiz";
        buku1.tahunterbit = 2024;

        buku2.judul = "Pemrograman Untuk Sepuh";
        buku2.penulis = "Zora Jinpachi";
        buku2.tahunterbit = 2023;

        buku1.tampilkanInfo();
        buku2.tampilkanInfo();
        System.out.println();
    }
}