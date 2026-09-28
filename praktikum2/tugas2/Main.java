package praktikum2.tugas2;

public class Main {
    public static void main(String[] args){
        Mahasiswa mhs1 = new Mahasiswa();

        System.out.println();
        mhs1.nama = "Cristiano Ronaldo";
        mhs1.nim = "777777";
        mhs1.tampilkanData();

        double nilai = mhs1.hitungNilaiAkhir(85, 85, 90);
        System.out.println("Nilai Akhir : " + nilai);
        System.out.println("Grade       : " + mhs1.tentukanGrade(nilai));
        System.out.println("Status      : " + mhs1.tentukanStatus(nilai));
        System.out.println("================================");

        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.nama = "Zidane Zidan";
        mhs2.nim = "10101010";
        mhs2.tampilkanData();

        double nilai2 = mhs2.hitungNilaiAkhir(60, 40, 70);
        System.out.println("Nilai Akhir : " + nilai2);
        System.out.println("Grade       : " + mhs2.tentukanGrade(nilai2));
        System.out.println("Status      : " + mhs2.tentukanStatus(nilai2));
        System.out.println("================================");

    }
}