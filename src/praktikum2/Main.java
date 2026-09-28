package praktikum2;

public class Main {
    public static void main(String[] args){

        Mahasiswa mhs1 = new Mahasiswa();

        mhs1.nama = "M. Fadil Faiz";
        mhs1.nim = "2509005";
        
        System.out.println();
        mhs1.tampilkanData();
        mhs1.sapa(mhs1.nama);
        System.out.println("Nama Mahasiswa: " + mhs1.getNama());

        int nilai = mhs1.hitungNilaiAkhir(90, 75, 90);
        System.out.println("Nilai Akhir: " + nilai);

        String grade = mhs1.tentukanGrade(nilai);
        System.out.println("Grade: " + grade);
    }
}