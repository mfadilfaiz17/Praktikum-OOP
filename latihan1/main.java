package latihan1;

class Mahasiswa{
    String nama;
    String alamat;
    int nim;
    int umur;

    void tampilkan() {
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Umur: " + umur);
        System.out.println("NIM: " + nim);
    }

}

public class main {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();
        Mahasiswa mhs2 = new Mahasiswa();

        mhs1.nama = "Fadil Faiz";
        mhs1.nim = 1234;
        mhs1.alamat = "Jl. Merdeka No. 123";
        mhs1.umur = 20;

        mhs2.nama = "Zoraaaa";
        mhs2.nim = 7788;
        mhs2.alamat = "Jl. Kemerdekaan No. 456";
        mhs2.umur = 22;

        mhs1.tampilkan();
        System.out.println();
        mhs2.tampilkan();

        // System.out.println("Nama: " + mhs1.nama);
        // System.out.println("Alamat: " + mhs1.alamat);
        // System.out.println("Umur: " + mhs1.umur);
        // System.out.println("NIM: " + mhs1.nim);
        // System.out.println();
        
        // System.out.println("Nama: " + mhs2.nama);
        // System.out.println("Alamat: " + mhs2.alamat);
        // System.out.println("Umur: " + mhs2.umur);
        // System.out.println("NIM: " + mhs2.nim);
        // System.out.println();
    }
}