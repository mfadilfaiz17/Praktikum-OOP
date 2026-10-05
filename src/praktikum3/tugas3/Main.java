package praktikum3.tugas3;

public class Main {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa("Van Persie", 2301001, "Teknik Informatika");
        Mahasiswa mhs2 = new Mahasiswa("Van Nistelrooy", 2301002, "Sistem Informasi");

        mhs1.nilaiAkhir(90);
        mhs2.nilaiAkhir(65);


        System.out.println("Data Mahasiswa 1:");
        mhs1.tampilkanData();
        System.out.println("======================");
        System.out.println("Data Mahasiswa 2:");
        mhs2.tampilkanData();
    }
}
