package praktikum3;

public class Main {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa("Bierhoff", "2301001");
        Mahasiswa mhs2 = new Mahasiswa("Cafu", "2301002");
        
        mhs1.tampilkanData();
        System.out.println("================");
        mhs2.tampilkanData();
    }
}
