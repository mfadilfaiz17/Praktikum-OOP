package praktikum2;

public class Mahasiswa {
    String nama;
    String nim;

    void tampilkanData(){
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
    }

    void sapa(String nama){
        System.out.println("Halo, " + nama);
    }

    String getNama(){
        return nama;
    }

    int hitungNilaiAkhir(int tugas, int uts, int uas){
        int nilaiAkhir = (tugas + uts + uas) / 3;
        return nilaiAkhir;
    }

    String tentukanGrade(int nilai){
        if (nilai >= 80) {
            return "A";
        } else if (nilai >= 70) {
            return "B";
        } else if (nilai >= 60) {
            return "C";
        } else if (nilai >= 50) {
            return "D";
        } else {
            return "E";
        }
    }
}