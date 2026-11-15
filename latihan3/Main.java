package latihan3;

class MahasiswaAktif extends Mahasiswa {
    private int semester;

    public MahasiswaAktif(String nama, String nim, double ipk, int semester) {
        super(nama, nim, ipk);
        this.semester = semester;
    }

    @Override
    public void tampilkanData() {
        super.tampilkanData();
        System.out.println("Status : Mahasiswa aktif");
        System.out.println("Semester : " + semester);
    }
}

public class Main {
    public static void main(String[] args) {
        MahasiswaAktif mahasiswa = new MahasiswaAktif(
                "Fadil Faiz", "2301001", 3.75, 4);

        mahasiswa.tampilkanData();
    }
}
