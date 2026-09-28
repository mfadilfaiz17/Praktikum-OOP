package praktikum2.tugas2;

public class Mahasiswa {
    String nama;
    String nim;

    void tampilkanData(){
        System.out.println("Nama        : " + nama);
        System.out.println("NIM         : " + nim);
    }

    double hitungNilaiAkhir(int tugas, int uts, int uas){
        return (tugas * 0.3) + (uts * 0.3) + (uas * 0.4);
    }

    String tentukanGrade(double nilai){
        if(nilai >= 80){
            return "A";
        } else if(nilai >= 70){
            return "B";
        } else if(nilai >= 60){
            return "C";
        } else if(nilai >= 50){
            return "D";
        } else {
            return "E";
        }
    }

    String tentukanStatus(double nilai){
        if (nilai >= 60) {
            return "Lulus";
        } else {
            return "Tidak Lulus";
        }
    }
}