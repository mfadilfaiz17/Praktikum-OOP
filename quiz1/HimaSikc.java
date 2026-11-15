package quiz1;

public class HimaSikc extends HIMA {
    public HimaSikc(String nama, String nim, int tahunMasuk, String jabatan, int tahunBergabung) {
        super(nama, nim, "Sistem Informasi Kota Cerdas", tahunMasuk, "HIMA SIKC", jabatan, tahunBergabung);
    }
    @Override
    public void tampilkanProker() {
        System.out.println("Program Kerja  : Proyek Smart City dan integrasi data publik wilayah.");
    }
}