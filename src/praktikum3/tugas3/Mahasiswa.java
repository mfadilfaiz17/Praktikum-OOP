package praktikum3.tugas3;

public class Mahasiswa {
    String nama;
    int nim;
    String prodi;
    int nilaiAkhir;

    Mahasiswa(String nama, int nim, String prodi){
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
    }


    public void nilaiAkhir(int nilaiAkhir) {
        this.nilaiAkhir = nilaiAkhir;
    }

    public String tentukanGrade(){
        if (nilaiAkhir >= 85) {
            return "A";
        } else if (nilaiAkhir >= 70) {
            return "B";
        } else if (nilaiAkhir >= 60) {
            return "C";
        } else if (nilaiAkhir >= 50) {
            return "D";
        } else {
            return "E";
        }
    }

    public String statusKelulusan() {
        if (nilaiAkhir >= 70) {
            return "Lulus";
        } else {
            return "Tidak Lulus";
        }
    }

    void tampilkanData(){
        System.out.println("Nama        : " + nama);
        System.out.println("NIM         : " + nim);
        System.out.println("Prodi       : " + prodi);
        System.out.println("Nilai Akhir : " + nilaiAkhir);
        System.out.println("Grade       : " + tentukanGrade());
        System.out.println("Status      : " + statusKelulusan());
    }

}