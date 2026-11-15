package quiz1;

public class Himatif extends HIMA {
    public Himatif(String nama, String nim, int tahunMasuk, String jabatan, int tahunBergabung) {
        super(nama, nim, "Teknik Informatika", tahunMasuk, "HIMATIF", jabatan, tahunBergabung);
    }
    @Override
    public void tampilkanProker() {
        System.out.println("Program Kerja  : Workshop jaringan komputer dan administrasi server.");
    }
}